package Maintenance;

import java.util.Scanner;

public abstract class PreviousMaintenance extends Maintenance {
	
	public PreviousMaintenance(MaintenanceKind kind) {
		super(kind);
	}
	
	@Override
	public abstract void getUserInput(Scanner input); 

	@Override
	public void printInfo() {
		String skind = getkind();	
		System.out.println("Kind: "+ skind + "MaintenanceName:" + maintenanceName + "  MaintenanceYear:" 
		+ maintenanceYear + "  Distancedriven:" + distancedriven + "  Workshop:" + workshop);
	  }
	public void setWorkshopwithYN(Scanner input) {
		char answer = 'x';
		while (answer != 'y' && answer != 'Y'&& answer != 'n' && answer != 'N') {
		System.out.print("Do you have an workshop data? (Y/N)");
		answer = input.next().charAt(0);
		if (answer == 'y' || answer == 'Y') {
		setWorkshop(input);
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