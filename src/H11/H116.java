/*

@(#)Show.java 1.0 03/02/26

*

Voorbeeld 2.1

*

*/

import java.awt.*;
import java.applet.*;

public class H116 extends Applet {


    public void init() {
        setBackground(Color.WHITE);

    }

    public void paint(Graphics g) {
        int x = 0, y = 0, w = 60, h = 60;
        for( int count = 0; count < 5; count++){
            x = x+5;
            y = y+5;
            w = w-10;
            h = h-10;
            g.drawOval(x, y, w, h);
        }
    }

}