package H061;//Voorbeeld 6.1

import java.awt.*;
import java.applet.*;


public class H061 extends Applet {
    int a;
    int b;
    int uitkomst;
    // A= Bedrag B= Aantal personen
    public void init() {
        a = 113;
        b = 4;
        uitkomst = a/b;
    }

    public void paint(Graphics g) {
        g.drawString("Ieder persoon krijgt: " + uitkomst, 20, 20);
    }
}
