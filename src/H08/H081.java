// Voorbeeld 8.5
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class H081 extends Applet {
    TextField tekstvak;
    Label label;
    Button knop1;
    String s, text;
    Button knop;

    public void init() {
        tekstvak = new TextField("Klik op mij", 20);
        knop1 = new Button("Enter");
        knop1.addActionListener( new Knop1Listener() );
        knop = new Button("Reset");
        knop.addActionListener(new KnopListener());
        label = new Label("Type iets in het tekstvak " +
                "en druk op enter");

        add(label);
        add(knop1);
        add(knop);
        add(tekstvak);
        s = "";
    }

    public void paint(Graphics g) {
        g.drawString(text, 50, 90 );
    }

    class Knop1Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            text = s;
            repaint();
        }
    }
    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            text = " ";
            tekstvak.setText(" ");
            repaint();
        }
    }
}