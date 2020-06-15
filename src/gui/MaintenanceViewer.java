package gui;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Maintenance.MaintenanceInput;
import manager.MaintenanceManager;

public class MaintenanceViewer extends JPanel {
	
	WindowFrame frame;
	
	MaintenanceManager maintenanceManager;

	public MaintenanceViewer(WindowFrame frame, MaintenanceManager maintenanceManager) {
		this.frame = frame;
		this.maintenanceManager = maintenanceManager;
		System.out.println("***" + maintenanceManager.size() + "***");
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Maintenance Name");
		model.addColumn("Maintenance Year");
		model.addColumn("Driven Distance");
		model.addColumn("Workshop");
		model.addColumn("Contact Info.");
		
		for(int i = 0; i< maintenanceManager.size(); i++) {
			Vector row = new Vector();
			MaintenanceInput mi = maintenanceManager.get(i);
			row.add(mi.getMaintenanceName());
			row.add(mi.getMaintenanceYear());
			row.add(mi.getDistancedriven());
			row.add(mi.getWorkshop());
			model.addRow(row);
		}
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
	}
}