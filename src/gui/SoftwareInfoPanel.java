package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;


import javax.sound.sampled.BooleanControl;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;



//ovo treba zbog omogucavanja dodavanja fajla korisniku
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
///////////////////////////////////////////////////////

public class SoftwareInfoPanel extends JPanel {
	
	private Color bg_color=new Color(61,61,61);
	
	public SoftwareInfoPanel() {
		super(new BorderLayout());
		setBackground(bg_color);
		
		Dimension dimension=new Dimension(120,20);
		
		JPanel panSoftName=new JPanel(new FlowLayout(FlowLayout.LEFT));
		panSoftName.setBackground(bg_color);
		JLabel lblSoftName=new JLabel("Software:");
		lblSoftName.setForeground(Color.white);
		lblSoftName.setPreferredSize(dimension);
		
		panSoftName.add(lblSoftName, BorderLayout.WEST);
		
		
		////////////Ubacivanje fajla //////////////////
		//JButton addFileButton=new JButton("Add File");
		//addFileButton.setBounds(150,310,100,40);
		
		JTextField txtSoftware=new JTextField(10);
		txtSoftware.setPreferredSize(dimension);
		panSoftName.add(txtSoftware, BorderLayout.WEST);
		
		JPanel panModifiers=new JPanel(new FlowLayout(FlowLayout.LEFT));
		panModifiers.setBackground(bg_color);
		JLabel lblModifiers=new JLabel("Modifiers:");
		lblModifiers.setForeground(Color.white);
		lblModifiers.setPreferredSize(dimension);
		
		JPanel panFileFormat=new JPanel(new FlowLayout(FlowLayout.LEFT));
		panFileFormat.setBackground(bg_color);
		JLabel lblFileFormat=new JLabel("File format:");
		lblFileFormat.setPreferredSize(dimension);
		lblFileFormat.setForeground(Color.white);
		panFileFormat.add(lblFileFormat);
		
		/////////CHECKBOX za file format/////////////////
		JCheckBox chBfbx=new JCheckBox(".fbx");
		chBfbx.setBackground(bg_color);
		chBfbx.setForeground(Color.white);
		panFileFormat.add(chBfbx);
		JCheckBox chBobj=new JCheckBox(".obj");
		chBobj.setBackground(bg_color);
		chBobj.setForeground(Color.white);
		panFileFormat.add(chBobj);
		
		panModifiers.add(lblModifiers,BorderLayout.WEST);
		
		/////////CHECKBOX za modifikatore/////////////////
		JCheckBox chBMod1=new JCheckBox("Edit Poly");
		chBMod1.setBackground(bg_color);
		chBMod1.setForeground(Color.white);
		panModifiers.add(chBMod1,BorderLayout.WEST);
		
		JCheckBox chBMod2=new JCheckBox("Cloth");
		chBMod2.setBackground(bg_color);
		chBMod2.setForeground(Color.white);
		panModifiers.add(chBMod2,BorderLayout.WEST);
		
		JCheckBox chBMod3=new JCheckBox("Normals");
		chBMod3.setBackground(bg_color);
		chBMod3.setForeground(Color.white);
		panModifiers.add(chBMod3,BorderLayout.WEST);
		
		JCheckBox chBMod4=new JCheckBox("Turbosmooth");
		chBMod4.setBackground(bg_color);
		chBMod4.setForeground(Color.white);
		panModifiers.add(chBMod4,BorderLayout.WEST);
		//////////////////////////////////////////////////
		
		JPanel panOkCancel=new JPanel();
		panOkCancel.setBackground(Color.WHITE);
		panOkCancel.setPreferredSize(new Dimension(30,60));
		
		JButton btnOK=new JButton("OK");
		JButton btnCancel=new JButton("Cancel");
		panOkCancel.add(btnOK);
		panOkCancel.add(btnCancel);
		
		/////Dugme za dodavanje BRUSH-a///////////
		JPanel panAddBrushSoftware=new JPanel();
		panAddBrushSoftware.setBackground(bg_color);
		
		Icon brushIcon=new ImageIcon("images/icons8-paint-24.png");
		JButton btnAddBrush=new JButton(brushIcon);
		//panSoftName.add(btnAddBrush);
		Icon renderIcon=new ImageIcon("images/icons8-google-images-24.png");
		JButton btnAddRender=new JButton(renderIcon);
		panAddBrushSoftware.add(btnAddBrush);
		panAddBrushSoftware.add(btnAddRender);
		
		
		
		Box boxSoftwareInfo=Box.createVerticalBox();
		boxSoftwareInfo.add(panSoftName);
		//boxSoftwareInfo.add(Box.createVerticalStrut(20));
		//boxSoftwareInfo.add(btnAddBrush,BorderLayout.WEST);
		//boxSoftwareInfo.add(Box.createVerticalStrut(20));
		//boxSoftwareInfo.add(btnAddRender);
		add(boxSoftwareInfo, BorderLayout.NORTH);
		
		Box boxBrushRender=Box.createVerticalBox();
		boxBrushRender.add(panAddBrushSoftware);
		add(boxBrushRender,BorderLayout.WEST);
		
		Box boxModifiers=Box.createHorizontalBox();
		boxModifiers.add(panModifiers);
		boxModifiers.add(panFileFormat);
		add(boxModifiers, BorderLayout.CENTER);
		
		Box boxOkCancel=Box.createVerticalBox();
		boxOkCancel.add(Box.createVerticalStrut(20));
		boxOkCancel.add(panOkCancel);
		boxOkCancel.add(Box.createGlue());
		add(boxOkCancel,BorderLayout.SOUTH);
		
		
	}
}
