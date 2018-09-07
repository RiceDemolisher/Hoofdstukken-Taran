import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class H082 extends Applet {
    TextField tekstvak;
    Label label;
    int getal1,getal2, getal3, getal4;
    Button knop1, knop2, knop3, knop4;

    public void init() {
        knop1 = new Button("Man");
        knop1.addActionListener(new Knop1Listener());
        knop2 = new Button("Mannelijke Leerling");
        knop2.addActionListener(new Knop2Listener());
        knop3 = new Button("Vrouw");
        knop3.addActionListener(new Knop3Listener());
        knop4 = new Button("Vrouwlijke Leerling");
        knop4.addActionListener(new Knop4Listener());


        add(knop1);
        add(knop2);
        add(knop3);
        add(knop4);
    }

    public void paint(Graphics g) {
        g.drawString("Man " + getal1 , 50, 60 );
        g.drawString("Mannelijk Leerling " + getal2 , 50, 70 );
        g.drawString("Vrouw " + getal3 , 50, 80 );
        g.drawString("Vrouwlijke Leerling " + getal4 , 50, 90 );
    }


    class Knop1Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            getal1 = 0 + getal1;
            getal1++;

            repaint();
        }


    }
    class Knop2Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            getal2 = 0 + getal2;
            getal2++;

            repaint();
        }

    }
    class Knop3Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            getal3 = 0 + getal3;
            getal3++;

            repaint();
        }

    }
    class Knop4Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            getal4 = 0 + getal4;
            getal4++;

            repaint();
        }

    }
}
