package month10.day1019;

public class Demo1 {
    public static void main(String[] args) {
        int i=0;
        int resultThree = 0;
        int resultSeven = 0;
        while(i<=100){
            if(i%3==0){
                resultThree++;
            }
            if(i%7==0){
                resultSeven++;
            }
            i++;
        }

    }
}
