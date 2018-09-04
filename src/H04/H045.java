import java.awt.*;
import java.applet.*;

public class H045 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.drawArc(100, 100, 300, 100, 80, 360);


    }


}