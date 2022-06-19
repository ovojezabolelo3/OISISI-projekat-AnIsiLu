package classes;

import javax.swing.JTable;

public class TableEmployee extends JTable{
	
	String[] columnNames = {
			"First Name",
            "Last Name",
            "Date of Birth",
            "JMBG",
            "Email",
            "Address",
             "Job position",
            "Software"}; //ovaj deo je ok i ne treba se menjati
	
	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~proba~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	Employee empProba = new Employee();
	Adress adrProb = new Adress();
	Employee jobPosProba=new Employee();
	Software softProba=new Software();
	
	/*
	Object[][] data = {
			{
				"First Name",
                "Last Name",
                "Date of Birth",
                "JMBG",
                "Email",
                "Address",
                 "Job position",
                "Software"},
			{
                	"First Name",
                    "Last Name",
                    "Date of Birth",
                    "JMBG",
                    "Email",
                    "Address",
                     "Job position",
                    "Software"},
			{
                    	empProba.getName(),
                    	empProba.getSurname(),
                    	empProba.getDateOfBirth(),
                    	empProba.getJmbg(),
                    	empProba.getEmail(),
                    	adrProb.getFullAddress(),
                    	jobPosProba.getJobPosition(),
                    	softProba.getSoftwareName()}
			}; */
	
	
}
