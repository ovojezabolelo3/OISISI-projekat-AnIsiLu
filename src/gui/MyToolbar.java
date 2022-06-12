package gui;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JToolBar;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;

import listeners.ToolbarMouseListener;

public class MyToolbar extends JToolBar {
	
	private static final long serialVersionUID = 1307178798190736592L;
	
	public MyToolbar() {
		
		//UIManager uiToolbar=new UIManager();
		//uiToolbar.put("Toolbar.background", Color.DARK_GRAY);
		
		//uiToolbar.put("Button.background", new Color(51,51,51));
		
		
		JButton btnCreate = new JButton("", new ImageIcon("images/icons8-plus-+-24.png"));
		btnCreate.setBackground(new Color(61,61,61));
		btnCreate.setBorder(new LineBorder(new Color(61,61,61)));
		
		btnCreate.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				btnCreate.setBackground(new Color(38,38,38));
				
			}
			public void mouseExited(java.awt.event.MouseEvent evt) {
				btnCreate.setBackground(new Color(61,61,61));
				
			}
			
			 
		});
		
		
		JButton btnEdit = new JButton("", new ImageIcon("images/icons8-edit-24.png"));
		btnEdit.setBackground(new Color(61,61,61));
		btnEdit.setBorder(new LineBorder(new Color(61,61,61)));
		
		btnEdit.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				btnEdit.setBackground(new Color(38,38,38));
				
			}
			public void mouseExited(java.awt.event.MouseEvent evt) {
				btnEdit.setBackground(new Color(61,61,61));
				
			}
			
			
		});
		
		
		JButton btnDelete = new JButton("", new ImageIcon("images/icons8-trash-24.png"));
		btnDelete.setBackground(new Color(61,61,61));
		btnDelete.setBorder(new LineBorder(new Color(61,61,61)));
		
		btnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				btnDelete.setBackground(new Color(38,38,38));
				
			}
			public void mouseExited(java.awt.event.MouseEvent evt) {
				btnDelete.setBackground(new Color(61,61,61));
				
			}
			
			
		});
	
		add(btnCreate);
		add(btnEdit);
		add(btnDelete);

	}

}