package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

import listeners.EmployeeInfoFocusListener;


public class EmployeeInfoPanel extends JPanel {
	public EmployeeInfoPanel() {
		super(new BorderLayout());
		setBorder(new TitledBorder(new EtchedBorder(),"Podaci o zaposlenom"));
		setBackground(new Color(150,150,20));
		
		Dimension dimension =new Dimension(120,20);
		EmployeeInfoFocusListener focusListener=new EmployeeInfoFocusListener() {
		};
		
		JPanel panLastName=new JPanel(new FlowLayout(FlowLayout.LEFT));
		panLastName.setBackground(new Color(220,210,15));
		
		JLabel lblLastName= new JLabel("Prezime*:");
		lblLastName.setPreferredSize(dimension);
		JTextField txtLastName=new JTextField();
		txtLastName.setPreferredSize(dimension);
		txtLastName.setName("txtPrezime");
		txtLastName.setBackground(Color.DARK_GRAY);
		txtLastName.addFocusListener(focusListener);
		
		panLastName.add(lblLastName);
		panLastName.add(txtLastName);
		
		JPanel panFirstName=new JPanel(new FlowLayout(FlowLayout.LEFT));
		panFirstName.setBackground(new Color(220,210,15));
		JLabel lblFirstName=new JLabel("Ime:");
		lblFirstName.setPreferredSize(dimension);
		JTextField txtFirstName=new JTextField();
		txtFirstName.setBackground(Color.DARK_GRAY);
		txtFirstName.setName("txtIme");
		txtFirstName.addFocusListener(focusListener);
		txtFirstName.setPreferredSize(dimension);
		
		panFirstName.add(lblFirstName);
		panFirstName.add(txtFirstName);
		
		JPanel panAdress=new JPanel(new FlowLayout(FlowLayout.LEFT));
		panAdress.setBackground(new Color(220,210,15));

		
	}

}
