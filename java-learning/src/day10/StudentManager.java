package day10;

import day06.Student;

import java.util.ArrayList;

public class StudentManager {
    private ArrayList<Student> students = new ArrayList<>(100);
    public void addStudent(Student student) {
        students.add(student);
    }

    public void showInfo() {
        for (Student student : students) {
            student.showInfo();
        }
    }

    public void deleteStudent(int studentId) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getStudentId() == studentId) {
                students.remove(i);
                break;
            }
        }
        // 埋雷版：换个写法删
//        for (Student student : students) {
//            if (student.getStudentId() == studentId) {
//                students.remove(student);   // for-each 迭代中结构性修改
//            }
//        }
//        for (int i = students.size() - 1; i >= 0; i--) {
//            if (students.get(i).getStudentId() == studentId) {
//                students.remove(i);   // 不用 break，连删多个也安全
//            }
//        }
    }

    public void updateStudentScore(int studentId, double newScore) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getStudentId() == studentId) {
                students.get(i).setScore(newScore);
                break;
            }
        }
    }
    public static void main(String[] args) {
        StudentManager sm = new StudentManager();
        sm.addStudent(new Student("zhangsan", 18, 85.5));
        sm.addStudent(new Student("lisi", 19, 90.0));
        sm.addStudent(new Student("wangwu", 20, 88.0));
        sm.showInfo();
        sm.deleteStudent(1);
        sm.showInfo();
    }

}
