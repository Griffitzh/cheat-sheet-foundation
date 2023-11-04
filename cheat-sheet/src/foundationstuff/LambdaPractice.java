package foundationstuff;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LambdaPractice {

    public static void main(String[] args) {

        List<LambdaPerson> personList = Arrays.asList(
                new LambdaPerson("Charles", "Dickens", 60),
                new LambdaPerson("Lewis", "Carroll", 42),
                new LambdaPerson("Thomas", "Carlyle", 51),
                new LambdaPerson("Charlotte", "Bronte", 45),
                new LambdaPerson("Matthew", "Arnold", 39)
        );

        personList.stream()
                .filter(p -> p.getLastName().startsWith("C"))
                .forEach(p -> System.out.println(p.getFirstName()));

        Stream<LambdaPerson> newPerson = personList.stream();
    }
}
