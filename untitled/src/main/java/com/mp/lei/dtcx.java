package com.mp.lei;

import com.mp.Mapper.userMapper;
import com.mp.pojo.User;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;
import java.util.*;

/**动态查询*/
public class dtcx {
    private SqlSession sqlSession() throws IOException {
        HQsqlSession sqlSession = new HQsqlSession();
        SqlSession sqlSession1 = sqlSession.fhsqlSession();
        return sqlSession1;
    }
    public List<User> a() throws IOException {
        ArrayList<Object> cx = cx();
        String company_name = (String) cx.get(0);
        String brand_name = (String) cx.get(1);
        SqlSession sqlSession = sqlSession();
//        获取对应的userMapper接口的代理对象
        userMapper mapper = sqlSession.getMapper(userMapper.class);
//        拿着获取到的userMapper代理对象去执行sql
        List<User> select = mapper.dtcx(company_name,brand_name);
        sqlSession.close();
        return select;
    }
    public static ArrayList<Object> cx() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入公司名称（null拒签）：");
        String brand_name = scanner.next();
        System.out.println("请输入公司简称（null拒签）：");
        String company_name = scanner.next();
        if (brand_name.equals("null")) {
            brand_name = null;
        }
        if (company_name.equals("null")) {
            company_name = null;
        }
        ArrayList<Object> dx1 = new ArrayList<>();
        dx1.add(company_name);
        dx1.add(brand_name);
        return dx1;
    }

}
