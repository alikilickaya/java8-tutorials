package main.java.approaches.lambda;

import main.java.model.Person;
import main.java.util.Data;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Approach9 {
    public static void main(String[] args) {
        Approach9 app = new Approach9();
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

    private static <X, Y> void processPersonsWithFunction(
            Iterable<X> source,
            Predicate<X> tester,
            Function<X, Y> mapper,
            Consumer<Y> block) {
        for (X p : source) {
            if (tester.test(p)) {
                Y data = mapper.apply(p);
                block.accept(data);
            }
        }
    }
}

