package year2018.month11.day1106.task2;

import java.util.*;

public class ListTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
//        add elements
        list.add("nihao");
        list.add("hi");
        list.add("konikiwa");
        list.add("hola");
        list.add("Bonjour");
        // Traversal
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + " " + list.get(i));
        }
        System.out.println("list的大小: " + list.size());
        String delStr = list.get(2);
        list.remove(2);
        System.out.println("删除的元素: " + delStr);
        System.out.println("list中第三个元素: " + list.get(2));
        System.out.println("list的大小: " + list.size());

        // Sort
        System.out.println("排序前: " + list);
        //字典排序
        Collections.sort(list, new Comparator<String>() {
            public int compare(String o1, String o2) {
                try {
                    // 取得比较对象的汉字编码，并将其转换成字符串
                    String s1 = new String(o1.getBytes("GB2312"), "ISO-8859-1");
                    String s2 = new String(o2.getBytes("GB2312"), "ISO-8859-1");
                    // 运用String类的 compareTo（）方法对两对象进行比较
                    return s1.compareTo(s2);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return 0;
            }
        });
        System.out.println("排序后: " + list);

        // Iterator Traversal
        Iterator<String> iterator = list.iterator();
        System.out.print("Iterator遍历: [ ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println("]");
    }

}
