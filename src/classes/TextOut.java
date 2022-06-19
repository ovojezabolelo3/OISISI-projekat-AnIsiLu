package classes;
import javax.swing.*;  
import java.awt.Font;
//https://www.javatpoint.com/java-jtextarea
public class TextOut extends JTextArea{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public JTextArea TextOut;
	//JFrame f;
	public TextOut(){  
        //f= new JFrame();  
        //TextOut=new JTextArea();  
        //TextOut.setBounds(10,30, 200,200);  
        //f.add(TextOut);  
        //f.setSize(300,300);  
        //f.setLayout(null);  
        //f.setVisible(true);  
        //TextOut.setEditable(false);
    
        TextOut = new JTextArea();
		TextOut.setFont(new Font("Arial", Font.PLAIN, 15));
		TextOut.setSize(50, 50);
		TextOut.setLocation(100, 100);
		TextOut.setLineWrap(true);
		TextOut.setEditable(false);
		
     }  
	
}
