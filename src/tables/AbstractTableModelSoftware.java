package tables;

import javax.swing.table.AbstractTableModel;

import baze.BazaSoftware;

public class AbstractTableModelSoftware extends AbstractTableModel{
	
	private static final long serialVersionUID = 1L;

	public AbstractTableModelSoftware() {
	}

	@Override
	public int getRowCount() {
		return BazaSoftware.getInstance().getSoftware().size();
	}

	@Override
	public int getColumnCount() {
		return BazaSoftware.getInstance().getColumnCount();
	}

	@Override
	public String getColumnName(int column) {
		return BazaSoftware.getInstance().getColumnName(column);
	}
	
	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		return BazaSoftware.getInstance().getValueAt(rowIndex, columnIndex);
	}
}
