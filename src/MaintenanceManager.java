import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import Maintenance.BreakpartMaintenance;
import Maintenance.EnginepartMaintenance;
import Maintenance.Maintenance;
import Maintenance.MaintenanceInput;
import Maintenance.MaintenanceKind;
import Maintenance.OthermaintenancepartMaintenance;
import Maintenance.TirepartMaintenance;

public class MaintenanceManager {
	ArrayList<MaintenanceInput> maintenances = new ArrayList<MaintenanceInput>();
	Scanner input;
	
	MaintenanceManager(Scanner input){
		this.input = input;
	}
	
	public void addMaintenance() {
		int kind = 0;
		MaintenanceInput maintenanceInput;
		while(kind !=1 && kind !=2 && kind !=3 && kind !=4) {
		try {
		System.out.println("1 for Enginepart");
		System.out.println("2 for Tirepart");
		System.out.println("3 for Breakpart");
		System.out.println("4 for Othermaintenancepart");
		System.out.print("Select num for Maintenance Kind between 1-4 :");
		kind = input.nextInt();
		if (kind ==1) {
			maintenanceInput = new EnginepartMaintenance(MaintenanceKind.Enginepart);
			maintenanceInput.getUserInput(input);
			maintenances.add(maintenanceInput);
			break;
		}
		else if (kind == 2) {
			maintenanceInput = new TirepartMaintenance(MaintenanceKind.Tirepart);
			maintenanceInput.getUserInput(input);
			maintenances.add(maintenanceInput);
			break;
		}
        else if (kind == 3) {
        	maintenanceInput = new BreakpartMaintenance(MaintenanceKind.Breakpart);
        	maintenanceInput.getUserInput(input);
        	maintenances.add(maintenanceInput);
			break;
		}
        else if (kind == 4) {
        	maintenanceInput = new OthermaintenancepartMaintenance(MaintenanceKind.Othermaintenancepart);
        	maintenanceInput.getUserInput(input);
        	maintenances.add(maintenanceInput);
			break;
		}
        else {
        	System.out.print("Select num for Maintenance Kind between 1-4 :");
            }
		 }
		catch(InputMismatchException e) {
			System.out.println("Please put an integer between 1 and 4!");
			if(input.hasNext()) {
			input.next();	
			}
			kind = -1;
		 }
	   }	
    }
		public void deleteMaintenance() {
			
			System.out.print("Maintenance Name:");
			String maintenanceName = input.next();	
			int index = findIndex(maintenanceName);
			removefromMaintenances(index, maintenanceName);	
		}
		public int findIndex(String maintenanceName) {
			int index = -1;
			for (int i = 0; i<maintenances.size(); i++) {
				 if(maintenances.get(i).getMaintenanceName().equals(maintenanceName)) {
				       index = i;
				    	break;				    
				    }
			}	
		return index;
		}
		public int removefromMaintenances(int index, String maintenanceName) {
			if(index >= 0) {
				maintenances.remove(index);
				System.out.println("the maintenance " + maintenanceName + "is deleted");
				return 1;
			}
			else {
				System.out.println("the maintenance has not been registered");
				return -1;
			}
		}		
		public void editMaintenance(){			
			System.out.print("Maintenance Name:");
			String maintenanceName = input.next();
			for (int i = 0; i<maintenances.size(); i++) {
			MaintenanceInput maintenance = maintenances.get(i);	
			if(maintenance.getMaintenanceName().equals(maintenanceName)) {
				int num = -1;				
				while(num !=5) {
                showEditMenu();
				num = input.nextInt();
				switch(num){
				case 1: maintenance.setMaintenanceName(input);
					break;
				case 2: maintenance.setMaintenanceYear(input);
					break;
				case 3: maintenance.setDistancedriven(input);
					break;
				case 4: maintenance.setWorkshop(input);
					break;
				default:
					continue;
				} 
			}//while
				break;
		  }//if	
		 }//for						
		}
		
		public void viewMaintenances() {
			System.out.println("# of registered maintenances :" + maintenances.size());
			for (int i = 0; i<maintenances.size(); i++) {
				maintenances.get(i).printInfo();
			}			
		}

		
		public void showEditMenu() {
			System.out.println("++ Subokcar Maintenance Info Edit Menu ++");
			System.out.println(" 1. Edit Maintenance Name");
			System.out.println(" 2. Edit Maintenance Year");
			System.out.println(" 3. Edit Maintenance Distancedriven");
			System.out.println(" 4. Edit Maintenance workshop");
			System.out.println(" 5. Exit");
			System.out.print(" Select one number between 1-5 :");		
		}
		
}
