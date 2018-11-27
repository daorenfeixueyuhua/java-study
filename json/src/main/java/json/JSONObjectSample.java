package json;

import bean.Diaosi;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class JSONObjectSample {
    public static void main(String[] args) {
        createJsonByBean();
    }
    private static void JSONObject(){
        Object nullObj =null;
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name","彭达");
        jsonObject.put("age",20);
        jsonObject.put("birthday","1998-12-27");
        jsonObject.put("school","贵州师范大学");
        jsonObject.put("major",new String[]{"计算机","泡妞"});
        jsonObject.put("has_girlfriend",false);
        jsonObject.put("car",nullObj);
        jsonObject.put("house",nullObj);
        jsonObject.put("comment","这是一个注释");
        System.out.println(jsonObject.toString());
    }
    private  static void craeteJsonByMap(){
        Map<String,Object> map = new HashMap<String, Object>();
        Object nullObj =null;
        map.put("name","彭达");
        map.put("age",20);
        map.put("birthday","1998-12-27");
        map.put("school","贵州师范大学");
        map.put("major",new String[]{"计算机","泡妞"});
        map.put("has_girlfriend",false);
        map.put("car",nullObj);
        map.put("house",nullObj);
        map.put("comment","这是一个注释");

        JSONObject jsonObject = new JSONObject(map);
        System.out.println(jsonObject.toString());
    }
    private static void createJsonByBean(){
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
        System.out.println(new JSONObject(diaosi));
    }
}
