import java.util.Comparator;

public class PersonNobilityComparator implements Comparator<Person> {
    private final int maxSurname;

    public PersonNobilityComparator(int maxSurname) {
        this.maxSurname = maxSurname;
    }

    @Override
    public int compare(Person o1, Person o2) {
        if ((o1.getSurname().split(" ").length == o2.getSurname().split(" ").length) || (o1.getSurname().split(" ").length > maxSurname) || (o2.getSurname().split(" ").length > maxSurname)) {
            return Integer.compare(o1.getAge(), o2.getAge());
        } else {
            return Integer.compare(o1.getSurname().split(" ").length, o2.getSurname().split(" ").length);
        }
    }

}
