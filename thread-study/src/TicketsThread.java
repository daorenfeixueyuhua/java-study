class MyThread extends Thread{
    private int ticketsCount = 5;
    private String name;

    public MyThread(String name){
        this.name = name;
    }

    @Override
    public void run() {
        while(ticketsCount>0){
            ticketsCount--;
            System.out.println(name +"买了1张票，还剩于票数为"+ticketsCount);
        }
    }
}


public class TicketsThread {
    public static void main(String[] args) {
        MyThread mt1 = new MyThread("窗口1");
        MyThread mt2 = new MyThread("窗口2");
        MyThread mt3 = new MyThread("窗口3");

        mt1.start();
        mt2.start();
        mt3.start();
    }
}
