package tables;

import javax.swing.table.AbstractTableModel;

import baze.BazaEmployee;

public class AbstractTableModelEmployee extends AbstractTableModel{
	public AbstractTableModelEmployee() {
	}

	// broj redova
	@Override
	public int getRowCount() {
		return BazaEmployee.getInstance().getEmployee().size();
	}
	
	// broj kolona
	@Override
	public int getColumnCount() {
		return BazaEmployee.getInstance().getColumnCount();
	}

	// nazivi kolona u zaglavlju
	@Override
	public String getColumnName(int column) {
		return BazaEmployee.getInstance().getColumnName(column);
	}
	
	// sadrzaj celije
	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		return BazaEmployee.getInstance().getValueAt(rowIndex, columnIndex);
	}
}
