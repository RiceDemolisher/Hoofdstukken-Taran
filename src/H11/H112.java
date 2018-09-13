/*

@(#)Show.java 1.0 03/02/26

*

Voorbeeld 2.1

*

*/

import java.awt.*;
import java.applet.*;

public class H112 extends Applet {


    public void init() {
        setBackground(Color.WHITE);

    }

    public void paint(Graphics g) {
        int x = 21;
        for( int count = 0; count < 10; count++){
            x--;
            g.drawString(""+x, 20, 20+count*20);
        }
    }

}