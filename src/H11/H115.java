/*

@(#)Show.java 1.0 03/02/26

*

Voorbeeld 2.1

*

*/

import java.awt.*;
import java.applet.*;

public class H115 extends Applet {


    public void init() {
        setBackground(Color.WHITE);

    }

    public void paint(Graphics g) {
        int x = 21;
        for( int count = 0; count < 5; count++){
            x =x+10;
            g.drawRect(x, x, 10, 10);
        }
    }

}