package com.mp.lei;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class HQsqlSession {
//    获取sqlSession
    private SqlSession hq() throws IOException {
        //        1、加载mp核心配置文件，获取一个SqlSessionFactory对象
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //        2获取SqlSession对象，用它来执行sql
        SqlSession sqlSession = sqlSessionFactory.openSession();
        return sqlSession;
    }
    public SqlSession fhsqlSession() throws IOException {
        SqlSession hq = hq();
        return hq;
    }
}
