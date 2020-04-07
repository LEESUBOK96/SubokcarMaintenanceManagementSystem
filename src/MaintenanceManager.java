import java.util.Scanner;

public class MaintenanceManager {
	Maintenance maintenance;
	Scanner input;
	
	MaintenanceManager(Scanner input){
		this.input = input;
	}
	
	public void addMaintenance() {
	    maintenance = new Maintenance();
		System.out.print("Maintenance Name:");
		maintenance.maintenanceName = input.next();	
		System.out.print("Maintenance Year:");
		maintenance.maintenanceYear = input.nextInt();
		System.out.print("Distance driven:");
		maintenance.distancedriven  = input.nextInt();
		System.out.print("Workshop:");
		maintenance.workshop  = input.next();
		
		}
		public void deleteMaintenance() {
			
			System.out.print("Maintenance Name:");
			String maintenanceName = input.next();	
		    		   
		    if(maintenance.maintenanceName.equals(maintenanceName)) {
		        maintenance = null;
		    	System.out.println("the maintenance is deleted");
		    
		    }
		    else {
		    	System.out.println("the maintenance has not been registered");
		    	return;
		    }
		}
		
		
		public void editMaintenance() {
			
			System.out.print("Maintenance Name:");
			String maintenanceName = input.next();
			if(maintenance.maintenanceName.equals(maintenanceName)) {
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
					maintenance.maintenanceName = input.next();	
					
				}
				else if (num == 2) {
					System.out.print("Maintenance Year:");
					maintenance.maintenanceYear = input.nextInt();
					
				}
				else if (num == 3) {
					System.out.print("Distance driven:");
					maintenance.distancedriven  = input.nextInt();
					
					
				}
				else if (num == 4) {
					System.out.print("Workshop:");
					maintenance.workshop  = input.next();
					
					
				}
				else {
					continue;
				}
				}
				
			}
			
			
		}
		
		public void viewMaintenance() {
			
			System.out.print("Maintenance Name:");
			String maintenanceName = input.next();
			if(maintenance.maintenanceName.equals(maintenanceName)) {
				maintenance.printInfo();
		
		}
		}
}
