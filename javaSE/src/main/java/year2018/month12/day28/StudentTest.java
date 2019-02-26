package year2018.month12.day28;

class Student {
    int SNO;
    String SName;
    float SJAVA;

    public Student(int SNO, String SName, float SJAVA) {
        this.SNO = SNO;
        this.SName = SName;
        this.SJAVA = SJAVA;
    }

    public int getNO() {
        return SNO;
    }


    public String getName() {
        return SName;
    }

    public float getJAVA() {
        return SJAVA;
    }
}

public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student(1, "KK", 100);
        Student s2 = new Student(3, "III", 10);
        Student s3 = new Student(6, "AAA", 48);
        float m, n, o, max, min, p;
        m = s1.getJAVA();
        n = s2.getJAVA();
        o = s3.getJAVA();
        max = min = m;
        if (max < n) max = n;
        if (max < o) max = o;
        if (min > m) min = n;
        if (min > o) min = o;
        p = (m + n + o) / 3;
        System.out.println("max：" + max + " min:" + min + " avg:" + p);
    }
}
