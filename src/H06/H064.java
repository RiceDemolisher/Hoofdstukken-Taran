package H06;//Voorbeeld 6.1

import java.awt.*;
import java.applet.*;


public class H064 extends Applet {
    double a;
    double b;
    double c;
    double uitkomst;
    double uitkomst1;
    // A= Bedrag B= Aantal personen
    public void init() {
        a = 5.9;
        b = 6.3;
        c = 6.9;
        uitkomst = a+b+c/3;
        uitkomst1 = uitkomst*10/10;
    }


    public void paint(Graphics g) {
        g.drawString("Ieder persoon krijgt: " + uitkomst1, 20, 20);
    }
}
