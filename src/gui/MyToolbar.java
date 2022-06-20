package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;

import dialogs.AboutUsDialog;
import dialogs.AddEmployeeDialog;
import dialogs.AddSoftwareDialog;
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
		
		
		btnCreate.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			JDialog ChooseDialog = new JDialog();
			ChooseDialog.setTitle("What do you want to add?");
			ChooseDialog.setSize(350,100);
			ChooseDialog.setLocationRelativeTo(ChooseDialog);
			ChooseDialog.setResizable(false);
			
			Dimension dimensionButton = new Dimension(150, 55);
			JPanel ChoosePanel=new JPanel();
			ChoosePanel.setBackground(new Color(61,61,61));
			ChooseDialog.add(ChoosePanel);
			
			
			
			JButton btnEmp = new JButton("Employee",new ImageIcon("images/icons8-add-user-male-24.png"));
			btnEmp.setPreferredSize(dimensionButton);
			btnEmp.setBackground(new Color(121,121,121));
			btnEmp.setBorder(new LineBorder(new Color(166,166,166)));
			
			JButton btnSoft = new JButton("Software",new ImageIcon("images/icons8-google-code-24.png"));
			btnSoft.setPreferredSize(dimensionButton);
			btnSoft.setBackground(new Color(121,121,121));
			btnSoft.setBorder(new LineBorder(new Color(166,166,166)));
			
			ChoosePanel.add(btnEmp);
			ChoosePanel.add(btnSoft);
			
			btnEmp.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					ChooseDialog.dispose();
					//JComponent comp = (JComponent) e.getSource();
		            //Window win = SwingUtilities.getWindowAncestor(comp);
					
					AddEmployeeDialog addingEmployeeDialog=new AddEmployeeDialog(null, "Add a new employee", true);
					addingEmployeeDialog.setVisible(true);
			
					
					

				}
				
			});
			
			btnSoft.addActionListener(new ActionListener() {
				//TREBA DA SE OTVORI TAB SA ZAPOSLENIMA ILI SOFTVERIMA, ZNACI NE PROZOR NEGO BAS TAB PISE----->IZMENITI OVAJ LISTENER
				@Override
				public void actionPerformed(ActionEvent e) {
					ChooseDialog.dispose();
					AddSoftwareDialog addingSoftwareDialog=new AddSoftwareDialog(null, "Add a new software", true);
					addingSoftwareDialog.setVisible(true);
				}
			});
			
			ChooseDialog.setVisible(true);
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
		
		btnEdit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			JDialog ChooseDialog = new JDialog();
			ChooseDialog.setTitle("What do you want to edit?");
			ChooseDialog.setSize(350,100);
			ChooseDialog.setLocationRelativeTo(ChooseDialog);
			ChooseDialog.setResizable(false);
			
			Dimension dimensionButton = new Dimension(150, 55);
			JPanel ChoosePanel=new JPanel();
			ChoosePanel.setBackground(new Color(61,61,61));
			ChooseDialog.add(ChoosePanel);
			
			
			
			JButton btnEmp = new JButton("Employee",new ImageIcon("images/icons8-add-user-male-24.png"));
			btnEmp.setPreferredSize(dimensionButton);
			btnEmp.setBackground(new Color(121,121,121));
			//btnEmp.setBorder(new LineBorder(new Color(166,166,166)));
			
			JButton btnSoft = new JButton("Software",new ImageIcon("images/icons8-google-code-24.png"));
			btnSoft.setPreferredSize(dimensionButton);
			btnSoft.setBackground(new Color(121,121,121));
			//btnSoft.setBorder(new LineBorder(new Color(166,166,166)));
			
			ChoosePanel.add(btnEmp);
			ChoosePanel.add(btnSoft);
			
			btnEmp.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					ChooseDialog.dispose();
					AddEmployeeDialog addingEmployeeDialog=new AddEmployeeDialog(null, "Add a new employee", true);
					addingEmployeeDialog.setVisible(true);
				}

			});
			
			btnSoft.addActionListener(new ActionListener() {
				//TREBA DA SE OTVORI TAB SA ZAPOSLENIMA ILI SOFTVERIMA, ZNACI NE PROZOR NEGO BAS TAB PISE----->IZMENITI OVAJ LISTENER
				@Override
				public void actionPerformed(ActionEvent e) {
					ChooseDialog.dispose();
					AddSoftwareDialog addingSoftwareDialog=new AddSoftwareDialog(null, "Add a new software", true);
					addingSoftwareDialog.setVisible(true);
				}
			});
			ChooseDialog.setVisible(true);
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