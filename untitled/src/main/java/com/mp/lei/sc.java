package com.mp.lei;

import com.mp.Mapper.userMapper;
import org.apache.ibatis.session.SqlSession;
import java.io.IOException;
import java.util.Scanner;

/**根据id删除一个数据*/
public class sc {
    //    创建对象去HQsqlSession.java类中获取sqlSession对象
    private SqlSession sqlSession() throws IOException {
        HQsqlSession dx1 = new HQsqlSession();
        SqlSession sqlSession = dx1.fhsqlSession();
        userMapper mapper = sqlSession.getMapper(userMapper.class);
        return sqlSession;
    }
    public int sc() throws IOException {
//      获取需要删除的id
        int id = scid();
        SqlSession sqlSession = sqlSession();
//        获取userMapper接口处理对象
        userMapper mapper = sqlSession.getMapper(userMapper.class);
//        执行删除方法
        int delete = mapper.delete(id);
//        提交事务
        sqlSession.commit();
//        释放资源
        sqlSession.close();
//        返回执行结果
        return delete;
    }
private int scid() throws IOException {
    Scanner scanner = new Scanner(System.in);
    System.out.println("请输入需要删除的id");
    int id = scanner.nextInt();
    return id;
}

}
