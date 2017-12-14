package main.java.approaches.lambda;

import main.java.model.Person;
import main.java.util.Data;

import java.util.List;
import java.util.function.Predicate;

public class Approach6 {
    public static void main(String[] args) {
        Approach6 app = new Approach6();
        app.run();
    }

    private void run() {
        printPersonsWithPredicate(Data.getRoster(), p -> p.getGender() == Person.Sex.MALE
                && p.getAge() >= 18
                && p.getAge() <= 25
        );
    }

    private void printPersonsWithPredicate(List<Person> roster, Predicate<Person> tester) {
        for (Person p : roster) {
            if (tester.test(p)) {
                p.printPerson();
            }
        }
    }
}
