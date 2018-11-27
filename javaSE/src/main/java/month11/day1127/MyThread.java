package month11.day1127;

import static java.lang.Thread.*;

class DelayThread implements Runnable{
    private static int count=0;
    private int no;
    private int delay;
    public DelayThread(){
        count++;
        no=count;
    }
    public void run(){
        try{
            for (int i=0;i<10;i++){
                delay=(int)(Math.random()*5000);
                sleep(delay);
                System.out.println("Thread "+no+" with a delay "+delay);
            }
        }catch(InterruptedException e){

        }
    }
    public void start(){
        new Thread(this).start();
    }

}

/**
 功能：开两个线程然后随机随眠
 */


public class MyThread {
    public static void main(String args[]){
        DelayThread thread1=new DelayThread();
        DelayThread thread2=new DelayThread();
        thread1.start();
        thread2.start();
        try{
            sleep(1000);
        }catch(InterruptedException e){
            System.out.println("Thread wrong");
        }
    }

}
