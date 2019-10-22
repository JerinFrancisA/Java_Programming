import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class KeyApplet extends Applet implements KeyListener{
	String msg = "";
	
	public void init() {
		addKeyListener(this);
	}
	public void paint(Graphics g) {
		g.drawString(msg, 10, 10);
	}
	public void keyReleased(KeyEvent ke) {
		showStatus("UP");
	}
	public void keyPressed(KeyEvent ke) {
		showStatus("DOWN");
	}
	public void keyTyped(KeyEvent ke) {
		msg = msg + Character.toString(ke.getKeyChar());
		repaint();
	}
}
