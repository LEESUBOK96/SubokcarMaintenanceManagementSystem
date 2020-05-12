package Maintenance;

import java.util.Scanner;

public class EnginepartMaintenance extends Maintenance {
	
	public EnginepartMaintenance(MaintenanceKind kind) {
		super(kind);
		
	}
	public void getUserInput(Scanner input) {
		setMaintenanceName(input);
		setMaintenanceYear(input);
		setDistancedriven(input);
		setWorkshop(input);
	}
	public void printInfo() {
		String skind = getkind();
	System.out.println("Kind: "+ skind + "MaintenanceName:" + maintenanceName + "  MaintenanceYear:" 
	+ maintenanceYear + "  Distancedriven:" + distancedriven + "  Workshop:" + workshop);
	}
}
