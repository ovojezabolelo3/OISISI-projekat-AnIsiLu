package classes;

import java.io.Serializable;

public class Brushes implements Serializable{
	
	//promenljive
private String brushName, purpose, color;

//konstruktori
Brushes(String brushName,String color , String purpose)
{
this.brushName = brushName;
this.color = color;
this.purpose = purpose;

}

public Brushes(){}

//metode
public String getBrushName() {
	return brushName;
}

public void setBrushName(String brushName) {
	this.brushName = brushName;
}

public String getColor() {
	return color;
}

public void setColor(String color) {
	this.color = color;
}

public String getPurpose() {
	return purpose;
}

public void setPurpose(String purpose) {
	this.purpose = purpose;
}

@Override
public String toString() {
	return brushName + "," + color + "," + purpose;
}


}
