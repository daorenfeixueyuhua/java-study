package singletonPattern;

public class SingleObject {
    // 创建SingleObject的对象
    private static SingleObject instance = new SingleObject();

    /**
     * 构造器私有化
     */
    private SingleObject(){
    }

    /**
     *
     * @return 唯一可用对象
     */
    public static SingleObject getInstance(){
        return instance;
    }
    public void showMessage(){
        System.out.println("Hello World!");
    }
}
