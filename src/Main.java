import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Иван", "Иванович", 32));
        people.add(new Person("Иоган", "Штраус", 45));
        people.add(new Person("Иоган", "Иоганович Штраусс", 20));
        people.add(new Person("Алексей Алекс", "Максимович", 11));
        people.add(new Person("Семён", "Иванович", 19));
        people.add(new Person("Надежда", "Жуковна Петровна", 19));
        people.add(new Person("Георгий", "Георгиевич Георг Георганов", 93));
        people.add(new Person("Петя", "Из пятого подъезда", 6));
        System.out.println(people);
        Collections.sort(people, new PersonNobilityComparator());
        System.out.println();
        System.out.println(people);
    }
}
