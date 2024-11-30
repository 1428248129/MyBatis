package com.mp.lei;

import com.mp.Mapper.userMapper;
import com.mp.pojo.User;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class cxxq {
    /**查询详情，使用id查询*/
//    创建对象去HQsqlSession.java类中获取sqlSession对象
    private SqlSession sqlSession() throws IOException {
        HQsqlSession dx1 = new HQsqlSession();
        SqlSession sqlSession = dx1.fhsqlSession();
        return sqlSession;
    }
//    获取数据并返回main方法
    private  List<User> cdxx(int id) throws IOException {
        //        获取sqlSession对象
        SqlSession sqlSession = sqlSession();
//        获取对应的userMapper接口的代理对象
        userMapper mapper = sqlSession.getMapper(userMapper.class);
//        拿着获取到的userMapper代理对象去执行sql
        List<User> select = mapper.selectById(id);
        sqlSession.close();
        return select;
    }
    public  void cxsyfh() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入查询编号：");
        int cx = scanner.nextInt();
        List<User> cxdg = cdxx(cx);
        if (cxdg.size()!=0){
            System.out.println(cxdg);
        }else{
            System.out.println("ID错误："+cx);
        }
    }



}
