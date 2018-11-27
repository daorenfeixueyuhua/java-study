package gson;

import bean.Diaosi;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GsonCreateSample {
    public static void main(String[] args) {
        Diaosi diaosi = new Diaosi();
        diaosi.setName("彭达");
        diaosi.setAge(19.9);
        diaosi.setBirthday("1998-11-21");
        diaosi.setCar(null);
        diaosi.setHouse(null);
        diaosi.setShcool("贵州师范大学");
        diaosi.setComment("我是你大爷");
        diaosi.setHas_girlfriend(false);
        diaosi.setMajor(new String[] {"计算机","泡妞"});

        //美化
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setPrettyPrinting();
        Gson gson = gsonBuilder.create();
        System.out.println(gson.toJson(diaosi));
    }
}
