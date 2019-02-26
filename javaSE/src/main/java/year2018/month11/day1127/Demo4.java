package year2018.month11.day1127;

import static java.lang.Thread.sleep;

class First extends Thread {
    public First(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getName());
            /**
             * 设置统一优先级后，比较sleep
             */
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Second implements Runnable {

    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getName());
            /**
             * 设置统一优先级后，比较sleep
             */
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Demo4 {
    public static void main(String[] args) {
        Thread first = new First("First");
        Second thread = new Second();
        Thread second = new Thread(thread, "Second");
        /**
         * 设置统一优先级
         */
        first.setPriority(1);
        second.setPriority(1);

        /**
         * 设置不同优先级
         */
        /*first.setPriority(2);
        second.setPriority(1);*/

        first.start();
        second.start();
    }
}
