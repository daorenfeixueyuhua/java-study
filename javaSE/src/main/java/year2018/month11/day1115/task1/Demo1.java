package year2018.month11.day1115.task1;

public class Demo1 {
    public static void run() {
        for (int i = 0; i < 4; i++) {
            int a;
            try {
                switch (i) {
                    case 0:     // 除数为0
                        int zero = 0;
                        a = 4 / zero;
                        break;
                    case 1:     // 数组越界访问
                        int[] b = new int[5];
                        a = b[5];
                        break;
                    case 2:
                        int[] c = new int[-1];
                        a = c[0];
                        break;
                    case 3:
                        int[] d = null;
                        a = d[0];
                        break;
                }
            } catch (Exception e) {
                System.out.println("Case " + i + " has an exception");
                System.out.println(e);
            }
        }

    }

    public static void main(String[] args) {
        run();
    }
    /**
     * （1）程序运行结果怎样，出现了哪些异常？
     *  程序运行不报错，但是输出打印了许多异常，分别是ArithmeticException、ArithmeticException、NegativeArraySizeException、NullPointerException
     * （2）分析异常是怎样抛出、捕获和处理的？
     *  异常抛出：当程序运行出现异常是，会将异常递交给虚拟机，由虚拟机进行处理；
     *  捕获异常：可以由程序员自行对出现的异常进行处理
     * （3）程序中设计循环目的是什么？
     *  简化代码，使得代码不过于累赘,是的代码可重用型高
     */
}
