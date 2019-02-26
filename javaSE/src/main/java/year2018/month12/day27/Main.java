package year2018.month12.day27;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    List<Icon> icons = new ArrayList<Icon>();
    private JButton button1;
    private JPanel panel1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton startgame;
    private JButton cancel;
    private List<JButton> jButtons = new ArrayList<JButton>();

    public Main() {

        String url = "D:\\Projects\\IdeaProjects\\javaStudy\\javaSE\\src\\main\\java\\year2018.month12\\day27\\cat_";
        for (int i = 1; i <= 9; i++) {
            Icon icon = new ImageIcon(url + i + ".jpg");
            icons.add(icon);
        }

        button1.setIcon(icons.get(0));
        button2.setIcon(icons.get(1));
        button3.setIcon(icons.get(2));
        button4.setIcon(icons.get(3));
        button5.setIcon(icons.get(4));
        button6.setIcon(icons.get(5));
        button7.setIcon(icons.get(6));
        button8.setIcon(icons.get(7));
        button9.setIcon(icons.get(8));

        jButtons.add(button1);
        jButtons.add(button2);
        jButtons.add(button3);
        jButtons.add(button4);
        jButtons.add(button5);
        jButtons.add(button6);
        jButtons.add(button7);
        jButtons.add(button8);
        jButtons.add(button9);


        startgame.addMouseListener(new MouseAdapter() {
            /**
             * {@inheritDoc}
             *
             * @param e
             */
            @Override
            public void mouseClicked(MouseEvent e) {
                Collections.shuffle(jButtons);
                button1 = jButtons.get(0);
                button2 = jButtons.get(1);
                button3 = jButtons.get(2);
                button4 = jButtons.get(3);
                button5 = jButtons.get(4);
                button6 = jButtons.get(5);
                button7 = jButtons.get(6);
                button8 = jButtons.get(7);
                button9 = jButtons.get(8);

            }
        });
    }

    public static void main(String[] args) {
        Main a = new Main();

    }

    private void createUIComponents() {

    }

    public void setData(AA data) {
    }

    public void getData(AA data) {
    }

    public boolean isModified(AA data) {
        return false;
    }
}
