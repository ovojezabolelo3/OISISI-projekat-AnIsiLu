package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JToolBar;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import listeners.MyWindowListener;
import tables.AbstractTableModelEmployee;
import tables.EmployeeJTable;
import tables.SoftwareJTable;

public class MainGUIframe extends JFrame {

	private EmployeeJTable TableEm = new EmployeeJTable();
	private SoftwareJTable TableSoft = new SoftwareJTable();
	
	private static final long serialVersionUID = -8026416994513756565L;

	public MainGUIframe() {
		
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		int screenHeight = screenSize.height;
		int screenWidth = screenSize.width;
		setResizable(false);
		// Podesavamo dimenzije prozora na 3/4 sirine i visine ekrana
		setSize(3 * screenWidth / 4, 3 * screenHeight / 4);
		// Dodajemo ikonu
		Image img = kit.getImage("images/icons8-battle.net-64.png");
		setIconImage(img);
		// Podesavamo naslov
		setTitle("Manager editor");
		// Postavljamo akciju pri zatvaranju prozora
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//Dodavanje Window Listenera koji proverava da li korisnik sigurno zeli da zatvori aplikaciju
		addWindowListener(new MyWindowListener());
		
		setLocationRelativeTo(null); // ovime je prozor po pokretanju aplikacije postavljen na centar ekrana

		// Meni bar
		JMenuBar menuBar = new MyMenuBar();
		setJMenuBar(menuBar);

		// Toolbar
		JToolBar toolbar = new MyToolbar();
		toolbar.setBackground(new Color(61,61,61));
		this.add(toolbar, BorderLayout.NORTH);
		
		//Statusbar
		MyStatusbar statusbar=new MyStatusbar();
		add(statusbar, BorderLayout.SOUTH);
		
		getContentPane().setBackground(new Color(61,61,61));
		
		
///////////// Tabovi /////////////
		
	//UIManager.put("TabbedPane.selected", Color.LIGHT_GRAY);
	JTabbedPane tabs = new JTabbedPane();
	//JPanel PanelEmp=new JPanel();
	JPanel PanelSoft=new JPanel();
	//PanelEmp.add(TableEm);
	//PanelSoft.add(TableSoft);
	
	tabs.addTab("Employees", TableEm);
	
	
	tabs.addTab("Software",TableSoft);
	//tabs.addTab("Software",PanelSoft);

	tabs.setBackground(Color.GRAY);


	add(tabs);
		
		
	}

}
