package listeners;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.WindowConstants;


public class MyWindowListener implements WindowListener {
	
	@Override
	public void windowActivated(WindowEvent arg0) {
	
	}
	
	@Override
	public void windowClosed(WindowEvent arg0) {
		
	}
	
	@Override
	public void windowClosing(WindowEvent arg0) {
		JFrame frame=(JFrame) arg0.getComponent();
		
		UIManager uiManager=new UIManager();
		uiManager.put("OptionPane.background", new Color(51,51,51));
		uiManager.put("Panel.background", new Color(51,51,51));
		uiManager.put("OptionPane.messageForeground", Color.white);
		
		
		int code=JOptionPane.showConfirmDialog(frame, "Are you sure you want to close application?","Close application?", JOptionPane.YES_NO_OPTION);
		
		
		
		//PROVERI PONOVO KAKO BI MOGLA DA SE PROMENI DIFOLTNA IKONICA NA PROZORU!!!!!!
		//ImageIcon questionMarkIcon=new ImageIcon("images/icons8-hardworking-64.png");
		
		//frame.setIconImage(questionMarkIcon.getImage());
		
		if(code!=JOptionPane.YES_OPTION){
			frame.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
		} else {
			frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		}
	}
	
	@Override
	public void windowDeactivated(WindowEvent arg0) {
		
	}
	
	@Override
	public void windowDeiconified(WindowEvent arg0) {
		
	}
	
	@Override
	public void windowIconified(WindowEvent arg0) {
		
	}
	
	@Override
	public void windowOpened(WindowEvent arg0) {
		
	}

}
