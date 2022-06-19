package gui;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Menu;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JToolBar;

import classes.Adress;
import classes.Employee;
import classes.Software;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JButton;

import java.awt.BorderLayout;
import listeners.MyWindowListener;

import gui.EmployeeInfoPanel;

public class MainGUIframe extends JFrame {

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
		// this.getContentPane().setBackground(Color.yellow); //postavljanje boje
		// pozadine prozora na zutu
		// this.getContentPane().setBackground(new Color(84,106,123)); //ovako moze da
		// se postavi bilo koja boja za pozadinu

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
		
		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~TABELA~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
				String[] columnNames = {
						"First Name",
		                "Last Name",
		                "Date of Birth",
		                "JMBG",
		                "Email",
		                "Address",
		                 "Job position",
		                "Software"}; //ovaj deo je ok i ne treba se menjati
				
				//~~~~~~~~~~~~~~~~~~~~~~~~~~~~proba~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
				Employee empProba = new Employee("Isidora","Nikolic","53453453542","1.3.2000","isanfnsdfn");
				Adress adrProb = new Adress("Jos put 44");
				Employee jobPosProba=new Employee("riger");
				Software softProba=new Software("Maya");
				
				Object[][] data = {
						{
							"First Name",
			                "Last Name",
			                "Date of Birth",
			                "JMBG",
			                "Email",
			                "Address",
			                 "Job position",
			                "Software"},
						{
			                	"First Name",
			                    "Last Name",
			                    "Date of Birth",
			                    "JMBG",
			                    "Email",
			                    "Address",
			                     "Job position",
			                    "Software"},
						{
			                    	empProba.getName(),
			                    	empProba.getSurname(),
			                    	empProba.getDateOfBirth(),
			                    	empProba.getJmbg(),
			                    	empProba.getEmail(),
			                    	adrProb.getFullAddress(),
			                    	jobPosProba.getJobPosition(),
			                    	softProba.getSoftwareName()}
						};
				
				JTable TableEm = new JTable(data, columnNames) {
					
					private static final long serialVersionUID = -6288921604070804302L;

					public boolean isCellEditable(int row, int column) {
						return false;
					};
				};
				
				JScrollPane scrollPane = new JScrollPane(TableEm);
				add(TableEm, BorderLayout.CENTER);
		
///////////// Tabovi /////////////
		
	//UIManager.put("TabbedPane.selected", Color.LIGHT_GRAY);
	JTabbedPane tabs = new JTabbedPane();
	JPanel PanelEmp=new JPanel();
	JPanel PanelSoft=new JPanel();
	PanelEmp.add(TableEm);
	
	tabs.addTab("Employees", TableEm);
	
	
	tabs.addTab("Software",PanelSoft);
		

	tabs.setBackground(Color.GRAY);


	add(tabs);
		
		
	}

}
