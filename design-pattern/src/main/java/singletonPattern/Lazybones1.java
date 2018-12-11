package singletonPattern;

/**
 * 懒汉式，线程不安全
 */
public class Lazybones1 extends Singleton{
    private static Lazybones1 instance;
    private Lazybones1(){}
    public static Lazybones1 getInstance(){
        if(instance == null){
            instance = new Lazybones1();
        }
        return instance;
    }
}
