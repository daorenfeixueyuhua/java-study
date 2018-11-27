package month10.day1016;

import java.io.*;

public class IOTest {
    public static void main(String[] args) throws IOException {
        DataInputStream in = new DataInputStream(new FileInputStream("D:\\Projects\\IdeaProjects\\javaStudy\\javaSE\\src\\main\\resources\\test"));
        DataOutputStream out = new DataOutputStream(new FileOutputStream("D:\\Projects\\IdeaProjects\\javaStudy\\javaSE\\src\\main\\resources\\out"));
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        String count;
        while((count = reader.readLine())!=null){
            String s = count.toUpperCase();
            System.out.println(s);
            out.writeBytes(s+"   ");
        }
        reader.close();
        out.close();
    }
}
