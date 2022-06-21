package classes;

import java.io.Serializable;

public class Render implements Serializable{
	
	//promenljive
private String materials, cameras, objects, renderName;

//konstruktori
Render(String renderName,String materials, String cameras , String objects)
{
this.renderName = renderName;
this.materials = materials;
this.cameras = cameras;
this.objects = objects;

}

public Render(){}

//metode
public String getRenderName() {
	return renderName;
}

public void setRenderName(String renderName) {
	this.renderName = renderName;
}

public String getMaterials() {
	return materials;
}

public void setMaterials(String materials) {
	this.materials = materials;
}

public String getCameras() {
	return cameras;
}

public void setCameras(String cameras) {
	this.cameras = cameras;
}

public String getObjects() {
	return objects;
}

public void setObjects(String objects) {
	this.objects = objects;
}

@Override
public String toString() {
	return renderName + "," + materials + "," + cameras + "," + objects;
}
}
