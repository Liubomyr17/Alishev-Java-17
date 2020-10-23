package com.company;


public class Solution {
    public static void main(String[] args){
        Person person1 = new Person();
        person1.setNameAndAge("Roman", 20);
        Person person2 = new Person();
        String s1 = "Volodymyr";
        person2.setNameAndAge(s1, 20);
        person1.speak();
        person2.speak();
    }
}

class Person {
    // Дані (поля)
    // Дії (методи)
    String name;
    int age;

//    void setName(String username) {
//        name = username;
//    }
    void setNameAndAge(String username, int userage) {
        name = username;
        age = userage;
    }

    int calculateYearsToRetirement() {
        int years = 65 - age;
        return years;
     }

    void speak() {
        for (int i = 0; i < 3; i++) {
            System.out.println("My name is " + name + "," + " I'm " + age + " years old!");
        }
    }
        void sayHello() {
            System.out.println("Hello!");

        }

}