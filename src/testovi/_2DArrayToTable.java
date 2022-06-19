package testovi;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class _2DArrayToTable {
	public void _2DArrayToTable()
	{

	    String[][] data = {
	                         {"A1","B1","C1","D1"},
	                         {"A2","B2","C2","D2"},
	                         {"A3","B3","C3","D3"},
	                         {"A4","B4","C4","D4"},
	                         {"A5","B5","C5","D5"},
	                         {"A6","B6","C6","D6"},
	                         {"A7","B7","C7","D7"},
	                         {"A8","B8","C8","D8"},
	                         {"A9","B9","C9","D9"},
	                         {"A10","B10","C10","D10"} 
	                      };
	    
	    DefaultTableModel model = new DefaultTableModel();
	    
	    for(int i = 0; i < data.length; i++)
	    {
	        String[] row = new String[data[i].length];
	        
	        for(int j = 0; j < data[i].length; j++)
	        {
	            row[j] = data[i][j];
	        }
	        
	        model.addRow(row);
	    }
	    
	     for(String[] row : data){
	         model.addRow(row);
	     }
	    
	} 

}
