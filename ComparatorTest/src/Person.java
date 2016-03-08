
/**
 * Created by Eddy on 2016/3/6.
 */
public class Person implements Comparable<Person> {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void print(){
        System.out.println("姓名 ：" + name + ", 年龄 ：" + age);
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(obj instanceof Person){
            Person p1 = (Person) obj;
            return p1.getAge()== age && p1.getName().equals(name);
        }
        return false;
    }

    @Override
    public int compareTo(Person o) {
        return this.name.compareTo(o.getName());
    }
}
