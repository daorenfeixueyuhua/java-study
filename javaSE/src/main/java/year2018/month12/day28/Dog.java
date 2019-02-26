package year2018.month12.day28;

/**
 * @author dage
 */
class Animal {
    /**
     *
     */
    public Animal() {
        System.out.println("Animal");
    }
}

/**
 * @author dage
 */
public class Dog extends Animal {
    /**
     *
     */
    public Dog() {
        System.out.println("Dog");
    }

    /**
     * @param args 参数
     */

    public static void main(final String[] args) {
        Dog dog = new Dog();
        final int k = 10;
        int a = k, b = k;
        if (a != b) {
            System.out.println("不相等");
        }
    }
}
