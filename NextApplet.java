import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class NextApplet extends Applet implements ActionListener {
	
	int n = 0;
	
	public void init() {
		Button b1 = new Button("increase");
		Button b2 = new Button("decrease");
		add(b1);
		add(b2);
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	public void paint(Graphics g) {
		g.drawString("VALUE = " + n, 10, 20);
	}
	public void actionPerformed(ActionEvent ae) {
		if(ae.getActionCommand() == "increase") {
			n++;
		}
		else if(ae.getActionCommand() == "decrease") {
			n--;
		}
		repaint();
	}
}
