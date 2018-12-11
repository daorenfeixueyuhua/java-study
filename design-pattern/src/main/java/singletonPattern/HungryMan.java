package singletonPattern;

/**
 * 饿汉式
 */
public class HungryMan extends Singleton{
    private static HungryMan instance = new HungryMan();
    private HungryMan(){}
    public static HungryMan getInstance(){
        return instance;
    }
}
