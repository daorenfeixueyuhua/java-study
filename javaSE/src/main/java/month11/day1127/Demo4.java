package month11.day1127;

        import static java.lang.Thread.sleep;

class First extends Thread{
    @Override
    public void run(){
        for (int i = 0; i < 3; i++) {
            System.out.println("First");
            try {
                sleep(0);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class Second implements Runnable{

    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Second");
            try {
                sleep(0);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void start(){
        new Thread(this).start();
    }
}

public class Demo4 {
    public static void main(String[] args) {
        First first = new First();
        first.start();
        Second second = new Second();
        second.start();
    }
}
