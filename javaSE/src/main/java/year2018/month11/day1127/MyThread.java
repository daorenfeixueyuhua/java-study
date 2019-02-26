package year2018.month11.day1127;

import static java.lang.Thread.sleep;

class DelayThread implements Runnable {
    private static int count = 0;
    private int no;
    private int delay;

    public DelayThread() {
        count++;
        no = count;
    }

    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                delay = (int) (Math.random() * 5000);
                sleep(delay);
                System.out.println("Thread " + no + " with a delay " + delay);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

/**
 * 功能：开两个线程然后随机随眠
 */


public class MyThread {
    public static void main(String args[]) {
        DelayThread dt1 = new DelayThread();
        DelayThread dt2 = new DelayThread();
        Thread thread1 = new Thread(dt1);
        Thread thread2 = new Thread(dt2);

        thread1.start();
        thread2.start();
    }

}
