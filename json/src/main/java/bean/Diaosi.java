package bean;

import com.google.gson.annotations.SerializedName;

import java.util.Arrays;

/**
 * 屌丝
 * @author dage
 */
public class Diaosi {
    @SerializedName("name")
    private String name;
    private String shcool;
    private boolean has_girlfriend;
    private double age;
    private Object car;
    private Object house;
    private String[] major;
    private String comment;
    private String birthday;
    private transient String ignore;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShcool() {
        return shcool;
    }

    public void setShcool(String shcool) {
        this.shcool = shcool;
    }

    public boolean isHas_girlfriend() {
        return has_girlfriend;
    }

    public void setHas_girlfriend(boolean has_girlfriend) {
        this.has_girlfriend = has_girlfriend;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public Object getCar() {
        return car;
    }

    public void setCar(Object car) {
        this.car = car;
    }

    public Object getHouse() {
        return house;
    }

    public void setHouse(Object house) {
        this.house = house;
    }

    public String[] getMajor() {
        return major;
    }

    public void setMajor(String[] major) {
        this.major = major;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Diaosi{" +
                "name='" + name + '\'' +
                ", shcool='" + shcool + '\'' +
                ", has_girlfriend=" + has_girlfriend +
                ", age=" + age +
                ", car=" + car +
                ", house=" + house +
                ", major=" + Arrays.toString(major) +
                ", comment='" + comment + '\'' +
                ", birthday='" + birthday + '\'' +
                ", ignore='" + ignore + '\'' +
                '}';
    }
}
