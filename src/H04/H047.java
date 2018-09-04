import java.awt.*;
import java.applet.*;

public class H047 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.drawRoundRect(20, 20, 400, 400, 40, 40);
        g.fillOval(60, 60, 120, 120);
        g.fillOval(260, 260, 120, 120);
        g.fillOval(260, 60, 120, 120);
        g.fillOval(60, 260, 120, 120);

    }




}
