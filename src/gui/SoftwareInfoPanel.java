package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.sound.sampled.BooleanControl;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class SoftwareInfoPanel extends JPanel {
	public SoftwareInfoPanel() {
		super(new BorderLayout());
		setBorder(new TitledBorder(new EtchedBorder(Color.BLUE, Color.DARK_GRAY),"Software info"));
		setBackground(new Color(150,150,20));
		
		Dimension dimension=new Dimension(120,20);
		
		JPanel panSoftwareName= new JPanel(new FlowLayout(FlowLayout.LEFT));
		panSoftwareName.setBackground(new Color(229,230,249));
		
		JLabel lblSoftwareName=new JLabel("Software:");
		lblSoftwareName.setPreferredSize(dimension);
		
		panSoftwareName.add(lblSoftwareName);
	}
}
