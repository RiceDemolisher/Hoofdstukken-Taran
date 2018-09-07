import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class H083 extends Applet {
    TextField tekstvak;
    Label label;
    double num1;
    double getal;

    public void init() {
        tekstvak = new TextField("", 20);
        label = new Label("Type een getal");
        tekstvak.addActionListener( new TekstvakListener() );
        add(label);
        add(tekstvak);
    }

    public void paint(Graphics g) {
        g.drawString("Incl BTW is " + getal , 50, 60 );
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            num1 = Double.parseDouble( s );
            getal = Double.parseDouble( s );
            getal = num1*1.21;

            repaint();
        }
    }
}