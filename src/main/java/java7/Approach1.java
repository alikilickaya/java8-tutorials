package main.java.java7;

import main.java.model.Person;
import main.java.util.Data;

import java.util.Date;
import java.util.List;

public class Approach1 {
    public static void main(String[] args) {
        printPersonsOlderThan(Data.getRoster(), 30);
    }

    public static void printPersonsOlderThan(List<Person> roster, int age) {
        for (Person p : roster) {
            if (p.getAge() >= age) {
                p.printPerson();
            }
        }
    }
}
