package singletonPattern;

/**
 * 懒汉式，线程安全
 */
public class Lazybones2 extends Singleton{
    private static Lazybones2 instance;
    private Lazybones2(){}
    public static synchronized Lazybones2 getInstance(){
        if(instance == null){
            instance = new Lazybones2();
        }
        return instance;
    }
}
