package main.java.approaches.lambda;

import main.java.model.Person;
import main.java.util.Data;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Approach8 {
    public static void main(String[] args) {
        Approach8 app = new Approach8();
        app.run();
    }

    private void run() {
        processPersonsWithFunction(Data.getRoster(),
                p -> p.getGender() == Person.Sex.MALE
                        && p.getAge() >= 18
                        && p.getAge() <= 25,
                p -> p.getName(),
                name -> System.out.println(name)
        );
    }

    private static void processPersonsWithFunction(
            List<Person> roster,
            Predicate<Person> tester,
            Function<Person, String> mapper,
            Consumer<String> block) {
        for (Person p : roster) {
            if (tester.test(p)) {
                String data = mapper.apply(p);
                block.accept(data);
            }
        }
    }
}
