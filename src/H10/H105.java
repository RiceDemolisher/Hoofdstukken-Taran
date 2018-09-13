package H10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class H105 extends Applet {
    TextField tekstvak;
    Label label;
    String s, tekst;
    Button knop;
    int Getal;
    int Getal1;

    public void init() {
        tekstvak = new TextField("", 20);
        knop = new Button("Gemiddelde");
        //knop.addActionListener(new KnopListener());
        label = new Label("Type Cijfer:");
        tekstvak.addActionListener(new TekstvakListener());
        tekst = "";
        add(label);
        add(knop);
        add(tekstvak);
    }

    public void paint(Graphics g) {
        g.drawString("" + Getal1 + tekst, 50, 60);
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            Getal = Integer.parseInt(s);
            Getal1 = Getal;
            if (Getal > 6) {
                tekst = " Voldoende";
                repaint();
            }
            else {
                tekst = " Onvoldoende";
                repaint();
            }


        }
    }
}