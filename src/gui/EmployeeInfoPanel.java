package gui;

import java.awt.BorderLayout;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.JCheckBox;	
import listeners.EmployeeInfoFocusListener;
import classes.Adress;
import classes.Employee;
import classes.Software;
import classes.TextOut;


public class EmployeeInfoPanel extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	JButton btnOK;
	JButton btnCancel;
	JTextField txtLastName;
	JTextField txtFirstName;
	JTextField txtEmail;
	JTextField txtJMBG;
	JTextField txtDateOfBirth;
	JTextField txtAdress;
	final JComboBox<String> cBox;
	JCheckBox checkBox1;
	JCheckBox checkBox2;
	JCheckBox checkBox3;
	JCheckBox checkBox4;
	JCheckBox checkBox5;
	
	Employee employeeeEmployee;
	Adress adress;
	Software software;
	Employee jobPosEmployee;
	
	
	private Color bg_color=new Color(61,61,61);
	
	public EmployeeInfoPanel() {
		super(new BorderLayout());
		setBackground(bg_color);

		Dimension dimension = new Dimension(120, 20);
		EmployeeInfoFocusListener focusListener = new EmployeeInfoFocusListener() {
		};

		JPanel panLastName = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panLastName.setBackground(bg_color);

		JLabel lblLastName = new JLabel("Last name*:");
		lblLastName.setForeground(Color.white);
		lblLastName.setPreferredSize(dimension);
		
		txtLastName = new JTextField(15);
		txtLastName.setPreferredSize(dimension);
		txtLastName.setName("txtLastName");
		txtLastName.setBackground(Color.GRAY);
		txtLastName.addFocusListener(focusListener);

		
		panLastName.add(lblLastName,BorderLayout.WEST);
		panLastName.add(txtLastName,BorderLayout.WEST);
		
		
		JPanel panFirstName = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panFirstName.setBackground(bg_color);
		JLabel lblFirstName = new JLabel("First name:");
		lblFirstName.setForeground(Color.white);
		lblFirstName.setPreferredSize(dimension);
		
		txtFirstName = new JTextField(10);
		txtFirstName.setBackground(Color.GRAY);
		txtFirstName.setName("txtFirstName");
		txtFirstName.addFocusListener(focusListener);
		txtFirstName.setPreferredSize(dimension);

		panFirstName.add(lblFirstName);
		panFirstName.add(txtFirstName);

		JPanel panEmail=new JPanel(new FlowLayout(FlowLayout.LEFT));
		panEmail.setBackground(bg_color);
		JLabel lblEmail=new JLabel("e-mail:");
		lblEmail.setForeground(Color.white);
		lblEmail.setPreferredSize(dimension);
		
		txtEmail=new JTextField(15);
		txtEmail.setName("txtEmail");
		txtEmail.addFocusListener(focusListener);
		txtEmail.setPreferredSize(dimension);
		
		panEmail.add(lblEmail);
		panEmail.add(txtEmail);
		
		JPanel panAdress = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panAdress.setBackground(bg_color);
		JLabel lblAdress = new JLabel("Adress:");
		lblAdress.setForeground(Color.white);
		lblAdress.setPreferredSize(dimension);
		
		txtAdress = new JTextField(20);
		txtAdress.setBackground(Color.GRAY);
		txtAdress.setName("txtAdress");
		txtAdress.addFocusListener(focusListener);
		txtAdress.setPreferredSize(dimension);
		panAdress.add(lblAdress);
		panAdress.add(txtAdress);

		JPanel panDateOfBirth = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panDateOfBirth.setBackground(bg_color);
		JLabel lblDateofBirth = new JLabel("Date of birth:");
		lblDateofBirth.setPreferredSize(dimension);
		lblDateofBirth.setForeground(Color.white);
		
		txtDateOfBirth = new JTextField();
		txtDateOfBirth.setBackground(Color.GRAY);
		txtDateOfBirth.setName("txtDateOfBirth");
		txtDateOfBirth.addFocusListener(focusListener);
		txtDateOfBirth.setPreferredSize(dimension);

		panDateOfBirth.add(lblDateofBirth);
		panDateOfBirth.add(txtDateOfBirth);

		JPanel panJMBG = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panJMBG.setBackground(bg_color);
		JLabel lblJMBG = new JLabel("JMBG:");
		lblJMBG.setForeground(Color.white);
		lblJMBG.setPreferredSize(dimension);
		
		txtJMBG = new JTextField(13);
		txtJMBG.setBackground(Color.GRAY);
		txtJMBG.setName("txtJMBG");
		txtJMBG.addFocusListener(focusListener);
		txtJMBG.setPreferredSize(dimension);

		panJMBG.add(lblJMBG);
		panJMBG.add(txtJMBG);
		
		JPanel panJobPosition=new JPanel(new FlowLayout(FlowLayout.LEFT));
		panJobPosition.setBackground(bg_color);
		JLabel lblJobPosition= new JLabel("Job position:");
		lblJobPosition.setForeground(Color.white);
		lblJobPosition.setPreferredSize(dimension);
		
		panJobPosition.add(lblJobPosition);
		
		String[] choices= {
				"3d modeler", "animator", "rigger", "illustrator"
		};
		
		
		cBox=new JComboBox<String>(choices);
		cBox.setMaximumSize(cBox.getPreferredSize());
		cBox.setAlignmentX(Component.CENTER_ALIGNMENT);
		cBox.setBackground(bg_color);
		cBox.setForeground(Color.white);
		panJobPosition.add(cBox);
		

		Box boxEmployeeInfo = Box.createVerticalBox();
		boxEmployeeInfo.add(panLastName);
		boxEmployeeInfo.add(panFirstName);
		boxEmployeeInfo.add(panDateOfBirth);
		boxEmployeeInfo.add(panJMBG);
		boxEmployeeInfo.add(panAdress);
		boxEmployeeInfo.add(panEmail);
		boxEmployeeInfo.add(panJobPosition);
		add(boxEmployeeInfo, BorderLayout.CENTER);
		

		JPanel panOKCancel=new JPanel();
		panOKCancel.setBackground(Color.gray);
		panOKCancel.setPreferredSize(new Dimension(30,60));
		
		btnOK=new JButton("OK");
		
		btnCancel=new JButton("Cancel");
		
		panOKCancel.add(btnOK);
		panOKCancel.add(btnCancel);

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
		
		btnOK.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JComponent comp = (JComponent) e.getSource();
				  Window win = SwingUtilities.getWindowAncestor(comp);
				  win.dispose();
				  
				  /*employeeeEmployee = new Employee(txtFirstName.getText(), txtLastName.getText(), txtJMBG.getText(), txtDateOfBirth.getText(), txtEmail.getText());

	                adress = new Adress(txtAdress.getText()); //namesti da se uzima pre razmaka

	                jobPosEmployee = new Employee((String)cBox.getSelectedItem()); //za biranje posla

	                if (checkBox1.isSelected()) {//za biranje softvera
	                    software = new Software("3ds Max");

	                }

	                else if (checkBox2.isSelected()) {
	                    software = new Software("Maya");

	                }

	                else if (checkBox3.isSelected()) {
	                    software = new Software("Blender");

	                }

	                else if (checkBox4.isSelected()) {
	                    software = new Software("ZBrush");

	                }

	                else if (checkBox5.isSelected()) {
	                    software = new Software("Photoshop");

	                }

	                TextOut textOut=new TextOut();
	                add(textOut);
	                textOut.setText(employeeeEmployee.getName() + ' ' + employeeeEmployee.getSurname() + ' '+ employeeeEmployee.getDateOfBirth()+
	                        ' '+employeeeEmployee.getJmbg()+' '+employeeeEmployee.getEmail()+' '+adress.getFullAddress()+' '+
	                        jobPosEmployee.getJobPosition()+' '+ software.getSoftwareName());
	                textOut.setEditable(false);*/
				
			}
			
		});
		
		
		
		//////////SOFTWARE deo///////////////
		JPanel panSoftwareCheck=new JPanel();
		panSoftwareCheck.setBackground(bg_color);
		JLabel lblSoftware=new JLabel("Software");
		lblSoftware.setForeground(Color.white);
		lblSoftware.setPreferredSize(dimension);
		panSoftwareCheck.add(lblSoftware);
		
		
		///////////////////CHECKBOX////////////////
		
		checkBox1=new JCheckBox("3ds Max");
		checkBox1.setBackground(bg_color);
		checkBox1.setForeground(Color.white);
		panSoftwareCheck.add(checkBox1);
		
		checkBox2=new JCheckBox("Maya");
		checkBox2.setBackground(bg_color);
		checkBox2.setForeground(Color.white);
		panSoftwareCheck.add(checkBox2);
		
		checkBox3=new JCheckBox("Blender");
		checkBox3.setBackground(bg_color);
		checkBox3.setForeground(Color.white);
		panSoftwareCheck.add(checkBox3);
		
		checkBox4=new JCheckBox("ZBrush");
		checkBox4.setBackground(bg_color);
		checkBox4.setForeground(Color.white);
		panSoftwareCheck.add(checkBox4);
		
		checkBox5=new JCheckBox("Photoshop");
		checkBox5.setBackground(bg_color);
		checkBox5.setForeground(Color.white);
		panSoftwareCheck.add(checkBox5);
		/////////////////////////////////////////////////
		
		Box boxSoftware=Box.createVerticalBox();
		boxSoftware.add(panSoftwareCheck);
		boxEmployeeInfo.add(boxSoftware, BorderLayout.SOUTH);
		
		Box boxOKCancel=Box.createVerticalBox();
		boxOKCancel.add(Box.createVerticalStrut(20));
		boxOKCancel.add(panOKCancel);
		boxOKCancel.add(Box.createGlue());
		add(boxOKCancel,BorderLayout.SOUTH);
		
	}
	
}



