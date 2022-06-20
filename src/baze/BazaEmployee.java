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
		this.kolone.add("IME");
		this.kolone.add("PREZIME");
		this.kolone.add("KLUB");

	}

	private void initEmployeee() {
		this.employee = new ArrayList<Employee>();
		employee.add(new Employee(generateId(), "Isidora","Nikolic","53453453542","1.3.2000","isanfnsdfn"));
		employee.add(new Employee(generateId(), "Isidora","Nikolic","53453453542","1.3.2000","isanfnsdfn"));
		employee.add(new Employee(generateId(), "Isidora","Nikolic","53453453542","1.3.2000","isanfnsdfn"));
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
		return 4;
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
		default:
			return null;
		}
	}

	public void addEmployee(String name, String surname, String jmbg, String dateOfBirth, String email) {
		this.employee.add(new Employee(generateId(), "Isidora","Nikolic","53453453542","1.3.2000","isanfnsdfn"));
	}

	public void deleteEmployeea(long id) {
		for (Employee i : employee) {
			if (i.getId() == id) {
				employee.remove(i);
				break;
			}
		}
	}

	public void editEmployeea(long id, String name, String surname, String jmbg, String dateOfBirth, String email) {
		for (Employee i : employee) {
			if (i.getId() == id) {
				i.setName(name);
				i.setSurname(surname);
				i.setJmbg(jmbg);
				i.setDateOfBirth(dateOfBirth);
				i.setEmail(email);
			}
		}
	}
}
