package year2018.month11.day1120.task1;

import java.io.*;

public class Demo2 {
    public static void main(String[] args) throws Exception {
        // copy s.txt to a1.txt
        FileInputStream fileInputStream = new FileInputStream("D:\\Projects\\IdeaProjects\\javaStudy\\javaSE\\src\\main\\java\\year2018.month11\\day1120\\task1\\a.txt");
        FileOutputStream fileOutputStream = new FileOutputStream("D:\\Projects\\IdeaProjects\\javaStudy\\javaSE\\src\\main\\java\\year2018.month11\\day1120\\task1\\a1.txt");
        byte[] bytes = new byte[10000];
        fileInputStream.read(bytes);
        fileOutputStream.write(bytes);
        fileInputStream.close();
        fileOutputStream.close();

        // copy s.txt to a2.txt
        FileReader fileReader = new FileReader("D:\\Projects\\IdeaProjects\\javaStudy\\javaSE\\src\\main\\java\\year2018.month11\\day1120\\task1\\a.txt");
        FileWriter fileWriter = new FileWriter("D:\\Projects\\IdeaProjects\\javaStudy\\javaSE\\src\\main\\java\\year2018.month11\\day1120\\task1\\a2.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        String lines = null;
        while ((lines = bufferedReader.readLine()) != null) {
            System.out.println(lines);
            bufferedWriter.write(lines + "\n");
            bufferedWriter.flush();
        }

        fileReader.close();
        fileWriter.close();
    }
}
