package listeners;

import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JTextField;


//Prijavljivao je gresku ukoliko se ne stavi da je abstract klasa----> proveri zasto?????
public abstract class EmployeeInfoFocusListener implements FocusListener {
	@Override
	public void focusGained(FocusEvent arg0) {
		JTextField txtJField=(JTextField)arg0.getComponent();
		txtJField.setBackground(Color.WHITE);
	}
	
	@Override
	public void focusLost(FocusEvent arg0) {
		JTextField txtJField=(JTextField) arg0.getComponent();
		txtJField.setBackground(Color.GRAY);
		
		//POLJE LAST NAME JE OBAVEZNO ZA UNOS
		if (txtJField.getName().equals("txtLastName")) {
			if (txtJField.getText().trim().equals("")|| txtJField.getText().trim().equals("Enter Last name")) {
				txtJField.setText("Enter Last name");
				txtJField.requestFocus();
				txtJField.setForeground(Color.RED);
			}else {
				txtJField.setForeground(Color.BLACK);
			}
			
		}
		
		
//		//POLJE FIRST NAME JE OBAVEZNO ZA UNOS
//		if (txtJField.getName().equals("txtFirstName")) {
//			if (txtJField.getText().trim().equals("")|| txtJField.getText().trim().equals("Enter First name")) {
//				txtJField.setText("Enter First name");
//				txtJField.requestFocus();
//				txtJField.setForeground(Color.RED);
//			}else {
//				txtJField.setForeground(Color.BLACK);
//			}
//			
//		}
		
		
		
		//POLJE DATE OF BIRTH JE OBAVEZNO ZA UNOS
//		if (txtJField.getName().equals("txtDateOfBirth")) {
//			if (txtJField.getText().trim().equals("")|| txtJField.getText().trim().equals("Enter Date of birth")) {
//				txtJField.setText("Enter Date of Birth");
//				txtJField.requestFocus();
//				txtJField.setForeground(Color.RED);
//			}else {
//				txtJField.setForeground(Color.BLACK);
//			}
//			
//		}
		
		
		
		
//		//POLJE JMBG JE OBAVEZNO ZA UNOS
//		if (txtJField.getName().equals("txtJMBG")) {
//			if (txtJField.getText().trim().equals("")|| txtJField.getText().trim().equals("Enter JMBG")) {
//				txtJField.setText("Enter JMBG");
//				txtJField.requestFocus();
//				txtJField.setForeground(Color.RED);
//			}else {
//				txtJField.setForeground(Color.BLACK);
//			}
//			
//		}
		
		
		
	}

}
