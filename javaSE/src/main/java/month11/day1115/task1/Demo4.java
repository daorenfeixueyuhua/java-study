package month11.day1115.task1;

import java.util.Scanner;

/**
 * 自定义异常
 * 作用：为了封装常见if语句，实现代码重用
 */
class InvalidCharException extends RuntimeException{
    public InvalidCharException(){

    }
    public InvalidCharException(String message){
        super(message);
    }
}


public class Demo4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = null;
        char c;
        try{
            System.out.println("输入一个字符:");
            str = scanner.next();
            c = str.charAt(0);
            if(Character.isLowerCase(c)){
                System.out.println(c);
            }
            if(Character.isUpperCase(c)){
                System.out.println(Character.toLowerCase(c));
            }
            if(!Character.isLetter(c)){
                throw new InvalidCharException();
            }
        }catch (Exception e){
            System.out.println("出现异常");
            e.printStackTrace();
        }
    }
}
