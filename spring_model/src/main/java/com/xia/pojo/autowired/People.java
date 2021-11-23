package com.xia.pojo.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.Resource;

public class People {

    //直接在属性上使用,也可以在set方法上使用
    //使用Autowired可以不使用set方法 前提是你这个自动装配的属性在IOC(spring)容器中存在,且符合名字byName
    /**
     * 科普:
     *      @Nullable 字段标记了这个注解的,说明这个字段可以为null
     *
     *      @Autowired
     *      如果显示定义了Autowired的required属性为false,说明这个对象可以为null,否则不允许为空
     *
     *      @Qualifier 搭配使用  多个bean的时候,可以使用@qualifier来指定一个bean来注入
     *
     *      还有@Resource (也是能实现自动装配 java注解)
     *      @Resource(name = "") 有自动装配byName和byType 都找不到适合的注入Bean 会报错
     */
    @Autowired

    private Cat cat;
    @Autowired
    //@Qualifier(value = "dog")
    private Dog dog;
    private String name;

    public People() {
    }

    public People(Cat cat, Dog dog, String name) {
        this.cat = cat;
        this.dog = dog;
        this.name = name;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "People{" +
                "cat=" + cat +
                ", dog=" + dog +
                ", name='" + name + '\'' +
                '}';
    }
}
