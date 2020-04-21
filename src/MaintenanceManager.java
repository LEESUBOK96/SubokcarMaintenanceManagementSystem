import java.util.ArrayList;
import java.util.Scanner;

import Maintenance.BreakpartMaintenance;
import Maintenance.Maintenance;

public class MaintenanceManager {
	ArrayList<Maintenance> maintenances = new ArrayList<Maintenance>();
	Scanner input;
	
	MaintenanceManager(Scanner input){
		this.input = input;
	}
	
	public void addMaintenance() {
		int kind = 0;
		Maintenance maintenance;
		while(kind !=1 && kind !=2 && kind !=3 && kind !=4) {
		System.out.print("Select num for Maintenance Kind between 1-4 :");
		System.out.print("1 for Enginepart");
		System.out.print("2 for Tirepart");
		System.out.print("3 for Breakpart");
		System.out.print("4 for Othermaintenancepart");
		kind = input.nextInt();
		if (kind ==1) {
			maintenance = new Maintenance();
			maintenance.getUserInput(input);
			maintenances.add(maintenance);
			break;
		}
		else if (kind == 2) {
			maintenance = new Maintenance();
			maintenance.getUserInput(input);
			maintenances.add(maintenance);
			break;
		}
        else if (kind == 3) {
        	maintenance = new BreakpartMaintenance();
        	maintenance.getUserInput(input);
        	maintenances.add(maintenance);
			break;
		}
        else if (kind == 4) {
        	maintenance = new Maintenance();
        	maintenance.getUserInput(input);
        	maintenances.add(maintenance);
			break;
		}
        else {
        	System.out.print("Select num for Maintenance Kind between 1-4 :");
            }
		}	
    }
		public void deleteMaintenance() {
			
			System.out.print("Maintenance Name:");
			String maintenanceName = input.next();	
			int index = -1;
			for (int i = 0; i<maintenances.size(); i++) {
				 if(maintenances.get(i).getMaintenanceName().equals(maintenanceName)) {
				       index = i;
				    	break;
				    
				    }
			}
			
			if(index >= 0) {
				maintenances.remove(index);
				System.out.println("the maintenance " + maintenanceName + "is deleted");				
			}
			else {
				System.out.println("the maintenance has not been registered");
				return;
			}
		}
		
		
		public void editMaintenance() {
			
			System.out.print("Maintenance Name:");
			String maintenanceName = input.next();
			for (int i = 0; i<maintenances.size(); i++) {
			Maintenance maintenance = maintenances.get(i);	
			if(maintenance.getMaintenanceName().equals(maintenanceName)) {
				int num = -1;
				
				while(num !=5) {

				System.out.println("++ Subokcar Maintenance Info Edit Menu ++");
				System.out.println(" 1. Edit Maintenance Name");
				System.out.println(" 2. Edit Maintenance Year");
				System.out.println(" 3. Edit Maintenance Distancedriven");
				System.out.println(" 4. Edit Maintenance workshop");
				System.out.println(" 5. Exit");
				System.out.print(" Select one number between 1-5 :");
				num = input.nextInt();
				if (num == 1) {
					System.out.print("Maintenance Name:");
					String maintenanceName1 = input.next();
					maintenance.setMaintenanceName(maintenanceName1);
					
				}
				else if (num == 2) {
					System.out.print("Maintenance Year:");
					int maintenanceYear = input.nextInt();
					maintenance.setMaintenanceYear(maintenanceYear);
					
				}
				else if (num == 3) {
					System.out.print("Distance driven:");
					int distancedriven  = input.nextInt();
					maintenance.setDistancedriven(distancedriven);
					
				}
				else if (num == 4) {
					System.out.print("Workshop:");
					String workshop  = input.next();
					maintenance.setWorkshop(workshop);
					
				}
				else {
					continue;
			 }//if
			}//while
				break;
		  }//if	
		 }//for						
		}
		
		public void viewMaintenances() {
			
//			System.out.print("Maintenance Name:");
//			String maintenanceName = input.next();
			System.out.println("# of registered maintenances :" + maintenances.size());
			for (int i = 0; i<maintenances.size(); i++) {
				maintenances.get(i).printInfo();
			}			
		}
}
