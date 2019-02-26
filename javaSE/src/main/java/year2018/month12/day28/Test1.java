package year2018.month12.day28;

import java.io.FileOutputStream;

public class Test1 {
    public static void main(String[] args) throws Exception {
        int A[] = {100, 101, 103, 104, 105, 106};
        FileOutputStream outputStream = new FileOutputStream("Text.txt");
        for (int i = 0; i < A.length; i++)
            outputStream.write(A[i]);
        for (int i = A.length; i >= 0; i--)
            System.out.println(A[i]);
    }
}
