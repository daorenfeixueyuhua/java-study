package gson;

import bean.Diaosi;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class GsonReadSample {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\Projects\\IdeaProjects\\javaStudy\\json\\src\\main\\resources\\pengda.json");
        String context = FileUtils.readFileToString(file);
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setPrettyPrinting();
        Gson gson = gsonBuilder.create();
        Diaosi diaosi = gson.fromJson(context,Diaosi.class);
        System.out.println(diaosi.toString());
    }
}
