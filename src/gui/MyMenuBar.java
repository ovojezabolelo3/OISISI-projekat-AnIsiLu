package gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.UIManager;
import dialogs.AboutUsDialog;
import dialogs.AddEmployeeDialog;
import dialogs.AddSoftwareDialog;



public class MyMenuBar extends JMenuBar{
	
	private static final long serialVersionUID = -7863806568418316202L;
	
	public MyMenuBar() {
		
		UIManager uiMenuBar=new UIManager();
		uiMenuBar.put("MenuBar.background", new Color(61,61,61));
		uiMenuBar.put("Menu.background", new Color(61,61,61));
		uiMenuBar.put("MenuItem.background", new Color(61,61,61));
		
		
		uiMenuBar.put("MenuItem.selectionBackground", new Color(38,38,38));
		uiMenuBar.put("MenuItem.selectionForeground", Color.WHITE);
		uiMenuBar.put("Menu.selectionBackground", new Color(38,38,38));
		uiMenuBar.put("Menu.selectionForeground", Color.WHITE);
		uiMenuBar.put("MenuBar.selectionBackground", new Color(38,38,38));
		uiMenuBar.put("MenuBar.selectionForeground", Color.WHITE);
		
		
		
		JMenu file=new JMenu("File");
		file.setForeground(Color.WHITE);
		
		JMenu fileNew=new JMenu("New");
		fileNew.setIcon(new ImageIcon("images/icons8-plus-+-24.png"));
		fileNew.setForeground(Color.WHITE);
		add(fileNew);
		
		
		JMenuItem fileNewEmployee=new JMenuItem("Employee", new ImageIcon("images/icons8-add-user-male-24.png"));
		fileNewEmployee.setForeground(Color.WHITE);
		
		fileNewEmployee.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				AddEmployeeDialog addingEmployeeDialog=new AddEmployeeDialog(null, "Add a new employee", true);
				addingEmployeeDialog.setVisible(true);
				
			}
		});
		
		JMenuItem fileNewSoftware=new JMenuItem("Software", new ImageIcon("images/icons8-google-code-24.png"));
		fileNewSoftware.setForeground(Color.WHITE);
		fileNewSoftware.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				AddSoftwareDialog addingSoftwareDialog=new AddSoftwareDialog(null, "Add a new software", true);
				addingSoftwareDialog.setVisible(true);
				
			}
		});
		
		
		
		fileNew.add(fileNewEmployee);
		fileNew.addSeparator();
		fileNew.add(fileNewSoftware);
		

		JMenu fileOpen=new JMenu("Open");
		fileOpen.setIcon(new ImageIcon("images/icons8-opened-folder-24.png"));
		fileOpen.setForeground(Color.white);
		add(fileOpen);
		JMenuItem fileOpenEmployee=new JMenuItem("Employee", new ImageIcon("images/icons8-add-user-male-24.png"));
		fileOpenEmployee.setForeground(Color.white);
		fileOpenEmployee.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				AddEmployeeDialog addingEmployeeDialog=new AddEmployeeDialog(null, "Add a new employee", true);
				addingEmployeeDialog.setVisible(true);
			}
		});
		JMenuItem fileOpenSoftware=new JMenuItem("Software", new ImageIcon("images/icons8-google-code-24.png"));
		fileOpenSoftware.setForeground(Color.white);
		fileOpenSoftware.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				AddSoftwareDialog addingSoftwareDialog=new AddSoftwareDialog(null, "Add a new software", true);
				addingSoftwareDialog.setVisible(true);
			}
		});
		
		fileOpen.add(fileOpenEmployee);
		fileOpen.addSeparator();
		fileOpen.add(fileOpenSoftware);
		
		
		
		
		JMenuItem fileClose=new JMenuItem("Close", new ImageIcon("images/icons8-unavailable-24.png"));
		fileClose.setForeground(Color.WHITE);
		
		file.add(fileNew);
		file.addSeparator();
		file.add(fileOpen);
		file.addSeparator();
		file.add(fileClose);
		
		//https://stackoverflow.com/questions/26762324/swing-how-to-close-jpanel-programmatically
		
		fileClose.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						//zatvara celu aplikaciju 
						System.exit(0);
					}
				});
		
		JMenu edit=new JMenu("Edit");
		edit.setForeground(Color.WHITE);
		JMenuItem editEdit=new JMenuItem("Edit", new ImageIcon("images/icons8-ball-point-pen-24.png"));
		editEdit.setForeground(Color.WHITE);
		JMenuItem editDelete = new JMenuItem("Delete", new ImageIcon("images/icons8-unavailable-24.png"));
		editDelete.setForeground(Color.WHITE);
		
		edit.add(editEdit);
		edit.addSeparator();
		edit.add(editDelete);
		
		
		JMenu help = new JMenu("Help");
		help.setForeground(Color.WHITE);
		JMenuItem helpAbout = new JMenuItem("About", new ImageIcon("images/icons8-about-24.png"));
		helpAbout.setForeground(Color.WHITE);
		helpAbout.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				AboutUsDialog fileOpenAbout=new AboutUsDialog(null, "About Us", true);
				fileOpenAbout.setVisible(true);
			}
		});
		
		help.add(helpAbout);

		
		add(file);
		add(edit);
		add(help);
	}
	
	
}




