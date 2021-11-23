### 常用依赖

_**Spring架包**_
``` xml
    <dependencies>
       <dependency>
           <groupId>org.springframework</groupId>
           <artifactId>spring-webmvc</artifactId>
           <version>5.3.2</version>
       </dependency>
       <!--<dependency>-->
           <!--<groupId>junit</groupId>-->
           <!--<artifactId>junit</artifactId>-->
           <!--<version>4.12</version>-->
       <!--</dependency>-->
   </dependencies>
   ```
   
_**bean.xml**_
```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:context="http://www.springframework.org/schema/context"
       xmlns:p="http://www.springframework.org/schema/p"
       xmlns:c="http://www.springframework.org/schema/c"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
        http://www.springframework.org/schema/beans/spring-beans.xsd
        http://www.springframework.org/schema/context
        http://www.springframework.org/schema/context/spring-context.xsd
        http://www.springframework.org/schema/aop
        http://www.springframework.org/schema/aop/spring-aop.xsd">

    <!--xmlns:p="http://www.springframework.org/schema/p"     P命名空间 : 添加约束-->

    <!--
        id : bean 的唯一标识符,也就是相当于我们学的对象名
        class : bean 对象所对应的全限定名: 包名 + 类型
        name : 也是别名, 而且name可以同时拥有多个别名, 分隔符可以是空格 逗号 分号
        scope : singleton-单例模式  prototype-多例模式 request  session
    -->

    <!--支持注解的声明 不配置的话 会 Exception in thread "main" java.lang.NullPointerException-->
    <context:component-scan base-package="liao.myspring.pojo"/>
    <context:annotation-config></context:annotation-config><!--等价于 <context:annotation-config/>-->

    <bean id="dog" class="com.xia.pojo.autowired.Dog"/>
    <bean id="cat" class="com.xia.pojo.autowired.Cat"/>
    <bean id="people" class="com.xia.pojo.autowired.People"/>
</beans>
```


##注解依赖
@Nullable 字段标记了这个注解的,说明这个字段可以为null  

@Autowired : 自动装配通过类型(默认)/名字.  如果显示定义了Autowired的required属性为false,说明这个对象可以为null,否则不允许为空

@Qualifier 搭配使用  多个bean的时候,可以使用@qualifier来指定一个bean来注入

还有@Resource (也是能实现自动装配 java注解)  
@Resource(name = "") 有自动装配byName和byType 都找不到适合的注入Bean 会报错

@Component:组件, 放在类上, 说明