package year2019.month01.day27;

/**
 * @author dage
 * @date 2019/01/27
 */
public class Hello {

    public static void main(String[] args) {
        System.out.println("Hello, OK!");
    }

    class Inner {
        private int A;

        public int getA() {
            return A;
        }

        public void setA(int a) {
            A = a;
        }

        public void say() {
            System.out.println("我是你大爷！");
        }
    }
}
