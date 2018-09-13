// Voorbeeld 10.5

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class H104 extends Applet {
    TextField tekstvak, tekstvak1;
    Label label;
    String s, tekst, tekst1;
    int dag, jaartal, dag1;

    public void init() {
        tekstvak1 = new TextField("", 5);
        tekstvak = new TextField("", 5);
        label = new Label("Jaartal en Maandnummer");
        tekstvak.addActionListener(new TekstvakListener());
        tekstvak1.addActionListener(new Tekstvak1Listener());
        tekst = "";
        tekst1 = "";
        add(label);
        add(tekstvak1);
        add(tekstvak);

    }

    public void paint(Graphics g) {
        g.drawString(tekst, 50, 55);
        g.drawString(tekst1, 50, 70);
        g.drawString("Druk eerst enter op de jaartal en dan op de maandnummer", 10, 90);

    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            dag = Integer.parseInt(s);
            switch (dag) {
                case 1:
                    tekst = "Januari 31 Dagen";
                    break;
                case 2:
                    tekst = "Februari "+ dag1 +" Dagen";
                    break;
                case 3:
                    tekst = "Maart 31 Dagen";
                    break;
                case 4:
                    tekst = "April 30 Dagen";
                    break;
                case 5:
                    tekst = "Mei 31 Dagen";
                    break;
                case 6:
                    tekst = "Juni 30 Dagen";
                    break;
                case 7:
                    tekst = "Juli 31 Dagen";
                    break;
                case 8:
                    tekst = "Augustus 31 Dagen";
                    break;
                case 9:
                    tekst = "September 30 Dagen";
                    break;
                case 10:
                    tekst = "Oktober 31 Dagen";
                    break;
                case 11:
                    tekst = "November 30 Dagen";
                    break;
                case 12:
                    tekst = "December 31 Dagen";
                    break;
                default:
                    tekst = "U hebt een verkeerd nummer ingetikt ..!";
                    break;
            }
            repaint();
        }
    }
    class Tekstvak1Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak1.getText();
            jaartal = Integer.parseInt( s);
            if ( (jaartal % 4 == 0 && !(jaartal % 100 == 0)) ||
                    jaartal % 400 == 0 ) {
                tekst1 = ""+ jaartal + " is een schrikkeljaar";
                dag1 = 29;
            }
            else {
                tekst1 = ""+ jaartal + " is geen schrikkeljaar";
                dag1 = 28;
            }
            repaint();
        }
    }
}


