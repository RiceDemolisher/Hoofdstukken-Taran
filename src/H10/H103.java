// Voorbeeld 10.5

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class H103 extends Applet {
    TextField tekstvak, tekstvak1;
    Label label;
    String s, tekst;
    int dag;

    public void init() {
        tekstvak = new TextField("", 5);
        tekstvak1 = new TextField("", 5);
        label = new Label("Maandnummer");
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
                    tekst = "Januari 31 Dagen";
                    break;
                case 2:
                    tekst = "Februari 28 Dagen";
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
}


