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
//        printPersons(Data.getRoster(), (Person p) -> p.getGender() == Person.Sex.MALE
//                && p.getAge() >= 18
//                && p.getAge() <= 25
//        );


        //  You can omit the data type of the parameters in a lambda expression. In addition,
        // you can omit the parentheses if there is only one parameter.
        // For example, the following lambda expression is also valid:
        printPersons(Data.getRoster(), p -> p.getGender() == Person.Sex.MALE
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
