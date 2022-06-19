package dialogs;

import java.awt.Frame;

import javax.swing.JDialog;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

import javax.swing.JOptionPane;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JSplitPane;
import javax.swing.WindowConstants;
import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;





public class AboutUsDialog extends JDialog{
	private static final long serialVersionUID = 3591599721565020284L;
	
	public AboutUsDialog(Frame parent, String title, boolean modal) {
		super(parent, title, modal);
		setSize(600,450);
		setLocationRelativeTo(parent);
		setResizable(false);
		
		AboutUsPanel Help=new AboutUsPanel();
		Help.setBackground(new Color(61,61,61));
		this.add(Help);
		
		
	}

}

class AboutUsPanel extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Color bg_color=new Color(61,61,61);
	
	public AboutUsPanel() {
		super(new BorderLayout());
		setBackground(bg_color);

		Dimension dimension = new Dimension(120, 20);

		JPanel TextHelp = new JPanel();
		TextHelp.setLayout(new BoxLayout(TextHelp, BoxLayout.Y_AXIS));
		TextHelp.setBackground(bg_color);
		
		String about = "<html>Version: 1.0<br/>"
				+ "Biography about the autors<br/><br/>"
				+" <hr>"
				+ "Autors: <br/>"
				+ "<hr>"
				+ "Luna Cvetinovic <i>AI 2/2019</i><br/>"
				+ "Valjevo 24.07.2001.<br/><br/>"
				+ "Hi! My name is <u>Luna</u>, and I came from <u><i>Lazarevac</i></u>. <br/>"
				+ "I really like to read, go for walks, learn new things, etc. </br> <br/>"
				+ "<hr>"
				+ "Isidora Nikolic  <i>AI 6/2019</i><br/>"
				+ "Sombor 01.03.2000.<br/><br/>"
				+ "Hello! My name is <u>Isidora</u>, and I came from <u><i>Sombor</i></u>.<br/>"
				+ "I'm really into books, mangas, and gaming. "
				+ "I really like searching for good fan made works about the games I played and liked.<br/><br/>"
				+ "<hr>"
				+ "Anita Nadj <i>AI 25/2019</i><br/>"
				+ "Novi Sad, 27.02.2000. <br/><br/>"
				+ "Hi! My name is <u>Anita</u>, and I came from <u><i>Becej</i></u>.<br/>"
				+ "I like cars and motorcycles. I really enjoy my free time with gaming or driving.<br/>"
				+ "<hr>"
				+ "</html>";
		

		JLabel sendhelp = new JLabel(about, SwingConstants.CENTER);

		TextHelp.add(sendhelp);

		this.add(TextHelp);

		sendhelp.setForeground(Color.white);
		sendhelp.setPreferredSize(dimension);
		
		
		
		
	}
	}