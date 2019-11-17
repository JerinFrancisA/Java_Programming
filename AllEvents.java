import java.awt.*;
import java.applet.*;
import java.awt.event.*;

@SuppressWarnings("deprecation")
public class AllEvents extends Applet implements ActionListener, MouseListener, MouseMotionListener, KeyListener{
	
	int n = 0;
	String msg = "";
	String type = "";
	public void init() {
		Button b1 = new Button("+");
		Button b2 = new Button("-");
		b1.addActionListener(this);
		b2.addActionListener(this);
		addMouseListener(this);
		addMouseMotionListener(this);
		addKeyListener(this);
		add(b1);
		add(b2);
	}
	
	public void paint(Graphics g) {
		g.drawString(Integer.toString(n), 10, 30);
		g.drawString(msg, 50, 30);
	}
	
	public void actionPerformed(ActionEvent ae) {
		if(ae.getActionCommand() == "+") {
			n++;
		}
		else {
			n--;
		}
		repaint();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		type += e.getKeyChar();
		repaint();
	}

	@Override
	public void keyPressed(KeyEvent e) {
		showStatus("DOWN");
		repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		showStatus("UP");
		repaint();
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
