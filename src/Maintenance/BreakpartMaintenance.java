package Maintenance;

import java.util.Scanner;

public class BreakpartMaintenance extends PreviousMaintenance {
	
	public BreakpartMaintenance(MaintenanceKind kind) {
		super(kind);	
	}	
	public void getUserInput(Scanner input) {
		setMaintenanceName(input);
		setMaintenanceYear(input);
		setDistancedriven(input);
		setWorkshopwithYN(input);
  }		
}