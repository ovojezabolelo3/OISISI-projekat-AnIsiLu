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

import listeners.EmployeeInfoFocusListener;

public class EmployeeInfoPanel extends JPanel {
	public EmployeeInfoPanel() {
		super(new BorderLayout());
		setBorder(new TitledBorder(new EtchedBorder(), "Employee info"));
		setBackground(new Color(150, 150, 20));

		Dimension dimension = new Dimension(120, 20);
		EmployeeInfoFocusListener focusListener = new EmployeeInfoFocusListener() {
		};

		JPanel panLastName = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panLastName.setBackground(new Color(229, 230, 249));

		JLabel lblLastName = new JLabel("Last name*:");
		lblLastName.setPreferredSize(dimension);
		JTextField txtLastName = new JTextField(15);
		txtLastName.setPreferredSize(dimension);
		txtLastName.setName("txtLastName");
		txtLastName.setBackground(Color.GRAY);
		txtLastName.addFocusListener(focusListener);

		
		//JLabel lblEmployeeIcon = new JLabel();
		//lblEmployeeIcon.setIcon(new ImageIcon("images/icons8-hardworking-96.png"));

		

		panLastName.add(lblLastName,BorderLayout.WEST);
		panLastName.add(txtLastName,BorderLayout.WEST);
		//panLastName.add(lblEmployeeIcon, BorderLayout.EAST);
		
		
		JPanel panFirstName = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panFirstName.setBackground(new Color(229, 230, 249));
		JLabel lblFirstName = new JLabel("First name*:");
		lblFirstName.setPreferredSize(dimension);
		JTextField txtFirstName = new JTextField(10);
		txtFirstName.setBackground(Color.GRAY);
		txtFirstName.setName("txtFirstName");
		txtFirstName.addFocusListener(focusListener);
		txtFirstName.setPreferredSize(dimension);

		
		
		panFirstName.add(lblFirstName);
		panFirstName.add(txtFirstName);

		JPanel panAdress = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panAdress.setBackground(new Color(229, 230, 249));
		JLabel lblAdress = new JLabel("Adress:");
		lblAdress.setPreferredSize(dimension);
		JTextField txtAdress = new JTextField(20); // Proveriti da li treba ipak 3 JTextField-a za unos adrese
		txtAdress.setBackground(Color.GRAY);
		txtAdress.setName("txtAdress");
		txtAdress.addFocusListener(focusListener);
		txtAdress.setPreferredSize(dimension);
		panAdress.add(lblAdress);
		panAdress.add(txtAdress);

		JPanel panDateOfBirth = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panDateOfBirth.setBackground(new Color(229, 230, 249));
		JLabel lblDateofBirth = new JLabel("Date of birth*:");
		lblDateofBirth.setPreferredSize(dimension);
		JTextField txtDateOfBirth = new JTextField();
		txtDateOfBirth.setBackground(Color.GRAY);
		txtDateOfBirth.setName("txtDateOfBirth");
		txtDateOfBirth.addFocusListener(focusListener);
		txtDateOfBirth.setPreferredSize(dimension);

		panDateOfBirth.add(lblDateofBirth);
		panDateOfBirth.add(txtDateOfBirth);

		JPanel panJMBG = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panJMBG.setBackground(new Color(229, 230, 249));
		JLabel lblJMBG = new JLabel("JMBG*:");
		lblJMBG.setPreferredSize(dimension);
		JTextField txtJMBG = new JTextField(13);
		txtJMBG.setBackground(Color.GRAY);
		txtJMBG.setName("txtJMBG");
		txtJMBG.addFocusListener(focusListener);
		txtJMBG.setPreferredSize(dimension);

		panJMBG.add(lblJMBG);
		panJMBG.add(txtJMBG);
		
		JPanel panJobPosition=new JPanel(new FlowLayout(FlowLayout.LEFT));
		panJobPosition.setBackground(new Color(229, 230, 249));
		JLabel lblJobPosition= new JLabel("Job position:");
		lblJobPosition.setPreferredSize(dimension);
		
		panJobPosition.add(lblJobPosition);
		
		String[] choices= {
				"3d modeler", "animator", "rigger", "illustrator"
		};
		
		final JComboBox<String> cBox=new JComboBox<String>(choices);
		cBox.setMaximumSize(cBox.getPreferredSize());
		cBox.setAlignmentX(Component.CENTER_ALIGNMENT);
		panJobPosition.add(cBox);
		
		
		////////////////////////////IKONICAAAAAAA//////////////////////////
		JPanel panIconEmployee= new JPanel(new FlowLayout(FlowLayout.LEFT));
		panIconEmployee.setBackground(Color.YELLOW);
		JLabel lblIconEmployee=new JLabel();
		lblIconEmployee.setIcon(new ImageIcon("images/icons8-hardworking-96.png"));
		panIconEmployee.add(lblIconEmployee);

		Box boxEmployeeInfo = Box.createVerticalBox();
		//boxCenter.add(Box.createVerticalStrut(20));
		boxEmployeeInfo.add(panLastName);
		boxEmployeeInfo.add(panFirstName);
		boxEmployeeInfo.add(panDateOfBirth);
		boxEmployeeInfo.add(panJMBG);
		boxEmployeeInfo.add(panAdress);
		boxEmployeeInfo.add(panJobPosition);
		//boxCenter.add(Box.createGlue());
		add(boxEmployeeInfo, BorderLayout.CENTER);
		
//		Box boxIcon=Box.createVerticalBox();
//		boxIcon.add(Box.createVerticalStrut(20));
//		boxIcon.add(Box.createHorizontalGlue());
//		boxIcon.add(panIconEmployee);
//		add(boxIcon, BorderLayout.WEST);
		
//		JPanel panEmptyCenter=new JPanel(new FlowLayout(FlowLayout.CENTER));
//		panEmptyCenter.setBackground(Color.BLACK);
//		panEmptyCenter.setPreferredSize(getPreferredSize());
		
		JPanel panOKCancel=new JPanel();
		panOKCancel.setBackground(Color.WHITE);
		panOKCancel.setPreferredSize(new Dimension(30,60));
		//panEmptyDown.setLayout(new GridLayout(1,2,400,10));
		
		
		JButton btnOK=new JButton("OK");
		//btnOK.setSize(10, 10);
		JButton btnCancel=new JButton("Cancel");
		//btnCancel.setSize(10, 10);
		panOKCancel.add(btnOK);
		panOKCancel.add(btnCancel);
		
//		Box boxCenter=Box.createVerticalBox();
//		//boxCenter.add(Box.createVerticalStrut(20));
//		boxCenter.add(panEmptyCenter);
//		boxCenter.add(Box.createGlue());
//		add(boxCenter, BorderLayout.CENTER);
		
		
		//////////SOFTWARE deo///////////////
		JPanel panSoftwareCheck=new JPanel();
		panSoftwareCheck.setBackground(Color.GRAY);
		JLabel lblSoftware=new JLabel("Software");
		lblSoftware.setPreferredSize(dimension);
		panSoftwareCheck.add(lblSoftware);
		
		
		
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
