import java.util.Comparator;

public class PersonNobilityComparator implements Comparator<Person> {
    private int maxSurname = Integer.MAX_VALUE;

    public PersonNobilityComparator(int maxSurname) {
        this.maxSurname = maxSurname;
    }

    @Override
    public int compare(Person o1, Person o2) {
        if ((Integer.compare(o1.getSurname().split(" ").length, o2.getSurname().split(" ").length) == 0) || (o1.getSurname().split(" ").length > maxSurname) || (o2.getSurname().split(" ").length > maxSurname)) {
            return Integer.compare(o1.getAge(), o2.getAge());
        } else {
            return Integer.compare(o1.getSurname().split(" ").length, o2.getSurname().split(" ").length);
        }
    }

}
