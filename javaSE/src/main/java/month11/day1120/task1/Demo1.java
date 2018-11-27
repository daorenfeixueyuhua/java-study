package month11.day1120.task1;


import java.io.FileWriter;

public class Demo1 {
    public static void main(String[] args) throws Exception{
        // 问题一：使用相对路径无法写入内容
        FileWriter fileWriter = new FileWriter("D:\\Projects\\IdeaProjects\\javaStudy\\javaSE\\src\\main\\java\\month11\\day1120\\task1\\a.txt");
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <= i; j++) {
                String tmp=j+"*"+i+"="+i*j;
                System.out.print(tmp+"\t");
                fileWriter.write(tmp+"\t");
            }
            System.out.println();
            fileWriter.write("\n");
        }
        fileWriter.close();
    }
}
