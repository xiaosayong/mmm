package com.example.JavaBeanDemo;

public class JavaBeanDemo {
    private String sex;
    private String name;

    public JavaBeanDemo() {
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "JavaBeanDemo{" +
                "age=" + sex +
                ", name='" + name + '\'' +
                '}';
    }
}
