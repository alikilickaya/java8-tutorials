package main.java.model;

import java.time.LocalDate;

public class Person {

    public Person(String name, int age, Sex gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public enum Sex {
        MALE, FEMALE
    }

    private String name;
    private int age;
    private Sex gender;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Sex getGender() {
        return gender;
    }

    public void setGender(Sex gender) {
        this.gender = gender;
    }

    public void printPerson() {
        System.out.println("Name: " + name + " - " + "Age: " + age);
    }

}
