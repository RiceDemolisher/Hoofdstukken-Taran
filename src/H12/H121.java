package H12;

        import java.awt.*;
        import java.applet.*;
        import java.util.*;

public class H121 extends Applet {
    double[] getallen = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};
    double sum = 0;
    double total = 10;

    public void init() {
        Arrays.sort(getallen);
    }

    public void paint(Graphics g) {

        for (int teller = 0; teller < getallen.length; teller ++) {
            g.drawString("" + getallen[teller], 50, 20 * teller + 20);
            sum = sum+getallen[teller];
        }

        sum = sum/total;
        g.drawString("" + sum,190, 20 );
    }
}
