import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Rectangle2D;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawCable extends JPanel{
	
	
	//private JFrame f;
	private int x = 0;
	private int y = 0;
	private int width;
	private int high;
	private boolean right = true;
	
	DrawCable(int w, int h){
		this.width = w;
		this.high = h;
	}
	

	public void moveBall() {
		x = x + 1;
		y = y + 1;
	}
	
	
	
	
	
	@Override
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setStroke(new BasicStroke(5));
		g2d.setColor(Color.PINK);
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		Rectangle2D.Double r = new Rectangle2D.Double(100,250,100,250);
		g2d.fill(r);
		g2d.drawLine(100,100,50,50);

		
		
	}
}
