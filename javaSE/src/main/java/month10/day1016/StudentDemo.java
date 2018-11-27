package month10.day1016;

public class StudentDemo {
    public static void main(String[] args) {
        Student s1 = new Undergraduate(new float[]{99,100,59});
        Student s2 = new Graduate(new float[]{66,77,88});
        s1.isGraduation(60);
        s2.isGraduation(80);
    }
}
