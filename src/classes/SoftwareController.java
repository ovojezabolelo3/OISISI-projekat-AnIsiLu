package classes;

import baze.BazaSoftware;
import gui.MainGUIframe;

public class SoftwareController {

private static SoftwareController instance = null;

    public static SoftwareController getInstance() {
        if (instance == null) {
            instance = new SoftwareController();
        }
        return instance;
    }

    private SoftwareController() {}

    public void addSoftware() {
        // izmena modela
        BazaSoftware.getInstance().addSoftware("3ds Max","Turbosmooth","obj","IK solver","Small","Black" ,"Line art", "Twosided", "Teapot", "Orthographic");
        // azuriranje prikaza
        MainGUIframe.getInstance().RefreshView2("DODAT", -1);
    }

    public void deleteSoftwarea(int rowSelectedIndex) {
        if (rowSelectedIndex < 0) {
            return;
        }
        // izmena modela
        Software Software = BazaSoftware.getInstance().getRow(rowSelectedIndex);
        BazaSoftware.getInstance().deleteSoftwarea(Software.getId());
        // azuriranje prikaza
        MainGUIframe.getInstance().RefreshView2("UKLONJEN", rowSelectedIndex);
    }

    public void editSoftwarea(int rowSelectedIndex) {
        if (rowSelectedIndex < 0) {
            return;
        }
        // izmena modela
        Software Software = BazaSoftware.getInstance().getRow(rowSelectedIndex);
        BazaSoftware.getInstance().editSoftwarea(Software.getId(), "3ds Max","Cloth","fbx","IK solver","Medium","White" ,"Line art","Blend", "Cone", "Perspective");

        // azuriranje prikaza
        MainGUIframe.getInstance().RefreshView2(null, -1);
    }



}