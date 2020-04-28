package Maintenance;

import java.util.Scanner;

public class OthermaintenancepartMaintenance extends Maintenance {
	
	public OthermaintenancepartMaintenance(MaintenanceKind kind) {
		super(kind);
		
	}
	
	protected int fatherdistancedriven;
	protected String fatherworkshop;

	public void getUserInput(Scanner input) {
		System.out.print("Maintenance Name:");
		String maintenanceName = input.next();
		this.setMaintenanceName(maintenanceName);
		
		System.out.print("Maintenance Year:");
		int maintenanceYear = input.nextInt();
		this.setMaintenanceYear(maintenanceYear);
		
		System.out.print("Distance driven:");
		int distancedriven  = input.nextInt();
		this.setDistancedriven(distancedriven);
		
		char answer = 'x';
		while (answer != 'y' && answer != 'Y'&& answer != 'n' && answer != 'N') {
		System.out.print("Do you have a previous workshop data? (Y/N)");
		answer = input.next().charAt(0);
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
		
  }
	public void printInfo() {
		String skind = "none";
    switch(this.kind) {
    case Enginepart:
    	skind = "Engine";
    	break;
    case Tirepart:
    	skind = "Tire";
    	break;
    case Breakpart:
    	skind = "Break";
    	break;
    case Othermaintenancepart:
    	skind = "Other";
    	break;
    	default:
    		
    }
	System.out.println("Kind: "+ skind + "MaintenanceName:" + maintenanceName + "  MaintenanceYear:" 
	+ maintenanceYear + "  Distancedriven:" + distancedriven + "  Workshop:" + workshop + " previous Distancedriven:" + distancedriven + "  previous workshop:" + workshop);
	}
	
}
