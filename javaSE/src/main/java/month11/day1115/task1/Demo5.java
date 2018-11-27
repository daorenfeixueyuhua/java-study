package month11.day1115.task1;

import java.util.Scanner;

public class Demo5 {
    private static void sanjiao(int a,int b,int c){
        if(a+b>c&&a-b<c){

        }else{
            throw new IllegalArgumentException();
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        try{
            System.out.println("输入三个数: ");
            a = scanner.nextInt();
            b = scanner.nextInt();
            c = scanner.nextInt();
            sanjiao(a, b, c);
            System.out.println(a+" "+b+" "+c+" 可以构成三角形");
        }catch (Exception e){
            System.out.println("出现异常");
            e.printStackTrace();
            if(e.getClass().equals(IllegalArgumentException.class)){
                System.out.println("不能构成三角形");
            }
        }
    }
}
