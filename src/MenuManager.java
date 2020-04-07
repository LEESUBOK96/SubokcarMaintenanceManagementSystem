import java.util.Scanner;

public class MenuManager {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		MaintenanceManager maintenanceManager = new MaintenanceManager(input);
		
		int num = -1;
		
		while(num !=5) {

		System.out.println("+++ Subokcar Maintenance Management System +++");
		System.out.println(" 1. Add Maintenance");
		System.out.println(" 2. Delete Maintenance");
		System.out.println(" 3. Edit Maintenance");
		System.out.println(" 4. View Maintenance");
		System.out.println(" 5. Exit");
		System.out.print(" Select one number between 1-5 :");
		num = input.nextInt();
		if (num == 1) {
			maintenanceManager.addMaintenance();
		}
		else if (num == 2) {
			maintenanceManager.deleteMaintenance();
		}
		else if (num == 3) {
			maintenanceManager.editMaintenance();
			
		}
		else if (num == 4) {
			maintenanceManager.viewMaintenance();
			
		}
		else {
			continue;
		}
		}

  }
	
	}