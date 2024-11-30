# MyBatis
### 用纯java启动
启动目录：
untitled\src\main\java\Main.java
### 增删改查目录：
untitled\src\main\java\com\mp\lei
### mapper：
untitled\src\main\java\com\mp\Mapper\userMapper.java
### 编写项目时
  编写项目时数据库所用MySQL
  MySQL版本8.0
  项目中mysql连接数据库名为：mp
  账号:root
  密码：000000
  端口号：3306
  连接网址：jdbc:mysql://localhost:3306/mp
### 各依赖:
```xml
 <dependencies>
<!--    mybatis-->
    <dependency>
      <groupId>org.mybatis</groupId>
      <artifactId>mybatis</artifactId>
      <version>3.5.13</version>
    </dependency>
    <dependency>
<!--      junit 单元测试-->
      <groupId>junit</groupId>
      <artifactId>junit</artifactId>
      <version>3.8.1</version>
      <scope>test</scope>
    </dependency>
<!--    mysql-->
    <dependency>
      <groupId>mysql</groupId>
      <artifactId>mysql-connector-java</artifactId>
      <version>8.0.26</version>
    </dependency>
<!--   slf4j -->
    <dependency>
      <groupId>org.slf4j</groupId>
      <artifactId>slf4j-api</artifactId>
      <version>1.7.36</version>
    </dependency>
<!--    logback-classic-->
    <dependency>
      <groupId>ch.qos.logback</groupId>
      <artifactId>logback-classic</artifactId>
      <version>1.2.12</version>
    </dependency>
<!--    logback-core-->
    <dependency>
      <groupId>ch.qos.logback</groupId>
      <artifactId>logback-core</artifactId>
      <version>1.2.12</version>
    </dependency>
      <dependency>
          <groupId>junit</groupId>
          <artifactId>junit</artifactId>
          <version>RELEASE</version>
          <scope>compile</scope>
      </dependency>
  </dependencies>
```
