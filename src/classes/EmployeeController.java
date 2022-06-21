package classes;

import baze.BazaEmployee;
import gui.MainGUIframe;

public class EmployeeController {

private static EmployeeController instance = null;

    public static EmployeeController getInstance() {
        if (instance == null) {
            instance = new EmployeeController();
        }
        return instance;
    }

    private EmployeeController() {}

    public void addEmployee() {
        // izmena modela
        BazaEmployee.getInstance().addEmployee("Isidora","Nikolic","53453453542","1.3.2000","isanfnsdfn","jos pit 88","rigg","maya");
         //azuriranje prikaza
        MainGUIframe.getInstance().azurirajPrikaz("DODAT", -1);
    }

    public void deleteEmployeea(int rowSelectedIndex) {
        if (rowSelectedIndex < 0) {
            return;
        }
        // izmena modela
        Employee employee = BazaEmployee.getInstance().getRow(rowSelectedIndex);
        BazaEmployee.getInstance().deleteEmployeea(employee.getId());
        // azuriranje prikaza
        MainGUIframe.getInstance().azurirajPrikaz("UKLONJEN", rowSelectedIndex);
    }

    public void editEmployeea(int rowSelectedIndex) {
        if (rowSelectedIndex < 0) {
            return;
        }
        // izmena modela
        Employee employee = BazaEmployee.getInstance().getRow(rowSelectedIndex);
        BazaEmployee.getInstance().editEmployeea(employee.getId(), "Luna","Cvet","555","1.3.2700","lunacv","cara laz 68","rigg", "max");

        // azuriranje prikaza
        MainGUIframe.getInstance().azurirajPrikaz(null, -1);
    }



}
