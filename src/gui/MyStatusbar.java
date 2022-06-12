package gui;

import java.awt.Dimension;
import java.text.DateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class MyStatusbar extends JPanel{
	
	private static LocalDateTime currentTime;
	private JLabel lblCurrentDateTime;
	
	
	public MyStatusbar() {
		
		this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		this.setPreferredSize(new Dimension((int)this.getSize().getWidth(),25));
		add(Box.createHorizontalGlue());
		
		DateTimeFormatter dateTime=DateTimeFormatter.ofPattern("HH:mm:ss");
		currentTime=LocalDateTime.now();
		lblCurrentDateTime=new JLabel(dateTime.format(currentTime));
		add(lblCurrentDateTime);
		
		// https://www.codegrepper.com/code-examples/java/java+repeat+function+every+minute
		  
		 
				Timer timer = new Timer();
				timer.schedule(new TimerTask() {
					@Override
					public void run() {
						// what you want to do
						//String date = dateTime.format(new Date());
						currentTime = LocalDateTime.now();
						lblCurrentDateTime.setText(dateTime.format(currentTime));
					}
				}, 0, 1000);
		//////////////////////////////////////////////////////////////////////////////////
		
	}
	

}
