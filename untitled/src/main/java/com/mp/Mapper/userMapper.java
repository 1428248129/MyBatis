package com.mp.Mapper;


import com.mp.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface userMapper {
//    查询所有
    List<User> select();
//      查询详情
    List<User> selectById(int id);

//    多条件查询
//    零散参数
    List<User> dtjcx(@Param("status")int status,@Param("company_name")String company_name,@Param("brand_name") String brand_name);
//    实体类对象
//    List<User> dtjcx(User user);
//    map集合
//    List<User> dtjcx(Map map);

//    动态查询companyName===brandName
List<User> dtcx(@Param("companyName") String companyName, @Param("brandName") String brandName);

//  添加
    int add(User user);

//    修改
    int update(User user);

//    动态修改
    int dtupdate(User user);

//    删除
    int delete(int id);

//    批量删除
    int deleteById(int[] ids);


}



