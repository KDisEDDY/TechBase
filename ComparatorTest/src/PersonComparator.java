import java.util.Comparator;

/**
 * Created by Eddy on 2016/3/6.
 */
public class PersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
             return o1.getAge() - o2.getAge();
    }
}
