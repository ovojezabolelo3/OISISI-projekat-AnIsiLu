package classes;

import java.io.Serializable;

public class Employee implements Serializable{
	
	//promenljive
private String name, surname;
private int jmbg;
private int dateOfBirth;
private String email;

public Employee(String name, String surname, int jmbg, int dateOfBirth, String email) {
	this.name = name;
	this.surname = surname;
	this.jmbg = jmbg;
	this.dateOfBirth = dateOfBirth;
	this.email = email;

}

//koristiti for i if za proveru jmbg-a kod unosa korisnika 

//for(i=0;i<=BrZaposlenih;i++) {
//	if(jmbgUnet==jmbgPostojeci) 
//		ispisi gresku 
//	}

//napravi neku petlju da proverava da li su uneti brojevi/slova u polja kad se pravi novi zaposleni 

public Employee(){}

//metode
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

public int getJmbg() {
	return jmbg;
}

public void setJmbg(int jmbg) {
	this.jmbg = jmbg;
}

public int getDateOfBirth() {
	return dateOfBirth;
}

public void setDateOfBirth(int dateOfBirth) {
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
	return name + "," + surname + "," + jmbg + "," + dateOfBirth +","+ email ;
}

}
