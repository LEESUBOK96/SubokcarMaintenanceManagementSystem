import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;
import log.EventLogger;

public class MenuManager {
	static EventLogger logger = new EventLogger("log.txt");
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		MaintenanceManager maintenanceManager = getObject("maintenancemanager.ser");
		if(maintenanceManager == null) {
	    maintenanceManager = new MaintenanceManager(input);
		}
		else {
			maintenanceManager.setScanner(input);
		}
		selectMenu(input, maintenanceManager);
		putObject(maintenanceManager, "maintenancemanager.ser");
  }
 public static void selectMenu(Scanner input, MaintenanceManager maintenanceManager) {
	 int num = -1;	
		while(num !=5) {
			try {
        showMenu();      
		num = input.nextInt();
		switch(num) {
		case 1: maintenanceManager.addMaintenance();
		logger.log("add a maintenance");
			break;
		case 2: maintenanceManager.deleteMaintenance();
		logger.log("delete a maintenance");
			break;
		case 3: maintenanceManager.editMaintenance();
		logger.log("edit a maintenance");
			break;
		case 4: maintenanceManager.viewMaintenances();
		logger.log("view a list of maintenance");
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
 public static MaintenanceManager getObject(String fileName) {
	 MaintenanceManager maintenanceManager = null;
	 
	 
	 
	try {
		FileInputStream file = new FileInputStream(fileName);
		ObjectInputStream in = new ObjectInputStream(file);
		
		maintenanceManager = (MaintenanceManager)in.readObject();
		
		in.close();
		file.close();
	} catch (FileNotFoundException e) {
		return maintenanceManager;
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return maintenanceManager;
  }
 public static void putObject(MaintenanceManager maintenanceManager, String fileName) {
	try {
		FileOutputStream file = new FileOutputStream(fileName);
		ObjectOutputStream out = new ObjectOutputStream(file);
		
		out.writeObject(maintenanceManager);
		
		out.close();
		file.close();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }
}