package main.java.util;

import main.java.model.Person;

import java.util.ArrayList;
import java.util.List;

public class Data {

    public static List<Person> roster = new ArrayList<>();

    public static List<Person> getRoster() {
        fillRoster();
        return roster;
    }

    private static void fillRoster() {
        Person p1 = new Person("Ali", 28, Person.Sex.MALE);
        Person p2 = new Person("Marko", 35, Person.Sex.MALE);
        Person p3 = new Person("Kaan", 20, Person.Sex.MALE);
        Person p4 = new Person("Yousef", 22, Person.Sex.MALE);
        Person p5 = new Person("Leonard", 24, Person.Sex.MALE);
        Person p6 = new Person("Steven", 27, Person.Sex.MALE);
        Person p7 = new Person("Omar", 29, Person.Sex.MALE);
        Person p8 = new Person("Jincy", 30, Person.Sex.FEMALE);
        Person p9 = new Person("Ayse", 23, Person.Sex.FEMALE);
        Person p10 = new Person("Melanie", 31, Person.Sex.FEMALE);
        roster.add(p1);
        roster.add(p2);
        roster.add(p3);
        roster.add(p4);
        roster.add(p5);
        roster.add(p6);
        roster.add(p7);
        roster.add(p8);
        roster.add(p9);
        roster.add(p10);
    }
}
