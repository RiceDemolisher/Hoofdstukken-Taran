/*

@(#)Show.java 1.0 03/02/26

*

Voorbeeld 2.1

*

*/

import java.awt.*;
import java.applet.*;

public class H021 extends Applet {


    public void init() {
        setBackground(Color.blue);

    }

    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.drawString("Taran Singh", 50, 60 );
    }

}