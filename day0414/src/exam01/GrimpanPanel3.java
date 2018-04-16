package exam01;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.sound.midi.MidiDevice.Info;
import javax.swing.JPanel;

public class GrimpanPanel3 extends JPanel implements MouseListener, MouseMotionListener{

	private int x1, y1,x2,y2;
	private int draw_type;
	
	ArrayList<graphicInfo> list;
	
	public GrimpanPanel3() {
		// TODO Auto-generated constructor stub
		
		addMouseListener(this);
		addMouseMotionListener(this);
		
		list = new ArrayList<graphicInfo>();
	}
	
	public int getX1() {
		return x1;
	}

	public void setX1(int x1) {
		this.x1 = x1;
	}

	public int getY1() {
		return y1;
	}

	public void setY1(int y1) {
		this.y1 = y1;
	}

	public int getX2() {
		return x2;
	}

	public void setX2(int x2) {
		this.x2 = x2;
	}

	public int getY2() {
		return y2;
	}

	public void setY2(int y2) {
		this.y2 = y2;
	}
	
	
	public int getDraw_type() {
		return draw_type;
	}

	public void setDraw_type(int draw_type) {
		this.draw_type = draw_type;
	}

	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		for(graphicInfo gp : list){
			int width = gp.getX2()-gp.getX1();
			int height = gp.getY2()-gp.getY1();
			int x = gp.getX1();
			 int y = gp.getY1();
			 if (gp.getX1() > gp.getX2()){
				 width = gp.getX1()-gp.getX2();
			 	 x = gp.getX2();
			 }
			 if(gp.getY1() > gp.getY2()){
				 height = gp.getY1() - gp.getY2();
				 y = gp.getY2();
			 }
			
		g.drawOval(x,y, width, height);
		}
		int width = x2 - x1;
		int height = y2- y1;
		int x = x1;
		int y = y1;
		if (x1 > x2){
			width = x1-x2;
		 	x = x2;
		 }
		 if(y1 > y2){
			height = y1 - y2;
			y = y2;
		 }
		g.drawOval(x,y, width, height);
			
			
			
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {}

	@Override
	public void mousePressed(MouseEvent e) {
		x1 = e.getX();
		y1 = e.getY();
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		x2 = e.getX();
		y2 = e.getY();
		repaint();
		
		list.add(new graphicInfo(x1, x2, y1, y2));
	}

	@Override
	public void mouseEntered(MouseEvent e) {}

	@Override
	public void mouseExited(MouseEvent e) {}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		x2 = e.getX();
		y2 = e.getY();
		repaint();
	}
	@Override
	public void mouseMoved(MouseEvent e) {	}
	
	

	
	
}
