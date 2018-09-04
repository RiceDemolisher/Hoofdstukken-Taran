package H06;//Voorbeeld 6.1

import java.awt.*;
import java.applet.*;


public class H062 extends Applet {
    int a;
    int b;
    int c;
    int d;
    int e;
    int Secondenineenjaar;
    int Secondenineenmaand;
    int Secondenineendag;
    int Secondenineenuur;

    public void init() {
        a = 60;
        b = 60;
        c = 24;
        d = 30;
        e = 365;
        Secondenineenuur = a*b;
        Secondenineendag = Secondenineenuur*c;
        Secondenineenmaand = Secondenineendag*d;
        Secondenineenjaar = Secondenineenmaand*e;
    }

    public void paint(Graphics g) {
        g.drawString("Aantal seconden in een uur: " + Secondenineenuur, 20, 20);
        g.drawString("Aantal seconden in een dag: " + Secondenineendag, 20, 40);
        g.drawString("Aantal seconden in een maand: " + Secondenineenmaand, 20, 60);
        g.drawString("Aantal seconden in een jaar: " + Secondenineenjaar, 20, 80);
    }
}
