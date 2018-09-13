/*

@(#)Show.java 1.0 03/02/26

*

Voorbeeld 2.1

*

*/

import java.awt.*;
import java.applet.*;

public class H119 extends Applet {


    public void init() {
        setBackground(Color.WHITE);

    }

    public void paint(Graphics g) {
        int x = 0;
        for (int count = 0; count < 8; count++) {
            x = x + 10;
            g.setColor(Color.black);
            g.fillRect(x, x, 10, 10);
        }
        int x1 = 0, y1 = 20;
        for (int count = 0; count < 6; count++) {
            x1 = x1 + 10;
            y1 = y1 + 10;
            g.setColor(Color.black);
            g.fillRect(x1, y1, 10, 10);
        }
        int x2 = 0, y2 = 40;
        for (int count = 0; count < 4; count++) {
            x2 = x2 + 10;
            y2 = y2 + 10;
            g.setColor(Color.black);
            g.fillRect(x2, y2, 10, 10);
        }
        int x3 = 0, y3 = 60;
        for (int count = 0; count < 2; count++) {
            x3 = x3 + 10;
            y3 = y3 + 10;
            g.setColor(Color.black);
            g.fillRect(x3, y3, 10, 10);
        }
        int x4 = 20, y4 = 0;
        for (int count = 0; count < 6; count++) {
            x4 = x4 + 10;
            y4 = y4 + 10;
            g.setColor(Color.black);
            g.fillRect(x4, y4, 10, 10);
        }
        int x5 = 40, y5 = 0;
        for (int count = 0; count < 4; count++) {
            x5 = x5 + 10;
            y5 = y5 + 10;
            g.setColor(Color.black);
            g.fillRect(x5, y5, 10, 10);
        }
        int x6 = 60, y6 = 0;
        for (int count = 0; count < 2; count++) {
            x6 = x6 + 10;
            y6 = y6 + 10;
            g.setColor(Color.black);
            g.fillRect(x6, y6, 10, 10);
        }
    }
}