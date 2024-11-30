package com.mp.lei;

import com.mp.Mapper.userMapper;
import com.mp.pojo.User;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;
import java.util.*;

/**条件查询*/
public class tjcx {
//    创建对象去HQsqlSession.java类中获取sqlSession对象
    private SqlSession sqlSession() throws IOException {
        HQsqlSession dx1 = new HQsqlSession();
        SqlSession sqlSession = dx1.fhsqlSession();
        return sqlSession;
    }
//
    private  List tjcx(ArrayList cx) throws IOException {
//        sqlSession对象
        SqlSession sqlSession = sqlSession();
//        获取输入内容
//        这个是直连，需要准确
        int stat = (int) cx.get(0);
//        模糊查询，不需要太精确
        String company_name = (String) cx.get(1);
        String brand_name = (String) cx.get(2);

//        第一种参数传递，散装数据
//        处理参数
        company_name = "%" + company_name + "%";
        brand_name = "%" + brand_name + "%";

//        第二种参数传递，对象
        User user = new User();
        user.setStatus(stat);
        user.setCompany_name(company_name);
        user.setBrand_name(brand_name);


//        第三种参数传递，Map集合
        Map map = new HashMap<>();
        map.put("status", 1);
        map.put("company_name", company_name);
        map.put("brand_name", brand_name);


//        获取userMapper接口处理对象
        userMapper userMapper = sqlSession.getMapper(userMapper.class);
//        执行方法
//        第一种，零散数据
        List<User> dtjcx = userMapper.dtjcx(stat, company_name, brand_name);

//        第二种，对象
//        List<User> dtjcx = userMapper.dtjcx(user);

//        第三种
//        List<User> dtjcx = userMapper.dtjcx(map);
        return dtjcx;
    }
    public  void tjcxfh() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入公司状态（整数）：");
        int stat = scanner.nextInt();
        System.out.println("请输入公司名称：");
        String brand_name = scanner.next();
        System.out.println("请输入公司简称：");
        String company_name = scanner.next();
        ArrayList<Object> dx1 = new ArrayList<>();
        dx1.add(stat);
        dx1.add(company_name);
        dx1.add(brand_name);
        List tjcx = tjcx(dx1);
        System.out.println(tjcx);
        System.out.println("查询长度："+tjcx.size());
    }
}
