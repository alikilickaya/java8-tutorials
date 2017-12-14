package main.java.approaches.lambda;

import main.java.model.Person;
import main.java.util.Data;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Approach7 {
    public static void main(String[] args) {
        Approach7 app = new Approach7();
        app.run();
    }

    private void run() {
        processPersons(Data.getRoster(),
                p -> p.getGender() == Person.Sex.MALE
                        && p.getAge() >= 18
                        && p.getAge() <= 25,
                p -> p.printPerson()
        );
    }

    private static void processPersons(
            List<Person> roster,
            Predicate<Person> tester,
            Consumer<Person> block) {
        for (Person p : roster) {
            if (tester.test(p)) {
                block.accept(p);
            }
        }
    }
}
