package main.java.approaches.lambda;

import main.java.model.Person;
import main.java.util.Data;

public class Approach10 {
    public static void main(String[] args) {
        Approach10 app = new Approach10();
        app.run();
    }

    private void run() {
        Data.getRoster()
                .stream()
                .filter(
                        p-> p.getGender() == Person.Sex.MALE
                        && p.getAge() >= 18
                        && p.getAge() <= 25)
                .map(p -> p.getName())
                .forEach(name -> System.out.println(name));
    }
}
