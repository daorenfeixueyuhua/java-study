package year2018.month11.day1106.task1;

public class StringBufferExample {
    public static void main(String args[]) {
        StringBuffer str = new StringBuffer("ABCDEFG");
        str.append("123456789");// 向str尾加“123456789”。
        System.out.println(str);
        str.replace(str.indexOf("B"), 1, "b");// 将str中的字符 ‘B’替换为‘b’。
        System.out.println(str);
        str.insert(8, "Game"); // 在str中的“123456789”前面插入“Game”。
        System.out.println(str);
        int index = str.indexOf("1"); // 获取str中首次出现“1”的位置。
        str.delete(index, index + 4); // 删除str中“1234”。
        int n = str.length();   //获取str中字符个数。
        str.replace(str.indexOf("789"), str.indexOf("789") + 3, "七八九");    // 将str中“789”替换为“七八九”。
        System.out.println(str);

        StringBuffer otherStr = new StringBuffer("we love you");
        int start = 0;
        char c = '\0';
        while (start != -1) {
            if (start != 0) {
                start = start + 1;
            }
            c = otherStr.charAt(start);
            if (Character.isLowerCase(c)) {
                c = Character.toUpperCase(c);
                otherStr.setCharAt(start, c);
            }
            start = otherStr.indexOf(" ", start); //查找下一个空格。     }
            System.out.println(otherStr);

            StringBuffer yourStr = new StringBuffer("i  Love THIS  GaME");
            for (int i = 0; i < yourStr.length(); i++) {
                char d1 = yourStr.charAt(i);
                if (Character.isLowerCase(d1)) {
                    d1 = Character.toUpperCase(d1);
                    yourStr.setCharAt(i, d1);
                } else if (Character.isUpperCase(d1)) {
                    d1 = Character.toLowerCase(d1);
                    yourStr.setCharAt(i, d1);
                }
            }// 将yourStr中的大写字符替换为对应的小写字符，小写字符替换为对应的大写字符
            System.out.println(yourStr);
        }
    }

}
