package tables;

import javax.swing.table.AbstractTableModel;

import baze.BazaSoftware;

public class AbstractTableModelSoftware extends AbstractTableModel{
	
	private static final long serialVersionUID = 1L;

	public AbstractTableModelSoftware() {
	}

	// broj redova
	@Override
	public int getRowCount() {
		return BazaSoftware.getInstance().getSoftware().size();
	}
	
	// broj kolona
	@Override
	public int getColumnCount() {
		return BazaSoftware.getInstance().getColumnCount();
	}

	// nazivi kolona u zaglavlju
	@Override
	public String getColumnName(int column) {
		return BazaSoftware.getInstance().getColumnName(column);
	}
	
	// sadrzaj celije
	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		return BazaSoftware.getInstance().getValueAt(rowIndex, columnIndex);
	}
}
