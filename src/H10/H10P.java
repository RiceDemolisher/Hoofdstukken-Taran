// Voorbeeld 10.5

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class H10P extends Applet {
    TextField tekstvak, tekstvak1;
    Label label;
    String s, tekst;
    int dag;

    public void init() {
        tekstvak = new TextField("", 5);
        tekstvak1 = new TextField("", 5);
        label = new Label("Voer je Cijfer in");
        tekstvak.addActionListener(new Tekstvak1Listener());
        tekst = "";
        add(label);
        add(tekstvak);

    }

    public void paint(Graphics g) {
        g.drawString(tekst, 50, 60);

    }

    class Tekstvak1Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            dag = Integer.parseInt(s);
            switch (dag) {
                case 1:
                    tekst = "Slecht";
                    break;
                case 2:
                    tekst = "Slecht";
                    break;
                case 3:
                    tekst = "Slecht";
                    break;
                case 4:
                    tekst = "Onvoldoende";
                    break;
                case 5:
                    tekst = "Matig";
                    break;
                case 6:
                    tekst = "Voldoende";
                    break;
                case 7:
                    tekst = "Voldoende";
                    break;
                case 8:
                    tekst = "Goed";
                    break;
                case 9:
                    tekst = "Goed";
                    break;
                case 10:
                    tekst = "Goed";
                    break;
                default:
                    tekst = "Het ingevoerde getal is niet tussen de 1 en de 10";
                    break;
            }
            repaint();
        }
    }
}


