package day16;

import day06.Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 18, 85));
        students.add(new Student("Bob", 19, 90));
        students.add(new Student("Charlie", 20, 88));
        students.add(new Student("David", 21, 92));
        students.add(new Student("Eve", 22, 70));

        filterDemo(students);
        mapDemo(students);
        sortDemo(students);
        averageDemo(students);
        lazyDemo(students);

    }
    //
    static void filterDemo(List<Student> students) {
        //students.stream().filter(s -> s.getScore() >= 80).forEach(s -> System.out.println(s.getName()));
        students.stream().filter(s -> s.getScore() >= 80).forEach(s -> s.showInfo());
    }

    static void mapDemo(List<Student> students) {
        List<String> names = students.stream().map(Student::getName).collect(Collectors.toList());
        System.out.println(names);
       //names.stream().collect(Collectors.toList()); // This line is unnecessary
    }

    static void sortDemo(List<Student> students) {

        //students.stream().sorted(Comparator.comparingDouble(Student::getScore).reversed()).forEach(s -> s.showInfo());
        //reversed()方法返回一个Comparator，该Comparator将比较结果反转，即从大到小排序
        students.stream().sorted((s2, s1) -> Double.compare(s1.getScore(), s2.getScore())).forEach(s -> s.showInfo());
    }   //Double.compare(s1.getScore(), s2.getScore())返回一个Comparator

    static void averageDemo(List<Student> students) {
        OptionalDouble average = students.stream().mapToDouble(Student::getScore).average();
        ///double averageScore = students.stream().mapToDouble(Student::getScore).average().orElse(0.0);
        //System.out.println("Average Score: " + averageScore);
        if(average.isPresent()){
            System.out.println("Average Score: " + average.getAsDouble());
        }
        //boolean isPresent = students.stream().mapToDouble(Student::getScore).average().isPresent(); // Check if average is present
        //double averageScore = students.stream().mapToDouble(Student::getScore).average().getAsDouble();    // Get the average score
        //getAsDouble是用来获取平均分的 在isPresent为true时，否则会抛出NoSuchElementException
        //System.out.println("Average Score: " + averageScore);

    }

    static void lazyDemo(List<Student> students) {
        students.stream()
                .filter(s -> {
                    System.out.println("Filtering: " + s.getName());
                    return s.getScore() >= 80;
                })
                .map(s -> {
                    System.out.println("Mapping: " + s.getName());
                    return s.getName();
                });
        System.out.println("Lazy evaluation example");

    }
}
