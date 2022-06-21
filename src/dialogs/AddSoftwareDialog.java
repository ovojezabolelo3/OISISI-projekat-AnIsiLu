package dialogs;

import java.awt.Frame;
import javax.swing.JDialog;
import java.awt.Color;
import gui.SoftwareInfoPanel;

public class AddSoftwareDialog extends JDialog {
	
	private static final long serialVersionUID = 3591599721565020284L;
	
	public AddSoftwareDialog(Frame parent, String title, boolean modal) {
		super(parent, title, modal);
		setSize(750,400);
		setLocationRelativeTo(parent);
		setResizable(false);
		
		SoftwareInfoPanel addSoftwareDialogPanel=new SoftwareInfoPanel();
		addSoftwareDialogPanel.setBackground(new Color(61,61,61));
		this.add(addSoftwareDialogPanel);
	
	}

}
