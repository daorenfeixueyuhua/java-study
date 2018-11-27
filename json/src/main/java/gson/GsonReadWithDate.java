package gson;

import bean.Student;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class GsonReadWithDate {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\Projects\\IdeaProjects\\javaStudy\\json\\src\\main\\resources\\student.json");
        String context = FileUtils.readFileToString(file);
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setDateFormat("yyyy-MM-dd");
        Gson gson = gsonBuilder.create();
        Student student = gson.fromJson(context,Student.class);
        System.out.println(student.getBirthday().toLocaleString());
    }
}
