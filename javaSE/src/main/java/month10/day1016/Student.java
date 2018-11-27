package month10.day1016;

public class Student {
    float [] score = new float[3];

    public Student(float []score) {
        this.score=score;
    }
    boolean isGraduation(float avg){
        float sum = 0;
        float avg_ = 0;
        for (int i = 0; i < score.length; i++) {
            sum += score[i];
        }
        avg_ = sum / 3;
        System.out.println("该学生的成绩为: ");
        for (int i = 0; i < 3; i++) {
            System.out.print(score[i]+" ");
        }
        System.out.println("平均分： "+avg_);
        if(avg_>=avg){
            System.out.println("可以毕业");
            return true;
        }
        else{
            System.out.println("不可以毕业");
            return false;
        }
    }
}
