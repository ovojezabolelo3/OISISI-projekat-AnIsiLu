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

public Employee(long id, String name, String surname, String jmbg, String dateOfBirth, String email) {
	this.name = name;
	this.surname = surname;
	this.jmbg = jmbg;
	this.dateOfBirth = dateOfBirth;
	this.email = email;
	this.id = id;
}

public Employee(String jobPosition) {
	this.jobPosition = jobPosition;
	
}

//koristiti for i if za proveru jmbg-a kod unosa korisnika 

//for(i=0;i<=BrZaposlenih;i++) {
//	if(jmbgUnet==jmbgPostojeci) 
//		ispisi gresku 
//	}

//napravi neku petlju da proverava da li su uneti brojevi/slova u polja kad se pravi novi zaposleni 

public Employee(){}

//metode
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
