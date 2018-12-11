package singletonPattern;

/**
 * 登记式/静态内部类
 */
public class StaticInner extends Singleton{
    private static class SingletonHolder{
        private static final StaticInner INSTANCE = new StaticInner();
    }
    private StaticInner(){}
    public static final StaticInner getInstance(){
        return SingletonHolder.INSTANCE;
    }
}
