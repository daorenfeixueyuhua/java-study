
import java.io.*;
import java.util.Scanner;

class FileOutPut implements Runnable{

    @Override
    public void run() {
        System.out.println("守护线程"+Thread.currentThread().getName()+"开始运行");
        try {
            writeToFile();
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("守护线程"+Thread.currentThread().getName()+"结束运行");
    }
    private void writeToFile() throws Exception {
        File filename = new File("D:\\Projects\\IdeaProjects\\javaStudy\\thread-study\\src\\output.txt");
        OutputStream os = new FileOutputStream(filename,true);
        int count = 0;
        while(count<999){
            os.write(("\r\nword"+count).getBytes());
            System.out.println("守护线程"+Thread.currentThread().getName()+"向文件写入 word"+count++);
            Thread.sleep(1000);
        }
    }
}

public class DaemonRunnable {
    public static void main(String[] args) {
        System.out.println("主线程"+Thread.currentThread()+"开始运行");

        FileOutPut fileOutPut = new FileOutPut();
        Thread thread = new Thread(fileOutPut,"文件写入");
        /**
         * 开启守护线程
         *
         */
        thread.setDaemon(true);
        thread.start();
        Scanner scanner = new Scanner(System.in);
        scanner.next();
        System.out.println("主线程"+Thread.currentThread()+"结束运行");
    }
}
