import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class TextFieldTry extends Applet implements ActionListener{
	int ans = 0;
	TextField t1 = new TextField(10);
	TextField t2 = new TextField(10);
	public void init() {
		Button b1 = new Button("+");
		Button b2 = new Button("-");
		Button b3 = new Button("*");
		Button b4 = new Button("/");
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		add(new Label("ENTER A : "));
		add(t1);
		add(new Label("ENTER B : "));
		add(t2);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
	}
	public void paint(Graphics g) {
		g.drawString("ANS = " + ans, 20, 100);
	}
	public void actionPerformed(ActionEvent ae) {
		int a = Integer.parseInt(t1.getText());
		int b = Integer.parseInt(t2.getText());
		if(ae.getActionCommand() == "+") {
			ans = a + b;
			repaint();
		}
		if(ae.getActionCommand() == "-") {
			ans = a - b;
			repaint();
		}
		if(ae.getActionCommand() == "*") {
			ans = a * b;
			repaint();
		}
		if(ae.getActionCommand() == "/") {
			ans = a / b;
			repaint();
		}
	}
}
