package gui;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JToolBar;

public class MyToolbar extends JToolBar {
	
	private static final long serialVersionUID = 1307178798190736592L;
	
	public MyToolbar() {
		JButton btnCreate = new JButton("", new ImageIcon("images/icons8-add-64.png"));
		JButton btnEdit = new JButton("", new ImageIcon("images/icons8-edit-64.png"));
		JButton btnDelete = new JButton("", new ImageIcon("images/icons8-waste-64.png"));

		add(btnCreate);
		add(btnEdit);
		add(btnDelete);

	}

}