package listeners;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import java.awt.Color;


public abstract class ToolbarMouseListener implements MouseListener{
	
	public void mouseEntered(java.awt.event.MouseEvent evt) {
        JButton jButton = new JButton();
		jButton.setBackground(Color.GREEN);
    }
    public void mouseExited(java.awt.event.MouseEvent evt) {
    	JButton jButton = new JButton();
		jButton.setBackground(Color.GREEN);
    }
    
	public void mousePressed(java.awt.event.MouseEvent evt) {
		
	}

	public void mouseReleased(java.awt.event.MouseEvent evt) {
		
	}
    

}
