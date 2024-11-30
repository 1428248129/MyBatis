package com.mp.lei;

import com.mp.Mapper.userMapper;
import org.apache.ibatis.session.SqlSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**根据id删除多个数据*/
public class plsc {
    //    创建对象去HQsqlSession.java类中获取sqlSession对象
    private SqlSession sqlSession() throws IOException {
        HQsqlSession dx1 = new HQsqlSession();
        SqlSession sqlSession = dx1.fhsqlSession();
        userMapper mapper = sqlSession.getMapper(userMapper.class);
        return sqlSession;
    }
    public int sc() throws IOException {
        int[] ids = scid();
        SqlSession sqlSession = sqlSession();
//        获取userMapper接口处理对象
        userMapper mapper = sqlSession.getMapper(userMapper.class);
//        执行删除方法
        int delete = mapper.deleteById(ids);
//        提交事务
        sqlSession.commit();
//        释放资源
        sqlSession.close();
//        返回执行结果
        return delete;
    }
    private int[] scid() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入需要删除的个数：");
        int count = scanner.nextInt();
        int[] ids = new int[count];

        System.out.println("请输入要删除的ID：");
        for (int i = 0; i < count; i++) {
            ids[i] = scanner.nextInt();
        }

        return ids;
    }


}

