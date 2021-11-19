package com.xia.pojo;

public class HelloT {
    private String name;

    public HelloT() {
        System.out.println("name:"+name);
    }

    public HelloT(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "HelloT{" +
                "name='" + name + '\'' +
                '}';
    }

    public void show(){
        System.out.println("name:"+name);
    }
}
