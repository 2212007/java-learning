package day04;

public class Student {
    public String name;
    public int score;
    public void showInfo(){
        System.out.println("name:"+name+" score:"+score);
    }
    Student(String name,int score){
        this.name=name;
        this.score=score;
    }
    Student(){
        this.name="noname";
        this.score=0;
    }

    public static void main(String[] args){
        Student s1=new Student();
        s1.name="zhangsan";
        s1.score=100;
        s1.showInfo();
        Student s2=new Student();
        s2.name = "lisi";
        s2.score= 50;
        s2.showInfo();
        Student s3=new Student();
        s3.showInfo();

    }

}
