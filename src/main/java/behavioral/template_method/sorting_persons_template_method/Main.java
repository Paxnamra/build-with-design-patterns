package behavioral.template_method.sorting_persons_template_method;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void printContents(List<Person> people) {
        for (Person person : people) {
            System.out.println(person.getName());
        }
    }

    public static void main(String[] args) {

        Person tikki = new Person("Tikki", "900-224-157",35);
        Person root = new Person("Root", "458-112-094",40);
        Person denzel = new Person("Denzel", "647-335-011", 23);

        List<Person> people = new ArrayList<Person>();
        people.add(tikki);
        people.add(denzel);
        people.add(root);

        System.out.println("Not sorted: ");
        printContents(people);

        Collections.sort(people);

        System.out.println("\nSorted by age: ");
        printContents(people);

    }
}
