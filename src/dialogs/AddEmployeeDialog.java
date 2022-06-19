package dialogs;

import java.awt.Frame;

import javax.swing.JDialog;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import javax.swing.ImageIcon;
import javax.swing.JSplitPane;
import javax.swing.WindowConstants;

import classes.Adress;
import classes.Employee;
import classes.Software;

import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

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
