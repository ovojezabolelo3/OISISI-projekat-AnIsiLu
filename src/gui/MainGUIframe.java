package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Menu;
import java.awt.Toolkit;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JToolBar;
import javax.swing.JPanel;
import javax.swing.JButton;

import java.awt.BorderLayout;

public class MainGUIframe extends JFrame {

	private static final long serialVersionUID = -8026416994513756565L;

	public MainGUIframe() {

		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		int screenHeight = screenSize.height;
		int screenWidth = screenSize.width;
		// Podesavamo dimenzije prozora na 3/4 sirine i visine ekrana
		setSize(3 * screenWidth / 4, 3 * screenHeight / 4);
		// Dodajemo ikonu
		Image img = kit.getImage("images/icons8-battle.net-64.png");
		setIconImage(img);
		// Podesavamo naslov
		setTitle("Manager editor");
		// Postavljamo akciju pri zatvaranju prozora
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLocationRelativeTo(null); // ovime je prozor po pokretanju aplikacije postavljen ne centar ekrana
		// this.getContentPane().setBackground(Color.yellow); //postavljanje boje
		// pozadine prozora na zutu
		// this.getContentPane().setBackground(new Color(84,106,123)); //ovako moze da
		// se postavi bilo koja boja za pozadinu

		// Meni bar
		JMenuBar menuBar = new MyMenuBar();
		setJMenuBar(menuBar);

		// Toolbar
		JToolBar toolbar = new MyToolbar();
		add(toolbar, BorderLayout.NORTH);
	}

}
