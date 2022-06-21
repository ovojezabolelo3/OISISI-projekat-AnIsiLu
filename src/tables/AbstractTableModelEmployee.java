package tables;

import javax.swing.table.AbstractTableModel;

import baze.BazaEmployee;

public class AbstractTableModelEmployee extends AbstractTableModel{
	
	private static final long serialVersionUID = 1L;

	public AbstractTableModelEmployee() {
	}

	@Override
	public int getRowCount() {
		return BazaEmployee.getInstance().getEmployee().size();
	}
	
	@Override
	public int getColumnCount() {
		return BazaEmployee.getInstance().getColumnCount();
	}

	@Override
	public String getColumnName(int column) {
		return BazaEmployee.getInstance().getColumnName(column);
	}
	
	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		return BazaEmployee.getInstance().getValueAt(rowIndex, columnIndex);
	}
}
