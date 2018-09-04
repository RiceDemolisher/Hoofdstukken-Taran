import java.awt.*;
import java.applet.*;

public class H043 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.drawLine(0, 0, 0, 400);
        g.setColor(Color.red);
        g.fillRect(0,0,400,100);
        g.setColor(Color.white);
        g.fillRect(0,100,400,200);
        g.setColor(Color.blue);
        g.fillRect(0,200,400,100);
    }
}
