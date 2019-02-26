package year2018.month11.day1106.task1;

public class Demo3 {
    public static void main(String[] args) {
        String name = new String("My name is Networkcrazy");
        System.out.println("字符串的长度: " + name.length());
        System.out.println("字符串的第一个字符: " + name.charAt(0));
        System.out.println("字符串的最后一个字符: " + name.charAt(name.length() - 1));
        System.out.println("字符串的第一个单词: " + name.substring(0, name.indexOf(" ")));
        System.out.println("字符串中crazy的位置: " + name.indexOf("crazy"));
    }
}
