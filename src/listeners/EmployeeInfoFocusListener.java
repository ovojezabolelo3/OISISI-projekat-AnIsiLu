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
		txtJField.setBackground(Color.DARK_GRAY);
		
		//POLJE PREZIME JE OBAVEZNO ZA UNOS
		if (txtJField.getName().equals("txtPrezime")) {
			if (txtJField.getText().trim().equals("")|| txtJField.getText().trim().equals("Unesite prezime...")) {
				txtJField.setText("Unesite prezime...");
				txtJField.requestFocus();
				txtJField.setForeground(Color.RED);
			}else {
				txtJField.setForeground(Color.BLACK);
			}
			
		}
	}

}