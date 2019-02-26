package year2018.month11.day1127;

class Bank implements Runnable {
    /**
     * 汇款总额
     */
    private int moneys = 0;

    public void run() {
        for (int i = 1; i <= 3; i++) {
            moneys += 100;
            System.out.println(Thread.currentThread().getName() + "等待汇款...");
            try {
                Thread.sleep(200);
                System.out.println(Thread.currentThread().getName() + "汇款中...");
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "第" + i + "次汇入100元，当前汇款池总额为" + moneys + "元");
        }
    }
}

public class Demo3 {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Thread th1 = new Thread(bank, "万年老妖");
        Thread th2 = new Thread(bank, "达达");
        th1.start();
        th2.start();
    }
}
