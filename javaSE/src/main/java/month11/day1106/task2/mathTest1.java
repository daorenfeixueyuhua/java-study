package month11.day1106.task2;
import java.math.*;
public class mathTest1 {
    public static void main(String args[]) {
        int i1 = (int) (Math.random()*100);// 产生大于等于 0 小于 100 的随机数
        double i3 = Math.random(); // 产生大于等于 0.0 小于 1.0 的随机数
        double d1 = Math.sin(60);   //求60 弧度的正弦值
        double d2 = Math.log(Math.E);// E 的对数值
        double d3 = Math.pow(2,4); //2 的 4 次方
        int r = Math.round(43.6F);    //  43.6F 四舍五入
        System.out.println("i1 的随机数为 " + i1);
        System.out.println("d1 的随机数为 " + i3);
        System.out.println("60 弧度的正弦值： " + d1);
        System.out.println("E 的对数值： " + d2);
        System.out.println("2 的 4 次方： " + d3);
        System.out.println("43.6F 四舍五入： " + r);
        /*
        代码1： (int) (Math.random()*100);
        代码2：Math.random();
        代码3：Math.sin(60);
        代码4：Math.log(Math.E);
        代码5：Math.pow(2,4);
         */
    }

}
