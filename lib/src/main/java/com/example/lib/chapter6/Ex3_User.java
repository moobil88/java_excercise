package com.example.lib.chapter6;

public class Ex3_User {
    public Ex3_User(){
    }

    public Ex3_User(String name, String location, int age) {
        this.name = name;
        this.location = location;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String name;
    private String location;
    private int age;


    public void readBook(Ex3_Book book)
    {
        System.out.println(book.getTitle());

    }



    @Override
    public String toString() {
        return "Ex3_User{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", age=" + age +
                '}';
    }



}
