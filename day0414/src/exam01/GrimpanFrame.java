package exam01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class GrimpanFrame extends JFrame{

	GrimpanPanel3 gp;
	
	
	public GrimpanFrame() {
		// TODO Auto-generated constructor stub
		
		gp = new GrimpanPanel3();
		
		
		JMenuBar jmb = new JMenuBar();
		JMenu jm = new JMenu("그리기 도구");
		JMenuItem mn_Line = new JMenuItem("선 그리기");
		JMenuItem mn_Oval = new JMenuItem("원 그리기");
		JMenuItem mn_Rect = new JMenuItem("사각형 그리기");
		
		jm.add(mn_Line);
		jm.add(mn_Oval);
		jm.add(mn_Rect);
		jmb.add(jm);
		setJMenuBar(jmb);
		
		setSize(400, 300);
		add(gp);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		mn_Line.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				gp.setDraw_type(0);
			}
		});
		mn_Line.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				gp.setDraw_type(1);
			}
		});
		mn_Line.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				gp.setDraw_type(2);
			}
		});
	}
	
	public static void main(String[] args) {
		GrimpanFrame gf = new GrimpanFrame();
	}
	
	
}
