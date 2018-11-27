package month10.day1016;

class Q1 {
    int i=10;
    public void method(int i){
        System.out.println(10);
    }
}
class Q2 extends Q1{
    int i=20;
    public void method(int i){
        System.out.println(20);
    }
    public void method2(int i){ //新增方法
        System.out.println(30);
    }
    public static void main(String[] args) {
        Q1 q1 = new Q1();
        //修改1：Q2 q2 = new Q2();
        Q1 q2 = new Q2();
        System.out.println("the i in Q1:"+q1.i);
        System.out.println("the i in Q2:"+q2.i);
        q1.method(1);
        q2.method(2);
        //修改2：
        ((Q2)q2).method2(3);
    }
}

