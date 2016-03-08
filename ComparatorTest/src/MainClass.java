import java.util.Arrays;

/**
 * Created by Eddy on 2016/3/6.
 */
public class MainClass {
    public static void main(String arg[]){
        Person[] people = new Person[]{
                new Person("刘一",11),new Person("六二",22),new Person("柳三",33)
        };
        PersonComparator personComparator = new PersonComparator();
        Arrays.sort(people);
        print(people);
        Arrays.sort(people,personComparator);
        print(people);
    }

    static void print(Person[] people){
        for (int i = 0; i < people.length; i++) {
            people[i].print();
        }
    }

}
