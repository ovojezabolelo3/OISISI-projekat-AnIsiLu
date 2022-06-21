package gui;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.border.LineBorder;

import dialogs.AboutUsDialog;
import dialogs.AddEmployeeDialog;
import dialogs.AddSoftwareDialog;
import tables.EmployeeJTable;
import tables.SoftwareJTable;

public class MyToolbar extends JToolBar {
	
	private static final long serialVersionUID = 1307178798190736592L;
	
	public MyToolbar() {
		
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
			
			
			JButton btnSoft = new JButton("Software",new ImageIcon("images/icons8-google-code-24.png"));
			btnSoft.setPreferredSize(dimensionButton);
			btnSoft.setBackground(new Color(121,121,121));
			
			
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
			
			
			JButton btnSoft = new JButton("Software",new ImageIcon("images/icons8-google-code-24.png"));
			btnSoft.setPreferredSize(dimensionButton);
			btnSoft.setBackground(new Color(121,121,121));
			
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
		
		/*btnDelete.addActionListener(new ActionListener() {
			
			@Override
			 public void actionPerformed(ActionEvent e) {
		        // check for selected row first
		        if (TableEm.getSelectedRow() != -1) {
		            // remove selected row from the model
		        	TableEm.remove(TableEm.getSelectedRow());
		        }
		    }
		});*/
		
	
		add(btnCreate);
		add(btnEdit);
		add(btnDelete);

	}

}