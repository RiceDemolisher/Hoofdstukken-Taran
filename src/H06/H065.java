package H06;//Voorbeeld 6.3

import java.awt.*;
import java.applet.*;
import java.text.DecimalFormat;


public class H065 extends Applet {
    double a, b, c, uitkomst;


    public void init() {
        a = 8;
        b = 8;
        c = 3;
        uitkomst = (a + b) / c;






    }
    public void paint(Graphics g) {
        g.drawString("Gemiddelde: " + uitkomst, 20, 20);
    }


}
