package com.tuanvt.springboot.day01_debugger;

public class Day1Debugger {

    public static void main(String[] args) {
        int myAge = 20;
        User myUser = new User("Alice", 20);

        System.out.println("Before - Age: " + myAge + ", User Name: " + myUser.getName());

        processData(myUser, myAge);

        System.out.println("After - Age: " + myAge + ", User Name: " + myUser.getName());
    }

    public static void processData(User u, int age) {
        u.setName("Bob_Hacked");
        age = 99;

        // Em sẽ đặt Breakpoint ở dòng lệnh if này (Click chuột vào lề trái của dòng code để hiện chấm đỏ)
        if (age == 99) {
            System.out.println("Processing inside if-block");
        }
    }
}

class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}
