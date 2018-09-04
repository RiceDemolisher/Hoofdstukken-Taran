import java.awt.*;
import java.applet.*;

public class H042 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        g.drawLine(200, 0, 0, 200);
        g.drawLine(200, 0, 400, 200);
        g.drawLine(0, 200, 400, 200);
        g.drawLine(0, 200, 0, 400);
        g.drawLine(400, 400, 0, 400);
        g.drawLine(400, 400, 400, 200);
        g.drawLine(170, 400, 170, 320);
        g.drawLine(230, 400, 230, 320);
        g.drawLine(230, 320, 170, 320);
        g.drawLine(340, 320, 300, 320);
        g.drawLine(340, 300, 300, 300);
        g.drawLine(340, 320, 340, 300);
        g.drawLine(300, 300, 300, 320);

    }
}
