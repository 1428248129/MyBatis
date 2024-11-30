package com.mp.lei;


import com.mp.Mapper.userMapper;
import com.mp.pojo.User;
import org.apache.ibatis.session.SqlSession;
import java.io.IOException;
import java.util.Scanner;

/**添加操作*/
public class tj {

        //    创建对象去HQsqlSession.java类中获取sqlSession对象
        private SqlSession sqlSession() throws IOException {
            HQsqlSession dx1 = new HQsqlSession();
            SqlSession sqlSession = dx1.fhsqlSession();
            return sqlSession;
        }
        public void add() throws IOException {
//            拾取添加数据
            User user = tjsj();
            SqlSession sqlSession = sqlSession();
            userMapper mapper = sqlSession.getMapper(userMapper.class);
            int add = mapper.add(user);
//            提交事务，不提交会显示添加成功但其实是添加失败
            sqlSession.commit();
//            释放资源
            sqlSession.close();
            System.out.println(add);
        }

//        添加数据
    private User tjsj(){
        Scanner scanner = new Scanner(System.in);
        User user = new User();
//             values(#{brand_name},#{company_name},#{ordered},#{description},#{status})
        System.out.print("请输入公司简称（输入null拒填）:");
        String brandName = scanner.next();
        System.out.print("请输入公司全称（输入null拒填）:");
        String companyName = scanner.next();
        System.out.print("请输入公司人数（输入null拒填）:");
        String numberOfEmployees = scanner.next();
        System.out.print("请输入公司广告（输入null拒填）:");
        String description = scanner.next();
        System.out.print("请输入公司状态（ 固定需写）:");
        int status = scanner.nextInt();


        user.setDescription(description);
        user.setOrdered(numberOfEmployees);
        user.setCompany_name(companyName);
        user.setBrand_name(brandName);
        user.setStatus(status);
            return user;
    }
}
