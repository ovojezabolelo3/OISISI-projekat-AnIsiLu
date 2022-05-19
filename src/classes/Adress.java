package classes;

//import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;

public class Adress {
	
int streetNumber;
String streetName;
String townName;
//String contry;

Adress(String townName,String streetName , int streetNumber)
	{
    this.townName = townName;
    this.streetName = streetName;
    this.streetNumber = streetNumber;

  //if(townName) -> ako ime grada i ulice nisu stringovi izbaci gresku
  //ako broj ulice nije broj izbaci gresku 
    //ovo treba da se proveri pre izjednacavanja
    
	}

}
