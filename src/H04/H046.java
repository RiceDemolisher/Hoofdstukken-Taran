import java.awt.*;
import java.applet.*;

public class H046 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.fillRect(0,0,150, 500);
        g.setColor(Color.green);
        g.fillOval(25,50,100,100);
        g.setColor(Color.orange);
        g.fillOval(25,200,100,100);
        g.setColor(Color.red);
        g.fillOval(25,350,100,100);
    }





}
