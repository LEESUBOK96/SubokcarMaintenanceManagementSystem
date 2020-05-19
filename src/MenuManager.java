import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuManager {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		MaintenanceManager maintenanceManager = new MaintenanceManager(input);
		selectMenu(input, maintenanceManager);
		
  }
 public static void selectMenu(Scanner input, MaintenanceManager maintenanceManager) {
	 int num = -1;	
		while(num !=5) {
			try {
        showMenu();      
		num = input.nextInt();
		switch(num) {
		case 1: maintenanceManager.addMaintenance();
			break;
		case 2: maintenanceManager.deleteMaintenance();
			break;
		case 3: maintenanceManager.editMaintenance();
			break;
		case 4: maintenanceManager.viewMaintenances();
			break;
		default:
			continue;
		}
	  }
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 5!");
				if(input.hasNext()) {
				input.next();	
				}
				num = -1;
		}
	} 
 }	
 public static void showMenu() {
	 System.out.println("+++ Subokcar Maintenance Management System +++");
		System.out.println(" 1. Add Maintenance");
		System.out.println(" 2. Delete Maintenance");
		System.out.println(" 3. Edit Maintenance");
		System.out.println(" 4. View Maintenances");
		System.out.println(" 5. Exit");
		System.out.print(" Select one number between 1-5 :"); 
 } 	
}