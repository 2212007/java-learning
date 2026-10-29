package day06;

public class Person {
    private String name;
    private int age;
    Person(){
        //this.name=null;
        //this.age=0;
    }
    Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }

    //@Override
    public void showInfo(){
        System.out.println(name+" "+age);
    }


}
