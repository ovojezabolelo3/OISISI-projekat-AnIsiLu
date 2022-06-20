package classes;

import java.io.Serializable;

public class Software implements Serializable{
	
	//promenljive
private String softwareName, fileFormat, animationTools, modifiers;
private long id;
private String BrushName,BrushPurpose, BrushColor;
private String Materials,Objects, Cameras;

//konkstruktori
public Software(long id, String softwareName, String modifiers, String fileFormat, 
		String animationTools, String BrushName, String BrushColor, String BrushPurpose,
		String Materials,String Objects,String Cameras)
{
this.softwareName = softwareName;
this.fileFormat = fileFormat;
this.animationTools = animationTools;
this.modifiers = modifiers;
this.BrushName = BrushName;
this.BrushColor = BrushColor;
this.BrushPurpose = BrushPurpose;
this.Materials = Materials;
this.Objects = Objects;
this.Cameras = Cameras;
}

public Software(String softwareName)
{
this.softwareName = softwareName;
}

public Software(){}

//metode
public String getCameras() {
	return Cameras;
}

public void setCameras(String Cameras) {
	this.Cameras = Cameras;
}

public String getObjects() {
	return Objects;
}

public void setObjects(String Objects) {
	this.Objects = Objects;
}

public String getMaterials() {
	return Materials;
}

public void setMaterials(String Materials) {
	this.Materials = Materials;
}

public String getBrushColor() {
	return BrushColor;
}

public void setBrushColor(String BrushColor) {
	this.BrushColor = BrushColor;
}

public String getBrushPurpose() {
	return BrushPurpose;
}

public void setBrushPurpose(String BrushPurpose) {
	this.BrushPurpose = BrushPurpose;
}

public String getBrushName() {
	return BrushName;
}

public void setBrushName(String BrushName) {
	this.BrushName = BrushName;
}

public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public String getSoftwareName() {
	return softwareName;
}

public void setSoftwareName(String softwareName) {
	this.softwareName = softwareName;
}

public String getFileFormat() {
	return fileFormat;
}

public void setFileFormat(String fileFormat) {
	this.fileFormat = fileFormat;
}

public String getAnimationTools() {
	return animationTools;
}

public void setAnimationTools(String animationTools) {
	this.animationTools = animationTools;
}

public String getModifiers() {
	return modifiers;
}

public void setModifiers(String modifiers) {
	this.modifiers = modifiers;
}

@Override
public String toString() {
	return softwareName + "," + fileFormat + "," + animationTools + "," + modifiers;
}

}
