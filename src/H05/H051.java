import java.awt.*;
import java.applet.*;

public class H051 extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.YELLOW);
        g.drawString("20 KG", 0, 30);
        g.drawString("40 KG", 0, 50);
        g.drawString("60 KG", 0, 70);
        g.drawString("80 KG", 0, 90);
        g.drawString("100 KG", 0, 110);
        g.drawString("Valerie", 150, 9);
        g.drawString("Jeroen", 300, 9);
        g.drawString("Hans", 450, 9);
        int WeightValerie = 40;
        int WeightJeroen = 80;
        int WeightHans = 100;
        g.fillRect(140, 10, 60, WeightValerie);
        g.fillRect(290, 10, 60, WeightJeroen);
        g.fillRect(440, 10, 60, WeightHans);

    }

}
