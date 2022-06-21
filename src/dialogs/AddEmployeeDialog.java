package dialogs;

import java.awt.Frame;

import javax.swing.JDialog;
import java.awt.Color;
import gui.EmployeeInfoPanel;


public class AddEmployeeDialog extends JDialog{
	private static final long serialVersionUID = 3591599721565020284L;
	
	public AddEmployeeDialog(Frame parent, String title, boolean modal) {
		super(parent, title, modal);
		setSize(700,600);
		setLocationRelativeTo(parent);
		setResizable(false);
		
		EmployeeInfoPanel addEmplDialogPanel=new EmployeeInfoPanel();
		addEmplDialogPanel.setBackground(new Color(61,61,61));
		this.add(addEmplDialogPanel);

	}
}
