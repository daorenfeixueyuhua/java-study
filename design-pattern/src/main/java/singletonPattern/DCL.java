package singletonPattern;

/**
 * 双检锁/双重校验锁
 */
public class DCL extends Singleton{
    private volatile static DCL instance;
    private DCL(){}
    public static DCL getInstance(){
        synchronized (DCL.class){
            if(instance == null){
                instance = new DCL();
            }
        }
        return instance;
    }
}
