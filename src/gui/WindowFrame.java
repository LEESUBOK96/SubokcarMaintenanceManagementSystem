package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import manager.MaintenanceManager;

public class WindowFrame extends JFrame {
	
	MaintenanceManager maintenanceManager;
	MenuSelection menuselection;
	MaintenanceAdder maintenanceadder;
	MaintenanceViewer maintenanceviewer;
	
	
	public WindowFrame(MaintenanceManager maintenanceManager) {
		this.setSize(500, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("My Frame");
		
		this.maintenanceManager = maintenanceManager;
		this.menuselection = new MenuSelection(this);
		this.maintenanceadder = new MaintenanceAdder(this);
		this.maintenanceviewer = new MaintenanceViewer(this, this.maintenanceManager);
		
		
		
		this.setupPanel(menuselection);
		
		this.setVisible(true);
	}

	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}
	
	public MenuSelection getMenuselection() {
		return menuselection;
	}

	public void setMenuselection(MenuSelection menuselection) {
		this.menuselection = menuselection;
	}

	public MaintenanceAdder getMaintenanceadder() {
		return maintenanceadder;
	}

	public void setMaintenanceadder(MaintenanceAdder maintenanceadder) {
		this.maintenanceadder = maintenanceadder;
	}

	public MaintenanceViewer getMaintenanceviewer() {
		return maintenanceviewer;
	}

	public void setMaintenanceviewer(MaintenanceViewer maintenanceviewer) {
		this.maintenanceviewer = maintenanceviewer;
	}		
}
