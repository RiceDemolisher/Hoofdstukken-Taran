package H10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class H102 extends Applet {
    TextField tekstvak;
    Label label, label1;
    String s, tekst;
    int Getal, Getal1, Getal2;

    public void init() {
        tekstvak = new TextField("", 20);
        label = new Label("Type Getal:");
        tekstvak.addActionListener(new TekstvakListener());
        tekst = "";
        add(label);
        add(tekstvak);
    }

    public void paint(Graphics g) {
        g.drawString("Grooste getal: " + Getal1, 50, 60);
        g.drawString("Kleinste Getal: " + Getal2, 50, 80);
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            Getal = Integer.parseInt(s);
            if (Getal > Getal1) {
                Getal1 = Getal;


                repaint();
            }

            }


        }

    }

