package classes;

import java.io.Serializable;

public class Software implements Serializable{
	
	//promenljive
private String softwareName, fileFormat, animationTools, modifiers;

//konkstruktori
public Software(String softwareName,String fileFormat, String animationTools , String modifiers)
{
this.softwareName = softwareName;
this.fileFormat = fileFormat;
this.animationTools = animationTools;
this.modifiers = modifiers;

//kod imena softvera mozemo da stavimo da se bira max maya itd
//file format ce biti obj i fbx
//kod alata za anim curve editor i dopeshit
//modifikatori mogu edit poly, turbo smoot i tako 

}

public Software(String softwareName)
{
this.softwareName = softwareName;
}

public Software(){}

//metode
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
