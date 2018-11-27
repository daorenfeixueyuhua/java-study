package month11.day1115.task1;


import java.io.IOException;
import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = null;
        int i = 0;
        System.out.println("请输入整型字符串:");
        try {
            str = scanner.next();
//            i = Integer.getInteger(str);
            i = Integer.valueOf(str);

        }catch (Exception e){
            System.out.println("出现异常");
            e.printStackTrace();
            throw new RuntimeException();
        }
        System.out.println("整型字符串: "+str);
        System.out.println("整形数据: "+i);
    }
}
