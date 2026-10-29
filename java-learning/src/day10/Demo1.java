package day10;
import java.util.ArrayList;

public class Demo1 {
    ArrayList<Student> list = new ArrayList<>();
    public void addStudent(Student s){
        list.add(s);
    }
    public void showInfo(){
        for(int i=0;i<list.size();i++){
            Student s = list.get(i);
            s.showInfo();
        }

        for(Student s : list)
            s.showInfo();
    }
    public static void main(String[] args) {
        Demo1 d = new Demo1();
        d.addStudent(new Student("zhangsan",18));
        d.addStudent(new Student("lisi",19));
        d.showInfo();
        System.out.println(d.list.size());
        d.list.get(d.list.size());
    }
}
