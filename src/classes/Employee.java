package classes;

import java.io.Serializable;

public class Employee implements Serializable{
	
	//promenljive
private String name, surname;
private String jmbg;
private String dateOfBirth;
private String email;
private String jobPosition;
private long id;
private String address;
private String software;

public Employee(long id, String name, String surname, String jmbg, String dateOfBirth, String email, String address, String jobPosition, String software) {
	this.name = name;
	this.surname = surname;
	this.jmbg = jmbg;
	this.dateOfBirth = dateOfBirth;
	this.email = email;
	this.id = id;
	this.jobPosition = jobPosition;
	this.address = address;
	this.software = software;
}

public Employee(String name, String surname, String jmbg, String dateOfBirth, String email) {

    this.name = name;
    this.surname = surname;
    this.jmbg = jmbg;
    this.dateOfBirth = dateOfBirth;
    this.email = email;

}

public Employee(String jobPosition) {
	this.jobPosition = jobPosition;
	
}



public Employee(){}

//metode
public String getSoftware() {
	return software;
}

public void setSoftware(String software) {
	this.software = software;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public String getJobPosition() {
	return jobPosition;
}

public void setJobPosition(String jobPosition) {
	this.jobPosition = jobPosition;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getSurname() {
	return surname;
}

public void setSurname(String surname) {
	this.surname = surname;
}

public String getJmbg() {
	return jmbg;
}

public void setJmbg(String jmbg) {
	this.jmbg = jmbg;
}

public String getDateOfBirth() {
	return dateOfBirth;
}

public void setDateOfBirth(String dateOfBirth) {
	this.dateOfBirth = dateOfBirth;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

@Override
public String toString() {
	return name + "," + surname + "," + jmbg + "," + dateOfBirth +","+ email;
}

}
