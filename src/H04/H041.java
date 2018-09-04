import java.awt.*;
import java.applet.*;

public class H041 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        g.drawLine(200, 0, 0, 400);
        g.drawLine(200, 0, 400, 400);
        g.drawLine(0, 400, 400, 400);
    }
}
