import java.awt.*;
import java.applet.*;

public class H044 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.drawString("20 KG", 0, 450);
        g.drawString("40 KG", 0, 360);
        g.drawString("60 KG", 0, 270);
        g.drawString("80 KG", 0, 180);
        g.drawString("100 KG", 0, 90);
        g.drawRect(50, 0, 500, 450);
        g.drawString("Valerie", 150, 490);
        g.drawString("Jeroen", 300, 490);
        g.drawString("Hans", 450, 490);
        g.fillRect(140, 360, 60, 90);
        g.fillRect(290, 90, 60, 360);
        g.fillRect(440, 180, 60, 270);

    }

}
