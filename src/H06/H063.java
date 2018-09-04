package H06;//Voorbeeld 6.1

import java.awt.*;
import java.applet.*;


public class H063 extends Applet {
    int a;
    int b;
    int uitkomst;
    // A= Bedrag B= Aantal personen
    public void init() {
        a = 1;
        b = 1;
        uitkomst = a+b;
    }

    public void paint(Graphics g) {
        g.drawString("1+1=" + -uitkomst, 20, 20);
    }
}
