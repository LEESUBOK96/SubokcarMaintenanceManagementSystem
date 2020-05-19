package Maintenance;

import java.util.Scanner;

import exception.WorkshopFormatException;

public class OthermaintenancepartMaintenance extends PreviousMaintenance {
	
	public OthermaintenancepartMaintenance(MaintenanceKind kind) {
		super(kind);
		
	}
	
	protected int fatherdistancedriven;
	protected String fatherworkshop;

	public void getUserInput(Scanner input) {
		setMaintenanceName(input);
		setMaintenanceYear(input);
		setDistancedriven(input);
		setWorkshopwithYN(input);
		setPreviousWorkshopwithYN(input);	
  }
	public void setPreviousWorkshopwithYN(Scanner input) {
		char answer = 'x';
		while (answer != 'y' && answer != 'Y'&& answer != 'n' && answer != 'N') {
		System.out.print("Do you have a previous workshop data? (Y/N)");
		answer = input.next().charAt(0);
		try {
			if (answer == 'y' || answer == 'Y') {
			System.out.print("previous Workshop:");
			String workshop  = input.next();
			this.setWorkshop(workshop);
			break;
		}
			else if(answer == 'n' || answer == 'N') {
				this.setWorkshop("");
				break;
			}
			else {
				
			}
		}
		catch(WorkshopFormatException e) {
			System.out.println("Incorrect Workshop Format. put the Workshop that contains '-' ");	
		}
	}
}
	public void printInfo() {
		String skind = getkind();
	System.out.println("Kind: "+ skind + "MaintenanceName:" + maintenanceName + "  MaintenanceYear:" 
	+ maintenanceYear + "  Distancedriven:" + distancedriven + "  Workshop:" + workshop + " previous Distancedriven:" + distancedriven + "  previous workshop:" + workshop);
	}
}
