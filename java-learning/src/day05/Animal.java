package day05;

public class Animal {
    String name;
    void makeSound(){
        System.out.println("某种叫声");
    }
    Animal(String name){
        this.name=name;
        System.out.println("Animal的构造方法");
    }
    Animal(){
        System.out.println("Animal的无参构造方法");
    }
}
class Cat extends Animal{
    Cat(String name){
        super(name);
        System.out.println("Cat的构造方法");
    }
    Cat(){
        System.out.println("Cat的无参构造方法");
    }
}


class Dog extends Animal{
    Dog(String name){
        super(name);
        System.out.println("Dog的构造方法");

    }

    @Override
    void makeSound() {
        super.makeSound();
        System.out.println("汪");

    }
    Dog(){
        System.out.println("Dog的无参构造方法");

    }
    void bark(){
        System.out.println("汪汪汪");
    }

    public static void main(String[] args){
        Dog dog = new Dog("旺财");
        dog.makeSound();
        Animal a = new Dog();
        Animal b = new Cat();
        a.makeSound();//
        b.makeSound();



    }

}
