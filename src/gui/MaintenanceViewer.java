package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class MaintenanceViewer extends JPanel {
	
	WindowFrame frame;

	public MaintenanceViewer(WindowFrame frame) {
		this.frame = frame;
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Maintenance Name");
		model.addColumn("Maintenance Year");
		model.addColumn("Driven Distance");
		model.addColumn("Workshop");
		model.addColumn("Contact Info.");
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
	}
}