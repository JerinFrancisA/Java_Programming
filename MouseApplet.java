import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class MouseApplet extends Applet implements MouseListener, MouseMotionListener{
	String msg = "";
	int x = 0, y = 0;
	
	public void init() {
		addMouseListener(this);
		addMouseMotionListener(this);
	}
	public void paint(Graphics g) {
		g.drawString(msg, 10, 10);
	}
	public void mouseMoved(MouseEvent me) {
		msg = "Moving Mouse";
		showStatus("Moving mouse at : " + me.getX() + ", " + me.getY());
		repaint();
	}
	public void mouseClicked(MouseEvent me) {
		msg = "Mouse clicked";
		repaint();
	}
	public void mousePressed(MouseEvent me) {
		msg = "DOWN";
		repaint();
	}
	public void mouseDragged(MouseEvent me) {
		msg = "Draging Mouse";
		showStatus("Draging mouse at : " + me.getX() + ", " + me.getY());
		repaint();
	}
	public void mouseEntered(MouseEvent me) {
		msg = "Mouse Entered";
		repaint();
	}
	public void mouseExited(MouseEvent me) {
		msg = "Mouse Exited";
		repaint();
	}
	public void mouseReleased(MouseEvent me) {
		msg = "UP";
		repaint();
	}
}
