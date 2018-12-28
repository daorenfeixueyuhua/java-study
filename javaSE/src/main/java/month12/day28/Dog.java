package month12.day28;

class Animal {
    public Animal() {
        System.out.println("Animal");
    }
}

public class Dog extends Animal {
    public Dog() {
        System.out.println("Dog");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        int a = 10, b = 10;
        if (a != b) {
            System.out.println("不相等");
        }
    }
}
