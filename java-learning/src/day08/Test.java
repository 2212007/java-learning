package day08;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("Circle area: " + circle.area());
        Rect rect = new Rect(5, 10);
        System.out.println("Rect area: " + rect.area());
        //Shape shape = new Shape();

        Shape shape = new Circle(5);
        //System.out.println(shape.radius);
        System.out.println(Animal.count);   // 实验 A
        //Animal.count = 5;                   // 实验 B
        Animal [] zoo= {new Dog(), new Cat()};
        for(Animal animal : zoo){
            animal.makeSound();
        }
        letItSpeak(new Dog());

    }
    public static  void letItSpeak(Animal animal){
        animal.makeSound();
    }

}
