package gui;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import dialogs.AddEmployeeDialog;
import dialogs.AddSoftwareDialog;



public class MyMenuBar extends JMenuBar{
	
	private static final long serialVersionUID = -7863806568418316202L;
	
//	public MyMenuBar() {
//		
//		JMenu file=new JMenu("File");
//		JMenu fileNew=new JMenu("New");
//		JMenuItem fileNewEmployee=new JMenuItem("Employee", new ImageIcon("images/icons8-hardworking-64.png"));
//		JMenuItem fileNewSoftware=new JMenuItem("Software", new ImageIcon("images/icons8-software-64.png"));
//		fileNew.add(fileNewEmployee);
//		fileNew.addSeparator();
//		fileNew.add(fileNewSoftware);
//		
//		JMenuItem fileOpen=new JMenuItem("Open");
//		JMenuItem fileClose=new JMenuItem("Close");
//		
//		file.add(fileNew);
//		file.addSeparator();
//		file.add(fileOpen);
//		file.addSeparator();
//		file.add(fileClose);
//		file.addSeparator();
//		
//		JMenu help=new JMenu("Help");
//		JMenuItem helpAbout =new JMenuItem("About", new ImageIcon("images/icons8-more-info-64.png"));
//		help.add(helpAbout);
//		
//	}
//
//}
	
	public MyMenuBar() {
		JMenu file=new JMenu("File");
		JMenu fileNew=new JMenu("New");
		fileNew.setIcon(new ImageIcon("images/icons8-add-new-64.png"));
		//dodavanje ActionListener-a///////////////////////
		//fileNew.addActionListener(new MyActionListener1());
		add(fileNew);
		/////////////////////////////////////////////
		
		JMenuItem fileNewEmployee=new JMenuItem("Employee", new ImageIcon("images/icons8-hardworking-64.png"));
		fileNewEmployee.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				AddEmployeeDialog addingEmployeeDialog=new AddEmployeeDialog(null, "Add a new employee", true);
				addingEmployeeDialog.setVisible(true);
				
			}
		});
		
		JMenuItem fileNewSoftware=new JMenuItem("Software", new ImageIcon("images/icons8-software-64.png"));
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
		
		JMenuItem fileOpen=new JMenuItem("Open", new ImageIcon("images/icons8-opened-folder-64.png"));
		JMenuItem fileClose=new JMenuItem("Close", new ImageIcon("images/icons8-close-64.png"));
		
		file.add(fileNew);
		file.addSeparator();
		file.add(fileOpen);
		file.addSeparator();
		file.add(fileClose);
		

		
		JMenu edit=new JMenu("Edit");
		JMenuItem editEdit=new JMenuItem("Edit", new ImageIcon("images/icons8-edit-property-64.png"));
		JMenuItem editDelete = new JMenuItem("Delete", new ImageIcon("images/icons8-remove-64.png"));
		
		edit.add(editEdit);
		edit.addSeparator();
		edit.add(editDelete);
		
		
		JMenu help = new JMenu("Help");
		
		JMenuItem helpAbout = new JMenuItem("About", new ImageIcon("images/icons8-more-info-64.png"));
		
		help.add(helpAbout);

		
		add(file);
		add(edit);
		add(help);
	}

}
