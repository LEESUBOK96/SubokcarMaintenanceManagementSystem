package Maintenance;

import java.util.Scanner;

public class BreakpartMaintenance extends Maintenance {
	
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
		System.out.print("Do you have an workshop data? (Y/N)");
		answer = input.next().charAt(0);
		if (answer == 'y' || answer == 'Y') {
		System.out.print("Workshop:");
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

}
