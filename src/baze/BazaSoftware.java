package baze;

import java.util.ArrayList;
import java.util.List;

import classes.Software;

public class BazaSoftware {
	private static BazaSoftware instance = null;

	public static BazaSoftware getInstance() {
		if (instance == null) {
			instance = new BazaSoftware();
		}
		return instance;
	}

	private long generator;

	private List<Software> Software;
	private List<String> kolone;

	private BazaSoftware() {
		generator = 0;
	
		initSoftwaree();

		this.kolone = new ArrayList<String>();
		this.kolone.add("ID");
		this.kolone.add("Software name");
		this.kolone.add("Modifiers");
		this.kolone.add("File format");
		this.kolone.add("Animation tools");
		this.kolone.add("Brush name");
		this.kolone.add("Brush color");
		this.kolone.add("Brush usage");
		this.kolone.add("Materials");
		this.kolone.add("Objects");
		this.kolone.add("Cameras");
	}

	private void initSoftwaree() {
		this.Software = new ArrayList<Software>();
		Software.add(new Software(generateId(), "Maya","Cloth","obj","MassFX","Bold","Red" ,"Coloring", "Bump", "Plane", "Perspective"));
		Software.add(new Software(generateId(), "Photoshop","Normals","fbx","Curve editor","Wide","Green" ,"Coloring", "Twosided", "Teapot", "Orthographic"));
		Software.add(new Software(generateId(), "Blender","Edit poly","obj","Bones","Thin","Blue" ,"Coloring", "Blend", "Cone", "Perspective"));
	}
	
	public List<Software> getSoftware() {
		return Software;
	}

	public void setSoftware(List<Software> Software) {
		this.Software = Software;
	}

	private long generateId() {
		return ++generator;
	}

	public int getColumnCount() {
		return 11;
	}

	public String getColumnName(int index) {
		return this.kolone.get(index);
	}

	public Software getRow(int rowIndex) {
		return this.Software.get(rowIndex);
	}

	public String getValueAt(int row, int column) {
		Software Software = this.Software.get(row);
		switch (column) {
		case 0:
			return Long.toString(Software.getId());
		case 1:
			return Software.getSoftwareName();
		case 2:
			return Software.getModifiers();
		case 3:
			return Software.getFileFormat();
		case 4:
			return Software.getAnimationTools();
		case 5:
			return Software.getBrushName();
		case 6:
			return Software.getBrushColor();
		case 7:
			return Software.getBrushPurpose();
		case 8:
			return Software.getMaterials();
		case 9:
			return Software.getObjects();
		case 10:
			return Software.getCameras();
		default:
			return null;
		}
	}

	public void addSoftware(String softwareName, String modifiers, String fileFormat, 
			String animationTools, String BrushName, String BrushColor, String BrushPurpose,
			String Materials,String Objects,String Cameras) {
		this.Software.add(new Software(generateId(), "3ds Max","Turbosmooth","obj","IK solver","Small","Black" ,"Line art", "Standard", "Cube", "Perspective"));

	}

	public void deleteSoftwarea(long id) {
		for (Software i : Software) {
			if (i.getId() == id) {
				Software.remove(i);
				break;
			}
		}
	
	}

	public void editSoftwarea(long id, String softwareName, String modifiers, String fileFormat, 
			String animationTools, String BrushName, String BrushColor, String BrushPurpose, String Materials,String Objects,String Cameras) {
		for (Software i : Software) {
			if (i.getId() == id) {
				i.setSoftwareName(softwareName);
				i.setModifiers(modifiers);
				i.setFileFormat(fileFormat);
				i.setAnimationTools(animationTools);
				i.setBrushName(BrushName);
				i.setBrushColor(BrushColor);
				i.setBrushPurpose(BrushPurpose);
				i.setMaterials(Materials);
				i.setObjects(Objects);
				i.setCameras(Cameras);
			}
		}
	}
}
