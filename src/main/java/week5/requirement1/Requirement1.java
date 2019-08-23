
package week5.requirement1;
/*
import jdk.nashorn.internal.objects.annotations.Getter;

import java.util.Comparator;
import java.util.TreeSet;

public class Requirement1 {

    public static void main(String[] args) {
        Comparator<Person> comparatorDupaNume = new Comparator<Person>() {
            public int compare(Person o1, Person o2) {
                int compareByName = person1.getName().compareTo(person2.getName());
                int compareByAge = person1.getAge().compareTo(person2.getAge());
                if (compareByName == 0) {
                    return compareByAge;
                }
                return compareByName;
            }
        };
        TreeSet<Person> altSet = new TreeSet<>(comparatorDupaNume); //
        System.out.println(altSet.add(new Person("Dan", 24)));
        System.out.println(altSet.add(new Person("Elena", 20)));
        System.out.println(altSet);
    }
}

@Getter
class Person {  //implements Comparable<Person>{
    private final String name;
    private final Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public int compareTo(Person o) {
        int compareByName = this.name.compareTo(o.name); //neg zero sau pozitiv
        int compareByAge = this.age.compareTo(o.age); //neg zero sau pozitiv
        if (compareByName == 0) {
            return compareByAge;
        }
        return compareByName;
    }

    public String toString() {
        return "Person(name=" + this.name + ", age=" + this.age + ")";
    }
}
*/

