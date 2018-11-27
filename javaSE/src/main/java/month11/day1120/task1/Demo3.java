package month11.day1120.task1;

import java.io.*;

public class Demo3 {
    public static void main(String[] args) throws Exception {
        File aFile = new File("D:\\Projects\\IdeaProjects\\javaStudy\\javaSE\\src\\main\\java\\month11\\day1120\\task1\\a.txt");
        File bFile = new File("D:\\Projects\\IdeaProjects\\javaStudy\\javaSE\\src\\main\\java\\month11\\day1120\\task1\\b.txt");
        File cFile = new File("D:\\Projects\\IdeaProjects\\javaStudy\\javaSE\\src\\main\\java\\month11\\day1120\\task1\\c.txt");

        FileReader aFileReader = new FileReader(aFile);
        FileReader bFileReader = new FileReader(bFile);
        FileWriter cFileWriter = new FileWriter(cFile);

        BufferedReader aBufferedReader = new BufferedReader(aFileReader);
        BufferedReader bBufferedReader = new BufferedReader(bFileReader);
        BufferedWriter cBufferedWriter  = new BufferedWriter(cFileWriter);

        String lines = null;
        // copy a.txt
        while((lines=aBufferedReader.readLine())!=null){
            cBufferedWriter.write(lines+"\n");
        }
        // copy b.txt
        while((lines=bBufferedReader.readLine())!=null){
            cBufferedWriter.write(lines+"\n");
        }

        cBufferedWriter.flush();

        // close
        aFileReader.close();
        bFileReader.close();
        cFileWriter.close();
        aBufferedReader.close();
        bBufferedReader.close();
        cBufferedWriter.close();
    }
}
