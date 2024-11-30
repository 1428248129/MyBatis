package com.mp.lei;

import com.mp.Mapper.userMapper;
import com.mp.pojo.User;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

/**所有修改*/
public class xg {
    //    创建对象去HQsqlSession.java类中获取sqlSession对象
    private SqlSession sqlSession() throws IOException {
        HQsqlSession dx1 = new HQsqlSession();
        SqlSession sqlSession = dx1.fhsqlSession();
        return sqlSession;
    }

    public String xg() throws IOException {
//        获取修改后的内容
        User user = tjsj();
//        获取sqlSession
        SqlSession sqlSession = sqlSession();
//        获取mapper接口
        userMapper mapper = sqlSession.getMapper(userMapper.class);
        int update = 10;
        String jg = "";
        update = mapper.update(user);
        if(update == 1){
            jg = "修改成功："+update;
        }if(update == 2){
            jg = "修改失败："+update;
        }
//        提交事务
        sqlSession.commit();
//        关闭资源
        sqlSession.close();
        return jg;
    }

//    修改前用id查询一下
    private User tjsj() throws IOException {
        Scanner scanner = new Scanner(System.in);
//             values(#{brand_name},#{company_name},#{ordered},#{description},#{status})
        User user = new User();
        while (true){
            System.out.print("请输入更改id：");
            int id = scanner.nextInt();
            user.setId(id);
            {
                SqlSession sqlSession = sqlSession();
                userMapper mapper = sqlSession.getMapper(userMapper.class);
                List<User> update = mapper.selectById(id);
                if (update.size() == 0){
                    System.out.println("无法找到数据");
                    break;
                }else{
                    System.out.println(update);
                }
//             关闭资源
                sqlSession.close();
            }
            System.out.print("请输入公司简称:");
            user.setBrand_name(scanner.next());
            System.out.print("请输入公司全称:");
            user.setCompany_name(scanner.next());
            System.out.print("请输入公司人数:");
            user.setOrdered(scanner.next());
            System.out.print("请输入公司广告:");
            user.setDescription(scanner.next());
            System.out.print("请输入公司状态:");
            user.setStatus(scanner.nextInt());
            return user;
        }
        return user;
    }
}