package year2018.month11.day1115.task1;

import java.util.Scanner;

public class Demo3 {
    private static long factorial(long n) {
        long result = 1;
        if (n < 0) {
            throw new IllegalArgumentException();
        }
        try {
            for (int i = 1; i <= n; i++) {
                result *= n;
            }
        } catch (Exception e) {
            throw new IllegalArgumentException();
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String src = null;
        long l = 0L;
        long result = 0L;
        try {
            System.out.println("请输入要计算的值:");
            src = scanner.next();
            l = Long.valueOf(src);
            result = factorial(l);
        } catch (Exception e) {
            System.out.println("出现异常");
            e.printStackTrace();
        } finally {
            System.out.println("Finish computing factorial number");
        }
        System.out.println("结果: " + result);
    }
}
