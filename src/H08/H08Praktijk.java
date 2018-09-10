import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class H08Praktijk extends Applet {
    TextField tekstvak, tekstvak1;
    Label label;
    double num1, num2;
    double getal;
    Button knopx, knopplus, knopmin, knopdeel ;
    String s, text;


    public void init() {
        tekstvak = new TextField("", 10);
        tekstvak1 = new TextField("", 10);
        label = new Label("Type een getal");
        knopx = new Button("x");
        knopx.addActionListener( new KnopListener());
        knopplus = new Button("+");
        knopplus.addActionListener( new KnopplusListener());
        knopmin = new Button("-");
        knopmin.addActionListener( new KnopminListener());
        knopdeel = new Button("/");
        knopdeel.addActionListener( new KnopdeelListener());
        add(label);
        add(tekstvak);
        add(tekstvak1);
        add(knopx);
        add(knopplus);
        add(knopmin);
        add(knopdeel);
        s = "";
    }

    public void paint(Graphics g) {
        tekstvak.setText(""+getal);

    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            num1 = Double.parseDouble( s );
            String text = tekstvak1.getText();
            num2 = Double.parseDouble(text);
            getal = Double.parseDouble( s );
            getal = num1*num2;
            repaint();
        }
    }
    class KnopplusListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            num1 = Double.parseDouble( s );
            String text = tekstvak1.getText();
            num2 = Double.parseDouble(text);
            getal = Double.parseDouble( s );
            getal = num1+num2;
            repaint();
        }
    }
    class KnopminListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            num1 = Double.parseDouble(s);
            String text = tekstvak1.getText();
            num2 = Double.parseDouble(text);
            getal = Double.parseDouble(s);
            getal = num1 - num2;
            repaint();
        }
    }
    class KnopdeelListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            num1 = Double.parseDouble(s);
            String text = tekstvak1.getText();
            num2 = Double.parseDouble(text);
            getal = Double.parseDouble(s);
            getal = num1 / num2;
            repaint();

        }
    }

}