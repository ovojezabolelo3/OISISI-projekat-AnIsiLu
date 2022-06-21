package classes;
import javax.swing.*;  
import java.awt.Font;
//https://www.javatpoint.com/java-jtextarea
public class TextOut extends JTextArea{
	
	private static final long serialVersionUID = 1L;
	public JTextArea TextOut;
	
	public TextOut(){  
        TextOut = new JTextArea();
		TextOut.setFont(new Font("Arial", Font.PLAIN, 15));
		TextOut.setSize(50, 50);
		TextOut.setLocation(100, 100);
		TextOut.setLineWrap(true);
		TextOut.setEditable(false);
     }  
	
}
