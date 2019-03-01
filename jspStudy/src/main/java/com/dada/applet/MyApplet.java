package com.dada.applet;

import java.applet.Applet;
import java.awt.*;

/**
 * @author dage
 * @date 2019/02/26
 */
public class MyApplet extends Applet {

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.RED);
        g.drawString("我是你爸爸！", 5, 10);
        g.setColor(Color.black);
        g.drawString("儿子！", 5, 20);
        g.setColor(Color.BLUE);
        g.drawString("快叫爸爸", 5, 30);
    }
}
