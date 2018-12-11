package singletonPattern;

public class SingleObjectDemo {
    public static void main(String[] args) {
        SingleObject object1 = SingleObject.getInstance();
        SingleObject object2 = SingleObject.getInstance();
        if(object1 == object2){
            System.out.println("object1和object2是同一个对象");
        }else{
            System.out.println("object1和object2不是同一个对象");
        }
        object1.showMessage();
    }
}
