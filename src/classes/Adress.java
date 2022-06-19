package classes;

import java.io.Serializable;

public class Adress implements Serializable{ //koristi se da bi se cuvale informacije
	
	//promenljive
private String streetNumber;
private String streetName;
private String townName;
private String fullAddress;
//String contry;

//konstruktori
public Adress(String townName,String streetName , String streetNumber)
	{
    this.townName = townName;
    this.streetName = streetName;
    this.streetNumber = streetNumber;
    
	}

public Adress(String fullAddress)
{
this.fullAddress = fullAddress;

}

public Adress(){}

//metode
public String getFullAddress() {
	return fullAddress;
}

public void setFullAddress(String fullAddress) {
	this.fullAddress = fullAddress;
}

public String getStreetNumber() {
	return streetNumber;
}

public void setStreetNumber(String streetNumber) {
	this.streetNumber = streetNumber;
}

public String getStreetName() {
	return streetName;
}

public void setStreetName(String streetName) {
	this.streetName = streetName;
}

public String getTownName() {
	return townName;
}

public void setTownName(String townName) {
	this.townName = townName;
}

@Override
public String toString() {
	return streetName + "," + streetNumber + "," + townName;
}

}
