package month12.day04;

import javax.swing.*;
import java.awt.*;

public class SimpleCalculator extends JFrame {

    public SimpleCalculator() throws HeadlessException {
        ImageIcon icon = new ImageIcon("D:\\Projects\\IdeaProjects\\javaStudy\\javaSE\\src\\main\\java\\month12\\day04\\calculator.jpg");
        setIconImage(icon.getImage());
        setTitle("简单计算器");
        setSize(300,400);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JButton confirmJButton = new JButton("确定");
        JButton cancelJButton = new JButton("取消");
        JButton exitJButton = new JButton("退出");
        add(confirmJButton);


    }

    public static void main(String[] args) {
        new SimpleCalculator().setVisible(true);
    }
}
