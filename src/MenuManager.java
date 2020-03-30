import java.util.Scanner;

public class MenuManager {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = 5;
		
		while(num !=6) {

		System.out.println("+++ Subokcar Maintenance Management System +++");
		System.out.println(" 1. Add Maintenance");
		System.out.println(" 2. Delete Maintenance");
		System.out.println(" 3. Edit Maintenance");
		System.out.println(" 4. View Maintenance");
		System.out.println(" 5. Show a menu");
		System.out.println(" 6. Exit");
		System.out.print(" Select one number between 1-6 :");
		num = input.nextInt();
		if (num == 1) {
			addMaintenance();
		}
		else if (num == 2) {
			deleteMaintenance();
		}
		else if (num == 3) {
			editMaintenance();
			
		}
		else if (num == 4) {
			viewMaintenance();
			
		}
		else {
			continue;
		}
		}

}
	public static void addMaintenance() {
	Scanner input = new Scanner(System.in);
	System.out.print("Maintenance Name:");
	String maintenanceName = input.next();	
	System.out.print("Maintenance Year:");
	int maintenanceYear = input.nextInt();
	System.out.print("Distance driven:");
	int distancedriven  = input.nextInt();
	System.out.print("Workshop:");
	String workshop  = input.next();
	
	}
	public static void deleteMaintenance() {
		Scanner input = new Scanner(System.in);
		System.out.print("Maintenance Name:");
		String maintenanceName = input.next();	
	
	}
	
	public static void editMaintenance() {
		Scanner input = new Scanner(System.in);
		System.out.print("Maintenance Name:");
		String maintenanceName = input.next();
		
		
	}
	
	public static void viewMaintenance() {
		Scanner input = new Scanner(System.in);
		System.out.print("Maintenance Name:");
		String maintenanceName = input.next();
	
	
	}
	}