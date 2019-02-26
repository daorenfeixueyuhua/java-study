package year2018.month11.day1127;

class PrintThread extends Thread {
    private char character;

    public PrintThread(char character) {
        this.character = character;
    }

    @Override
    public void run() {
        int count = 20;
        try {
            switch (character) {
                case 'A':
                    for (int i = 0; i < count; i++) {
                        System.out.print(character);
                        sleep(1000);
                    }
                    break;
                case 'B':
                    for (int i = 0; i < count; i++) {
                        System.out.print(character);
                        sleep(2000);
                    }
                    break;
                default:
                    break;
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}

public class Demo2 {
    public static void main(String[] args) {
        PrintThread printA = new PrintThread('A');
        PrintThread printB = new PrintThread('B');
        printA.start();
        printB.start();
    }
}
