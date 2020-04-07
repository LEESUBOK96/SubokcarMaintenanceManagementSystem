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
				System.out.println("the maintenance to be edited is " + maintenanceName);
				
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
