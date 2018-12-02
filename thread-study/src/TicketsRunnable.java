
class MyThread2 implements Runnable{
    private int ticketsCount = 5;
    @Override
    public void run() {
        while(ticketsCount>0){
            ticketsCount--;
            System.out.println(Thread.currentThread().getName() +"买了1张票，还剩于票数为"+ticketsCount);
        }
    }
}

public class TicketsRunnable {
    public static void main(String[] args) {
        MyThread2 mt = new MyThread2();
        Thread th1 = new Thread(mt,"窗口1");
        Thread th2 = new Thread(mt,"窗口2");
        Thread th3 = new Thread(mt,"窗口3");
        th1.start();
        th2.start();
        th3.start();
    }
}
