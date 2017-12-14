package main.java.approaches.java7;

import main.java.model.Person;
import main.java.util.Data;

import java.util.List;

public class Approach2 {
    public static void main(String[] args) {
        printPersonsWithinAgeRange(Data.getRoster(), 23, 30);
    }

    public static void printPersonsWithinAgeRange(
            List<Person> roster, int low, int high) {
        for (Person p : roster) {
            if (low <= p.getAge() && p.getAge() < high) {
                p.printPerson();
            }
        }
    }
}
