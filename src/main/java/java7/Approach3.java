package main.java.java7;

import main.java.function.CheckPerson;
import main.java.model.Person;
import main.java.util.Data;

import java.util.List;

public class Approach3 {
    public static void main(String[] args) {

        Approach3 app = new Approach3();
        app.run();
    }

    private void run() {
        printPersons(Data.getRoster(), new CheckPersonEligibleForSelectiveService());
    }

    private void printPersons(List<Person> roster, CheckPerson tester) {
        for (Person p : roster) {
            if (tester.test(p)) {
                p.printPerson();

            }
        }
    }


    class CheckPersonEligibleForSelectiveService implements CheckPerson {
        public boolean test(Person p) {
            return p.getGender() == Person.Sex.MALE &&
                    p.getAge() >= 18 &&
                    p.getAge() <= 25;
        }
    }
}
