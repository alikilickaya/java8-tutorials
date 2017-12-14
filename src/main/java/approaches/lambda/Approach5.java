package main.java.approaches.lambda;

import main.java.function.CheckPerson;
import main.java.model.Person;
import main.java.util.Data;

import java.util.List;

public class Approach5 {
    public static void main(String[] args) {
        Approach5 app = new Approach5();
        app.run();
    }

    private void run() {
        printPersons(Data.getRoster(), (Person p) -> p.getGender() == Person.Sex.MALE
                && p.getAge() >= 18
                && p.getAge() <= 25
        );
    }

    private void printPersons(List<Person> roster, CheckPerson tester) {
        for (Person p : roster) {
            if (tester.test(p)) {
                p.printPerson();
            }
        }
    }
}
