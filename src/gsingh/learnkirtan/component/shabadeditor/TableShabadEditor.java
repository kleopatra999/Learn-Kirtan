package gsingh.learnkirtan.component.shabadeditor;

import gsingh.learnkirtan.component.shabadeditor.TextAreaShabadEditor.RedoAction;
import gsingh.learnkirtan.component.shabadeditor.TextAreaShabadEditor.UndoAction;
import gsingh.learnkirtan.parser.Parser;
import gsingh.learnkirtan.shabad.Shabad;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

@SuppressWarnings("serial")
public class TableShabadEditor extends JTable implements SwingShabadEditor {

	DefaultTableModel model = (DefaultTableModel) getModel();

	public TableShabadEditor() {
		super(16, 16);

		Integer[] headers = new Integer[16];
		for (int i = 0; i < 16; i++) {
			headers[i] = i + 1;
		}
		setRowHeight(20);
		model.setColumnIdentifiers(headers);
	}

	@Override
	public Component prepareRenderer(TableCellRenderer renderer, int row,
			int col) {
		Component c = super.prepareRenderer(renderer, row, col);
		if (!c.getBackground().equals(getSelectionBackground())) {
			if (row % 2 == 1) {
				c.setBackground(Color.LIGHT_GRAY);
			} else {
				c.setBackground(Color.WHITE);
			}
		}
		return c;
	}

	@Override
	public Shabad getShabad() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 16; i++) {
			String value = (String) model.getValueAt(0, i);
			if (value != null) {
				sb.append(model.getValueAt(0, i)).append(" ");
			}
		}
		Parser parser = new Parser();
		Shabad shabad = parser.parse(sb.toString());
		return shabad;
	}

	@Override
	public void setText(String text) {
		// TODO Auto-generated method stub
	}

	@Override
	public String getText() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setEditable(boolean bool) {
		// TODO Auto-generated method stub

	}

	@Override
	public void reset() {
		// TODO Auto-generated method stub

	}

	@Override
	public UndoAction getUndoAction() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RedoAction getRedoAction() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isModified() {
		// TODO Auto-generated method stub
		return false;
	}

	public void addRowAbove(int row) {
		model.insertRow(row, new Object[] {});
	}

	public void addRowBelow(int row) {
		// TODO
	}

	public void deleteRow(int row) {
		model.removeRow(row);
	}
}
