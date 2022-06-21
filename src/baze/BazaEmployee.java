package baze;

import java.util.ArrayList;
import java.util.List;

import classes.Employee;


public class BazaEmployee {
	private static BazaEmployee instance = null;

	public static BazaEmployee getInstance() {
		if (instance == null) {
			instance = new BazaEmployee();
		}
		return instance;
	}

	private long generator;

	private List<Employee> employee;
	private List<String> kolone;

	private BazaEmployee() {
		generator = 0;
	
		initEmployeee();

		this.kolone = new ArrayList<String>();
		this.kolone.add("ID");
		this.kolone.add("Name");
		this.kolone.add("Last Name");
		this.kolone.add("JMBG");
		this.kolone.add("Date of Birth");
		this.kolone.add("email");
		this.kolone.add("Address");
		this.kolone.add("Job position");
		this.kolone.add("Software");
	}

	private void initEmployeee() {
		this.employee = new ArrayList<Employee>();
		employee.add(new Employee(generateId(), "Robert ","Fox ","3654022030642","11.10.1991","tobyfox@gmail.com","Kralja Petra 100" ,"animator", "Maya"));
		employee.add(new Employee(generateId(), "Andrew","Hussie","2371013682344 ","25.8.1979","andrewhussie@gmail.com","Apatinski put 14","rigger","Blender"));
		employee.add(new Employee(generateId(), "Katsura","Hoshino","8784361443440 ","21.4.1980","katsura_5600@gmail.com","Suboticki put 9","illustrator","3ds Max"));
	}
	
	public List<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}

	private long generateId() {
		return ++generator;
	}

	public int getColumnCount() {
		return 9;
	}

	public String getColumnName(int index) {
		return this.kolone.get(index);
	}

	public Employee getRow(int rowIndex) {
		return this.employee.get(rowIndex);
	}

	public String getValueAt(int row, int column) {
		Employee Employee = this.employee.get(row);
		switch (column) {
		case 0:
			return Long.toString(Employee.getId());
		case 1:
			return Employee.getName();
		case 2:
			return Employee.getSurname();
		case 3:
			return Employee.getDateOfBirth();
		case 4:
			return Employee.getJmbg();
		case 5:
			return Employee.getEmail();
		case 6:
			return Employee.getAddress();
		case 7:
			return Employee.getJobPosition();
		case 8:
			return Employee.getSoftware();
		default:
			return null;
		}
	}

	public void addEmployee(String name, String surname, String jmbg, String dateOfBirth, String email, String address, String jobPosition, String software) {
		this.employee.add(new Employee(generateId(), "Isidora","Nikolic","53453453542","1.3.2000","isanfnsdfn", "jos ppp 47","rigg","photoshop"));
	}

	public void deleteEmployeea(long id) {
		for (Employee i : employee) {
			if (i.getId() == id) {
				employee.remove(i);
				break;
			}
		}
	
	}

	public void editEmployeea(long id, String name, String surname, String jmbg, String dateOfBirth, String email, String address, String jobPosition, String software) {
		for (Employee i : employee) {
			if (i.getId() == id) {
				i.setName(name);
				i.setSurname(surname);
				i.setJmbg(jmbg);
				i.setDateOfBirth(dateOfBirth);
				i.setEmail(email);
				i.setAddress(address);
				i.setJobPosition(jobPosition);
				i.setSoftware(software);
			}
		}
	}
}
