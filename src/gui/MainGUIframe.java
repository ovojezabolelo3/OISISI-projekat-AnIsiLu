package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JToolBar;

import classes.EmployeeController;
import classes.SoftwareController;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;

import java.awt.BorderLayout;
import listeners.MyWindowListener;
import tables.AbstractTableModelEmployee;
import tables.AbstractTableModelSoftware;
import tables.EmployeeJTable;
import tables.SoftwareJTable;

public class MainGUIframe extends JFrame {
	

	private static MainGUIframe instance = null;

	public static MainGUIframe getInstance() {
		if (instance == null) {
			instance = new MainGUIframe();
		}
		return instance;
	}
	
	private JTable EmTable;
	private JTable SoftTable;
	JPanel PanelSoft;


	
	
	private static final long serialVersionUID = -8026416994513756565L;

	public MainGUIframe() {
		
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		int screenHeight = screenSize.height;
		int screenWidth = screenSize.width;
		setResizable(false);
		
		setSize(3 * screenWidth / 4, 3 * screenHeight / 4);
		
		Image img = kit.getImage("images/icons8-hang-48.png");
		setIconImage(img);
		
		setTitle("Manager editor");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
		addWindowListener(new MyWindowListener());
		
		setLocationRelativeTo(null); 

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
		
		PanelSoft=new JPanel();
		add(PanelSoft, BorderLayout.CENTER);
		
		InitializeAction();
		ShowTabelEmp();
		ShowTabelSoft();
		InitializeAction2();
		
///////////// Tabovi /////////////
		
	
	JTabbedPane tabs = new JTabbedPane();
	
	
	
	
	tabs.addTab("Employees", EmTable);
	
	
	tabs.addTab("Software",SoftTable);
	

	tabs.setBackground(Color.GRAY);


	add(tabs);
		
		
	}
	
	
	
	
	public void RefreshView(String action, int value) {
		AbstractTableModelEmployee model = (AbstractTableModelEmployee) EmTable.getModel();
		
		
		model.fireTableDataChanged();
		
		validate();
	}
	public void RefreshView2(String action, int value) {
	
		AbstractTableModelSoftware model1 = (AbstractTableModelSoftware) SoftTable.getModel();
		
	
		model1.fireTableDataChanged();
		validate();
	}

	private void InitializeAction() {
		JPanel panelTop = new JPanel();
		JButton btnDodaj = new JButton("AddEmpl");
		JButton btnIzbrisi = new JButton("DeleteEmpl");
		JButton btnIzmeni = new JButton("EditEmpl");

				panelTop.add(btnDodaj);
				panelTop.add(btnIzbrisi);
				panelTop.add(btnIzmeni);
				
				panelTop.setVisible(true);
				this.add(panelTop, BorderLayout.WEST);
				
				
		btnDodaj.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				EmployeeController.getInstance().addEmployee();
			}
		});

		btnIzbrisi.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				EmployeeController.getInstance().deleteEmployeea(EmTable.getSelectedRow());
			}
		});

		btnIzmeni.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				EmployeeController.getInstance().editEmployeea(EmTable.getSelectedRow());
			}
		});
	}
	
	private void InitializeAction2() {
		JPanel panelTop = new JPanel();
		JButton btnDodaj = new JButton("AddSoft");
		JButton btnIzbrisi = new JButton("DeleteSoft");
		JButton btnIzmeni = new JButton("EditSorf");

				panelTop.add(btnDodaj);
				panelTop.add(btnIzbrisi);
				panelTop.add(btnIzmeni);
				
				panelTop.setVisible(true);
				this.add(panelTop, BorderLayout.EAST);
				
				
		btnDodaj.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				SoftwareController.getInstance().addSoftware();
			}
		});

		btnIzbrisi.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				SoftwareController.getInstance().deleteSoftwarea(SoftTable.getSelectedRow());
			}
		});

		btnIzmeni.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				SoftwareController.getInstance().editSoftwarea(SoftTable.getSelectedRow());
			}
		});
	}

	private void ShowTabelEmp() {
		EmTable = new EmployeeJTable();

		JScrollPane scrollPane = new JScrollPane(EmTable);
		add(scrollPane, BorderLayout.CENTER);

		this.RefreshView(null, -1);
	}
	
	private void ShowTabelSoft() {
		SoftTable = new SoftwareJTable();

		JScrollPane scrollPane = new JScrollPane(SoftTable);
		add(scrollPane, BorderLayout.CENTER);

		this.RefreshView2(null, -1);
	}

}
