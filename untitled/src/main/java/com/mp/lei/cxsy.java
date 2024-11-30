package com.mp.lei;

import com.mp.Mapper.userMapper;
import com.mp.pojo.User;
import org.apache.ibatis.session.SqlSession;
import java.io.IOException;
import java.util.List;
/**查询所有*/
public class cxsy {
    //    创建对象去HQsqlSession.java类中获取sqlSession对象
    private SqlSession sqlSession() throws IOException {
        HQsqlSession dx1 = new HQsqlSession();
        SqlSession sqlSession = dx1.fhsqlSession();
        return sqlSession;
    }
//    获取数据并返回main方法
    private List<User> hqsy() throws IOException {
//        获取sqlSession对象
        SqlSession sqlSession = sqlSession();
//        获取对应的userMapper接口的代理对象
        userMapper mapper = sqlSession.getMapper(userMapper.class);
//        拿着获取到的userMapper代理对象去执行sql
        List<User> select = mapper.select();
        sqlSession.close();
        return select;
    }
    public void fhsy() throws IOException {
        List<User> hqsy = hqsy();
        System.out.println(hqsy);
        System.out.println("查询长度："+hqsy.size());
    }

}
