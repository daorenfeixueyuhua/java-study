package month10.day1016;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal cat = new Cat();
        Animal dog = new Dog();
        Animal bird = new Brid();
        System.out.println("----------------------------");
        System.out.println("Animal:");
        animal.move();
        animal.cry();
        System.out.println("----------------------------");
        System.out.println("Cat:");
        cat.move();
        cat.cry();
        System.out.println("----------------------------");
        System.out.println("Dog");
        dog.move();
        dog.cry();
        System.out.println("----------------------------");
        System.out.println("Bird");
        bird.move();
        bird.cry();
        System.out.println("----------------------------");
    }
}
