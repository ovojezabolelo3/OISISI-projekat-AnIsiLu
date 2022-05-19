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


//ovo treba zbog oogucavanja dodavanja fajla korisniku
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
///////////////////////////////////////////////////////

public class SoftwareInfoPanel extends JPanel {
	public SoftwareInfoPanel() {
		super(new BorderLayout());
		setBorder(new TitledBorder(new EtchedBorder(Color.BLUE, Color.DARK_GRAY),"Software info"));
		setBackground(new Color(150,150,20));
		
		Dimension dimension=new Dimension(120,20);
		
		JPanel panSoftName=new JPanel(new FlowLayout(FlowLayout.LEFT));
		panSoftName.setBackground(new Color(229,230,249));
		JLabel lblSoftName=new JLabel("Software:");
		lblSoftName.setPreferredSize(dimension);
		
		panSoftName.add(lblSoftName, BorderLayout.WEST);
		
		
		////////////Ubacivanje fajla //////////////////
		JButton addFileButton=new JButton("Add File");
		addFileButton.setBounds(150,310,100,40);
		
		
		
		
		
		
		
		
		
		
		
		Box boxSoftwareInfo=Box.createVerticalBox();
		boxSoftwareInfo.add(panSoftName);
		add(boxSoftwareInfo, BorderLayout.CENTER);
		
		
		
	}
}
