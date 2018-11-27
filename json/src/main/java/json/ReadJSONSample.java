package json;

import org.apache.commons.io.FileUtils;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.File;
import java.io.IOException;

public class ReadJSONSample {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\Projects\\IdeaProjects\\javaStudy\\json\\src\\main\\resources\\pengda.json");
        String context = FileUtils.readFileToString(file);
        JSONObject jsonObject = new JSONObject(context);
//        System.out.println(jsonObject.toString());
        System.out.println("姓名是： "+jsonObject.getString("name"));
        System.out.println("age: "+jsonObject.getDouble("age"));
        System.out.println("dog ? "+jsonObject.getBoolean("has_girlfriend"));
        JSONArray jsonArray = jsonObject.getJSONArray("major");

        for (int i = 0; i < jsonArray.length(); i++) {
            String m = (String) jsonArray.get(i);
            System.out.println(m);
        }
    }

}
