package sylema;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
@SuppressWarnings("serial")
public class Lab2 extends JPanel implements ActionListener{
	private static int maxWidth;
	private static int maxHeight;
	private double angle = 0;
	private double dx = -1;
	private double tx = -20;
	private double dy = 0;
	private double ty = 0;
	Timer timer;
	public Lab2() {
		
		timer = new Timer(10, this);
		timer.start();
		}
	

public void paint(Graphics g) {
Graphics2D g2d = (Graphics2D) g;
RenderingHints rh =
 new RenderingHints(RenderingHints.KEY_ANTIALIASING,
 RenderingHints.VALUE_ANTIALIAS_ON);
 rh.put(RenderingHints.KEY_RENDERING,
 RenderingHints.VALUE_RENDER_QUALITY);
 g2d.setRenderingHints(rh);
 g2d.drawString("Привіт, Java 2D!", 50, 50);
 g2d.setBackground(new Color(139,0,0));
 g2d.clearRect(0, 0, maxWidth, maxHeight);
 g2d.setColor(Color.white);
 
 GradientPaint gp = new GradientPaint(5, 25,
		 Color.BLACK, 20, 2, Color.GRAY, true);
		 g2d.setPaint(gp);
		 
 BasicStroke bs1 = new BasicStroke(16, BasicStroke.CAP_BUTT,
		 BasicStroke.JOIN_ROUND);
		 g2d.setStroke(bs1);
		 
 g2d.drawRect(30, 100, 1800,860);
 
 g2d.translate(tx, ty);
 
 g2d.rotate(angle, 1539, 434);
 
 g2d.setColor(Color.white);
 g2d.fill(new Ellipse2D.Double(1602,320,150,230));
 
 g2d.setColor(new Color(192,192,192));
 g2d.fill(new Ellipse2D.Double(1612,330,133,213));
 
 g2d.setColor(new Color(139,0,0));
 g2d.fillOval(1510,360,150,150);
 g2d.fillOval(1695,360,150,150);
 
 g2d.setPaint(gp);
 double points[][] = {
		 { 1369, 429 }, { 1369, 439 },{ 1539, 439 },{ 1709, 439 }, { 1709, 429 },{ 1539, 429 }
		 };
		 GeneralPath handle = new GeneralPath();
		 handle.moveTo(points[0][0], points[0][1]);
		 for (int k = 1; k < points.length; k++)
			 handle.lineTo(points[k][0], points[k][1]);
		 handle.closePath();
		 g2d.fill(handle);
 }
 public static void main(String[] args) {
 
 JFrame frame = new JFrame("Привіт, Java 2D!");
 
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
 frame.setSize(10000, 10000);
 
 frame.setLocationRelativeTo(null);
 
 frame.setResizable(false);

 
 frame.add(new Lab2());

 frame.setVisible(true);
 Dimension size = frame.getSize();
 Insets insets = frame.getInsets();
 maxWidth = size.width - insets.left - insets.right - 1;
 maxHeight = size.height - insets.top - insets.bottom - 1;
 }
 public void actionPerformed(ActionEvent e) {
		if ( tx==-1190 && ty ==0) {
		dx=0;
		dy += 1;
		}
		if ( ty ==215 && tx==-1190) {
			dx += 1;
			dy = 0;
		}
		if ( tx==-20 && ty==215) {
			dx = 0;
			dy -= 1;
			}
		if ( ty ==0 && tx==-20) {
			dx -= 1;
			dy = 0;
		} 
		angle -= 0.01;
		tx += dx;
		ty += dy;
		repaint();
		}
}