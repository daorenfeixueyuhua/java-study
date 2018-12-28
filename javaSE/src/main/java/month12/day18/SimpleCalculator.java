package month12.day18;

import javax.swing.*;
import java.awt.*;

/**
 * 简单计算器
 *
 * @author dage
 */
public class SimpleCalculator extends JFrame {

    public SimpleCalculator() throws HeadlessException {
        setTitle("计算器");
        setSize(300, 300);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Container container = getContentPane(); // 新建一个容器

        JButton ascetainButton = new JButton("确定");
        JButton cancelButton = new JButton("取消");
        JButton exitButton = new JButton("退出");

        JPanel pnlNorth = new JPanel();  // 北面面板
        JPanel pnlCenter = new JPanel();  // 中间面板

        container.add(pnlNorth, BorderLayout.WEST);
        container.add(pnlCenter, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        new SimpleCalculator().setVisible(true);
    }

}
