package day11;

import java.util.HashSet;
import java.util.Objects;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Person() {
    }

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

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Person person)) return false;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public static void main(String[] args){
        Person person = new Person("张三", 20);
        Person person1 = new Person("张三",20);
        System.out.println(person.equals(person1));
        HashSet<Person> set = new HashSet<>();
        set.add(person);
        set.add(person1);
        System.out.println(set.size());
    }
}
