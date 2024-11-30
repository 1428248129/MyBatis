import com.mp.lei.*;
import com.mp.pojo.User;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Main {
    /**
     * 使用mapper的要求：
     * 1、定义与SQL映射文件同名的Mapper接口，并且将Mapper接口和SQL映射文件放置在同一目录下
     *          com/mp/Mapper/userMapper.xml
     * 2、设置SQL映射文件的namespace属性为Mapper接口全限定名
     *          com/mp/Mapper/userMapper.xml
     * 3、在 Mapper 接口中定义方法，方法名就是SQL映射文件中sql语句的id，并保持参数类型和返回值类型一致
     *          com/mp/Mapper/userMapper.java
     * 4、编码
     *             java
     * 4.1、通过 SqlSession 的 getMapper方法获取 Mapper接囗的代理对象
     *              com/mp/lei/lei.java
     * 4.2、调用对应方法完成sql的执行
     *              com/mp/lei/lei.java*/


    public static void main(String[] args) throws IOException {
//        输入需使用的对象
        Scanner scanner = new Scanner(System.in);
//        创建类对象准备运行里面的代码
//        查询所有
        cxsy cxsy = new cxsy();
//        查询详情
        cxxq cxxq = new cxxq();
//        条件查询
        tjcx tjcx = new tjcx();
//            动态查询
        dtcx dtcx = new dtcx();
//            修改
        xg xg = new xg();
//            动态修改
        dtxg dtxg = new dtxg();
//            删除
        sc sc = new sc();
//            多id删除
        plsc plsc = new plsc();
//        添加

        tj tj = new tj();
        System.out.println("1：获取所有\n2、获取单个\n3、多条件查询\n4、动态查询\n5、修改\n6、动态修改\n" +
                "7、删除\n8、批量删除\n9、添加:");
        int xz = scanner.nextInt();
        if (xz==1){
//            查询所有
            cxsy.fhsy();
        } else if (xz==2) {
//            id获取单个
            cxxq.cxsyfh();
        } else if (xz==3) {
//            多条件查询
            tjcx.tjcxfh();
        } else if (xz==4) {
//            动态查询
            List<User> a = dtcx.a();
            System.out.println(a);
        }else if (xz==5) {
//            修改
            String xg1 = xg.xg();
            System.out.println(xg1);
        } else if (xz == 6) {
//            动态修改
            String xgg = dtxg.xg();
            System.out.println(xgg);
        }else if (xz==7) {
//            删除
            int sc1 = sc.sc();
            System.out.println(sc1);
        }else if (xz==8) {
//            多id删除
            int dsc = plsc.sc();
            System.out.println(dsc);
        }else if (xz==9) {
//            添加
            tj.add();
        }
        else{
            System.out.println("输入有误");
        }
    }

}
