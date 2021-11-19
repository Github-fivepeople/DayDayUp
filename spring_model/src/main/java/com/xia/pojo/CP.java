package com.xia.pojo;

public class CP {
    private String name;
    private String age;

    public CP() {
    }

    public CP(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "CP{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
