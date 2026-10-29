package day10;

import day10.Person;

public class Student extends Person {
    private double score;
    private int studentId;
    private static int nextId=1;

    Student(){
        super();
        this.studentId=nextId++;
    }
    Student(String name, int age){
        super(name,age);
        this.studentId=nextId++;
    }

    Student(String name, int age, double score){
        super(name,age);
        this.score=score;
        this.studentId=nextId++;
    }
    public double getScore(){
        return score;
    }
    public int getStudentId(){
        return studentId;
    }

    public void setScore(double score){
        this.score=score;
    }

    @Override
    public void showInfo(){
        super.showInfo();
        System.out.println(score+" "+studentId);
    }



}
