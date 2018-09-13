/*

@(#)Show.java 1.0 03/02/26

*

Voorbeeld 2.1

*

*/

import java.awt.*;
import java.applet.*;

public class H114 extends Applet {


    public void init() {
        setBackground(Color.WHITE);

    }

    public void paint(Graphics g) {
        int x = 0;
        for( int count = 1; count < 11; count++){
            x = 3*count;
            g.drawString(""+x, 20, 20+count*20);
        }
    }

}