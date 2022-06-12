package gui;

import javax.security.auth.login.FailedLoginException;
import javax.sound.sampled.BooleanControl;

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
		//Ovde treba dodati ono za focus listener, ako cem ga uopste dodavati
		
		///////PANEL ZA IME SOFTVERA//////////////////
		
		JPanel panSoftName=new JPanel(new FlowLayout(FlowLayout.LEFT));
		panSoftName.setBackground(bg_color);
		JLabel lblSoftName=new JLabel("Software:");
		lblSoftName.setForeground(Color.white);
		lblSoftName.setPreferredSize(dimension);
		JTextField txtSoftName=new JTextField(50);
		txtSoftName.setPreferredSize(dimension);
		//txtSoftName.setBackground(Color.gray); <- ovo menjati ako dodamo focus listener
		//ovde treba onda da se doda focus listener na txtSoftName
		
		panSoftName.add(lblSoftName,BorderLayout.WEST);
		panSoftName.add(txtSoftName,BorderLayout.WEST);
		////////////////////////////////////////////////////
		
		/////////PANEL ZA MODIFIKATORE//////////////
		JPanel panSoftModifiers=new JPanel(new FlowLayout(FlowLayout.LEFT));
		panSoftModifiers.setBackground(bg_color);
		JLabel lblSoftModifiers=new JLabel("Modifiers:");
		lblSoftModifiers.setForeground(Color.white);
		lblSoftModifiers.setPreferredSize(dimension);
		panSoftModifiers.add(lblSoftModifiers);
		
		//-----------------------------------------//
		JCheckBox chBMod1=new JCheckBox("Edit Poly");
		chBMod1.setBackground(bg_color);
		chBMod1.setForeground(Color.white);
		panSoftModifiers.add(chBMod1);
		
		//-----------------------------------------//
		
		JCheckBox chBMod2=new JCheckBox("Cloth");
		chBMod2.setBackground(bg_color);
		chBMod2.setForeground(Color.white);
		panSoftModifiers.add(chBMod2);
		//-----------------------------------------//
		
		JCheckBox chBMod3=new JCheckBox("Normals");
		chBMod3.setBackground(bg_color);
		chBMod3.setForeground(Color.white);
		panSoftModifiers.add(chBMod3);
		//-----------------------------------------//
		
		JCheckBox chBMod4=new JCheckBox("Turbosmooth");
		chBMod4.setBackground(bg_color);
		chBMod4.setForeground(Color.white);
		panSoftModifiers.add(chBMod4);
		
		//-----------------------------------------//
		
		/////PANEL ZA FILE FORMAT////////////
		JPanel panSoftFileFormat=new JPanel(new FlowLayout(FlowLayout.LEFT));
		panSoftFileFormat.setBackground(bg_color);
		JLabel lblSoftFileFormat=new JLabel("File format:");
		lblSoftFileFormat.setForeground(Color.white);
		lblSoftFileFormat.setPreferredSize(dimension);
		panSoftFileFormat.add(lblSoftFileFormat);
		
		//-------CHECKBOX ZA FILE FORMAT------------//
		JCheckBox chBFF1=new JCheckBox(".fbx");
		chBFF1.setBackground(bg_color);
		chBFF1.setForeground(Color.white);
		JCheckBox chBFF2=new JCheckBox(".obj");
		chBFF2.setBackground(bg_color);
		chBFF2.setForeground(Color.white);
		
		panSoftFileFormat.add(chBFF1);
		panSoftFileFormat.add(chBFF2);
		
		////////PANEL ZA ANIMATION TOOLS//////////
		JPanel panSoftAnimTools=new JPanel(new FlowLayout(FlowLayout.LEFT));
		panSoftAnimTools.setBackground(bg_color);
		JLabel lblSoftAnimTools=new JLabel("Animation Tools:");
		lblSoftAnimTools.setForeground(Color.white);
		lblSoftAnimTools.setPreferredSize(dimension);
		panSoftAnimTools.add(lblSoftAnimTools);
		
		//-------CHECKBOX ZA ANIMATION TOOLS--------//
		JCheckBox chBAT1=new JCheckBox("Bones");
		chBAT1.setBackground(bg_color);
		chBAT1.setForeground(Color.white);
		JCheckBox chBAT2=new JCheckBox("Curve Editor");
		chBAT2.setBackground(bg_color);
		chBAT2.setForeground(Color.white);
		JCheckBox chBAT3=new JCheckBox("Constraints");
		chBAT3.setBackground(bg_color);
		chBAT3.setForeground(Color.white);
		JCheckBox chBAT4=new JCheckBox("IK solvers");
		chBAT4.setBackground(bg_color);
		chBAT4.setForeground(Color.white);
		JCheckBox chBAT5=new JCheckBox("Wire parameters");
		chBAT5.setBackground(bg_color);
		chBAT5.setForeground(Color.white);
		JCheckBox chBAT6=new JCheckBox("MassFX");
		chBAT6.setBackground(bg_color);
		chBAT6.setForeground(Color.white);
		
		panSoftAnimTools.add(chBAT1);
		panSoftAnimTools.add(chBAT2);
		panSoftAnimTools.add(chBAT3);
		panSoftAnimTools.add(chBAT4);
		panSoftAnimTools.add(chBAT5);
		panSoftAnimTools.add(chBAT6);
		
		////////PANEL ZA TABOVE//////////
		//JPanel panSoftTabs=new JPanel(new FlowLayout(FlowLayout.LEFT));
		//panSoftTabs.setBackground(bg_color);
		//---------TABOVI----------------//
		JTabbedPane tabBrush=new JTabbedPane();
		//prvi Tab Item
		JPanel panBrushTab=new JPanel();
		GridLayout gridLayout=new GridLayout();
		panBrushTab.setLayout(gridLayout);
		
		
		JPanel panBrushName=new JPanel(new FlowLayout(FlowLayout.LEFT));
		panBrushName.setBackground(Color.DARK_GRAY);
		JLabel lblBrushName=new JLabel("Brush name:");
		lblBrushName.setForeground(Color.white);
		lblBrushName.setPreferredSize(dimension);
		JTextField txtBrushName=new JTextField(10);
		txtBrushName.setPreferredSize(dimension);
		
		panBrushName.add(lblBrushName);
		panBrushName.add(txtBrushName);
		
		
		
		
		JPanel panBrushUsage=new JPanel(new FlowLayout(FlowLayout.LEFT));
		panBrushUsage.setBackground(Color.DARK_GRAY);
		JLabel lblBrushUsage=new JLabel("Usage:");
		lblBrushUsage.setForeground(Color.white);
		lblBrushUsage.setPreferredSize(dimension);
		JTextField txtBrushUsage=new JTextField(10);
		txtBrushUsage.setPreferredSize(dimension);
		
		panBrushUsage.add(lblBrushUsage);
		panBrushUsage.add(txtBrushUsage);
		
		//----PROVERA ODABRANE BOJE CETKICE------//////
		JLabel lblBrushColor=new JLabel("BRUSH COLOR");
		lblBrushColor.setBackground(Color.darkGray);
		lblBrushColor.setOpaque(true); //ovo se dodaje kako bi mogla da se vidi pozadina labele
		lblBrushColor.setFont(new Font("Papyrus", Font.BOLD,25));
		
		panBrushName.add(lblBrushColor);
		
		//-----DUGMICI ZA BIRANJE BOJE CETKICE, DODAVANJE CETKICE i BRISANJE CETKICE--------//
		JPanel panBrushBtns=new JPanel(new FlowLayout(FlowLayout.LEFT));
		panBrushBtns.setBackground(Color.DARK_GRAY);
		Icon colorPickerIcon=new ImageIcon("images/icons8-color-dropper-24.png");
		JButton btnAddBrushColor=new JButton(colorPickerIcon);
		btnAddBrushColor.setBackground(bg_color);
		panBrushBtns.add(btnAddBrushColor);

		Icon brushIcon=new ImageIcon("images/icons8-paint-24.png");
		JButton btnNewBrush=new JButton(brushIcon);
		btnNewBrush.setBackground(bg_color);
		panBrushBtns.add(btnNewBrush);
		
		
		
		btnAddBrushColor.addMouseListener(new MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				btnAddBrushColor.setBackground(new Color(38,38,38));
				
			}
			public void mouseExited(java.awt.event.MouseEvent evt) {
				btnAddBrushColor.setBackground(new Color(61,61,61));
				
			}
		});
		
		/////////LISTENER ZA BIRANJE BOJE///////////////////
		btnAddBrushColor.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (e.getSource()==btnAddBrushColor) {
					JColorChooser pickColor= new JColorChooser();
					
					Color color=JColorChooser.showDialog(null, "PICK A BRUSH COLOR", Color.white);
					
					lblBrushColor.setForeground(color);
				}
			}
		});
		
		btnNewBrush.addMouseListener(new MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				btnNewBrush.setBackground(new Color(38,38,38));
				
			}
			public void mouseExited(java.awt.event.MouseEvent evt) {
				btnNewBrush.setBackground(new Color(61,61,61));
				
			}
		});
		
		JPanel panBrushBtnSaveDelete=new JPanel(new FlowLayout(FlowLayout.CENTER));
		panBrushBtnSaveDelete.setBackground(Color.DARK_GRAY);
	
		
		JButton btnSaveBrush=new JButton("Save Brush");
		btnSaveBrush.setBackground(bg_color);
		btnSaveBrush.setForeground(Color.white);
		panBrushBtnSaveDelete.add(btnSaveBrush);
		
		JButton btnDeleteBrush=new JButton("Delete Brush");
		btnDeleteBrush.setBackground(bg_color);
		btnDeleteBrush.setForeground(Color.white);
		panBrushBtnSaveDelete.add(btnDeleteBrush);
		
		
		//BOX ZA BRUSH TAB////////////////////////
		Box boxBrushTab=Box.createVerticalBox();
		panBrushTab.add(boxBrushTab);
		boxBrushTab.add(panBrushName);
		boxBrushTab.add(panBrushUsage);
		boxBrushTab.add(panBrushBtns);
		boxBrushTab.add(panBrushBtnSaveDelete);
		
		///Ovaj color chooser cu dodati da se otvara u novom prozoru////
		//JColorChooser colorsChooser=new JColorChooser();
		//colorsChooser.setBackground(bg_color);
		//panBrushTab.add(colorsChooser);
		
		
		
		//drugiTab Item
		JPanel panRenderTab=new JPanel();
		GridLayout gridLayout2=new GridLayout();
		panRenderTab.setLayout(gridLayout2);
		
		
		JPanel panRenderName=new JPanel(new FlowLayout(FlowLayout.LEFT));
		panRenderName.setBackground(Color.DARK_GRAY);
		JLabel lblRenderName=new JLabel("Render name:");
		lblRenderName.setForeground(Color.white);
		lblRenderName.setPreferredSize(dimension);
		JTextField txtRenderName=new JTextField(30);
		txtRenderName.setPreferredSize(dimension);
		
		panRenderName.add(lblRenderName);
		panRenderName.add(txtRenderName);
		
		JPanel panRenderMtls=new JPanel(new FlowLayout(FlowLayout.LEFT));
		panRenderMtls.setBackground(Color.DARK_GRAY);
		JLabel lblRenderMtls=new JLabel("Materials:");
		lblRenderMtls.setForeground(Color.white);
		lblRenderMtls.setPreferredSize(dimension);
		
		JCheckBox chBMtl1=new JCheckBox("Standard");
		chBMtl1.setBackground(bg_color);
		chBMtl1.setForeground(Color.white);
		JCheckBox chBMtl2=new JCheckBox("Twosided");
		chBMtl2.setBackground(bg_color);
		chBMtl2.setForeground(Color.white);
		JCheckBox chBMtl3=new JCheckBox("Blend");
		chBMtl3.setBackground(bg_color);
		chBMtl3.setForeground(Color.white);
		JCheckBox chBMtl4=new JCheckBox("Bump");
		chBMtl4.setBackground(bg_color);
		chBMtl4.setForeground(Color.white);
		
		
		panRenderMtls.add(lblRenderMtls);
		panRenderMtls.add(chBMtl1);
		panRenderMtls.add(chBMtl2);
		panRenderMtls.add(chBMtl3);
		panRenderMtls.add(chBMtl4);
		
		JPanel panRenderObj=new JPanel(new FlowLayout(FlowLayout.LEFT));
		panRenderObj.setBackground(Color.DARK_GRAY);
		JLabel lblRenderObj=new JLabel("Objects:");
		lblRenderObj.setForeground(Color.white);
		lblRenderObj.setPreferredSize(dimension);
		
		JCheckBox chBObj1=new JCheckBox("Plane");
		chBObj1.setBackground(bg_color);
		chBObj1.setForeground(Color.white);
		JCheckBox chBObj2=new JCheckBox("Cube");
		chBObj2.setBackground(bg_color);
		chBObj2.setForeground(Color.white);
		JCheckBox chBObj3=new JCheckBox("Cylinder");
		chBObj3.setBackground(bg_color);
		chBObj3.setForeground(Color.white);
		JCheckBox chBObj4=new JCheckBox("Cone");
		chBObj4.setBackground(bg_color);
		chBObj4.setForeground(Color.white);
		JCheckBox chBObj5=new JCheckBox("Teapot");
		chBObj5.setBackground(bg_color);
		chBObj5.setForeground(Color.white);
		
		
		panRenderObj.add(lblRenderObj);
		panRenderObj.add(chBObj1);
		panRenderObj.add(chBObj2);
		panRenderObj.add(chBObj3);
		panRenderObj.add(chBObj4);
		panRenderObj.add(chBObj5);
		
		
		//------DUGMICI ZA RENDER--------------//
		JPanel panRenderBtns=new JPanel(new FlowLayout(FlowLayout.CENTER));
		panRenderBtns.setBackground(Color.DARK_GRAY);
		
		JButton btnDeleteRender=new JButton("Delete Render");
		btnDeleteRender.setBackground(bg_color);
		btnDeleteRender.setForeground(Color.white);
		panRenderBtns.add(btnDeleteRender);
		
		JButton btnSaveRender=new JButton("Save Render");
		btnSaveRender.setBackground(bg_color);
		btnSaveRender.setForeground(Color.white);
		panRenderBtns.add(btnSaveRender);
		
		
		JPanel panRenderCam=new JPanel(new FlowLayout(FlowLayout.LEFT));
		panRenderCam.setBackground(Color.DARK_GRAY);
		JLabel lblRenderCam=new JLabel("Cameras:");
		lblRenderCam.setForeground(Color.white);
		lblRenderCam.setPreferredSize(dimension);
		
		JCheckBox chBRC1=new JCheckBox("Perspective");
		chBRC1.setBackground(bg_color);
		chBRC1.setForeground(Color.white);
		JCheckBox chBRC2=new JCheckBox("Orthographic");
		chBRC2.setBackground(bg_color);
		chBRC2.setForeground(Color.white);
		
		panRenderCam.add(lblRenderCam);
		panRenderCam.add(chBRC1);
		panRenderCam.add(chBRC2);
		
		//BOX ZA RENDER TAB///////////////////
		Box boxRenderTab=Box.createVerticalBox();
		panRenderTab.add(boxRenderTab);
		boxRenderTab.add(panRenderName);
		boxRenderTab.add(panRenderMtls);
		boxRenderTab.add(panRenderObj);
		boxRenderTab.add(panRenderCam);
		boxRenderTab.add(panRenderBtns);
		
		
		
		tabBrush.add("Brush",panBrushTab);
		tabBrush.add("Render",panRenderTab);
		//panSoftTabs.add(tabBrush);
		
		//-----OK/CANCLE BUTTONS------//
		JPanel panOkCancel=new JPanel(new FlowLayout(FlowLayout.CENTER));
		panOkCancel.setBackground(bg_color);
		//panOkCancel.setPreferredSize(new Dimension(30,60));
		
		JButton btnOK=new JButton("OK");
		JButton btnCancel=new JButton("Cancel");
		panOkCancel.add(btnOK);
		panOkCancel.add(btnCancel);
		
		//https://stackoverflow.com/questions/26762324/swing-how-to-close-jpanel-programmatically
		
				btnCancel.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// zatvara prozor klikom na cancel
						JComponent comp = (JComponent) e.getSource();
						  Window win = SwingUtilities.getWindowAncestor(comp);
						  win.dispose();
					}
				});
		
		
		Box boxSoftwareInfo=Box.createVerticalBox();
		boxSoftwareInfo.add(panSoftName);
		boxSoftwareInfo.add(panSoftModifiers);
		boxSoftwareInfo.add(panSoftFileFormat);
		boxSoftwareInfo.add(panSoftAnimTools);
		boxSoftwareInfo.add(tabBrush);
		add(boxSoftwareInfo,BorderLayout.NORTH);
		
		Box boxTabs=Box.createVerticalBox();
		boxTabs.add(tabBrush);
		add(boxTabs,BorderLayout.CENTER);
		
		Box boxOkCancel=Box.createVerticalBox();
		boxOkCancel.add(panOkCancel);
		boxOkCancel.add(Box.createGlue());
		add(boxOkCancel,BorderLayout.SOUTH);
		
		
	}
}
