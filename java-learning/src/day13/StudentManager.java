package day13;

import day06.Student;

import java.util.HashMap;

public class StudentManager {
    //<key,值>
    private HashMap<Integer, Student> students;
    public StudentManager() {
        students = new HashMap<>();
    }
    public void addStudent(Student student) {
        if (students.containsKey(student.getStudentId())) {
            System.out.println("Student already exists");
            return;
        }
        students.put(student.getStudentId(), student);
    }
    public void deleteStudent(int id){
        if (students.containsKey(id)) {
            students.remove(id);
        } else {
            System.out.println("Student not found");
        }
    }
    public Student findById(int id){
        Student s = students.get(id);
        if (s != null) {
            return s;
        } else {
            System.out.println("Student not found");
            return null;
        }
    }
    public void updateStudentScore(int id,double score){
        if (students.containsKey(id)) {
            students.get(id).setScore(score);
        } else {
            System.out.println("Student not found");
        }
    }
    public void showInfo(){
        //只要值
        for (Student student : students.values())
            student.showInfo();
        //只要Key
        for (int key : students.keySet()) {
            students.get(key).showInfo();
        }
        //全都要
        for (HashMap.Entry<Integer, Student> entry : students.entrySet())
            entry.getValue().showInfo();
    }
    public double averageScore(){
        double allScore = 0;
        for(Student student : students.values())
            allScore+=student.getScore();
        if(students.size() == 0)
            return 0;
        return allScore/students.size();
    }
}
