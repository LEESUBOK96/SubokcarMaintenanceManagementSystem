package Maintenance;

import java.util.Scanner;

import exception.WorkshopFormatException;

public abstract class Maintenance implements MaintenanceInput {
	protected MaintenanceKind kind = MaintenanceKind.Othermaintenancepart;
	protected String maintenanceName;
	protected int maintenanceYear;
	protected int distancedriven;
	protected String workshop;
	
	
	public Maintenance() {
		
		}
	
	public Maintenance(MaintenanceKind kind) {
		this.kind = kind;
		
	}
	
	public Maintenance(String maintenanceName, int distancedriven) {
		this.maintenanceName = maintenanceName;
		this.distancedriven = distancedriven;
		
	}
		
	public Maintenance(String maintenanceName, int maintenanceYear, int distancedriven,String workshop){
	
		this.maintenanceName  = maintenanceName;
		this.maintenanceYear = maintenanceYear;
		this.distancedriven = distancedriven;
		this.workshop = workshop;
				
	}
	
	public Maintenance(MaintenanceKind kind, String maintenanceName, int maintenanceYear, int distancedriven,String workshop){
		this.kind = kind;
		this.maintenanceName  = maintenanceName;
		this.maintenanceYear = maintenanceYear;
		this.distancedriven = distancedriven;
		this.workshop = workshop;
				
	}

	public MaintenanceKind getKind() {
		return kind;
	}

	public void setKind(MaintenanceKind kind) {
		this.kind = kind;
	}

	public String getMaintenanceName() {
		return maintenanceName;
	}

	public void setMaintenanceName(String maintenanceName) {
		this.maintenanceName = maintenanceName;
	}

	public int getMaintenanceYear() {
		return maintenanceYear;
	}

	public void setMaintenanceYear(int maintenanceYear) {
		this.maintenanceYear = maintenanceYear;
	}

	public int getDistancedriven() {
		return distancedriven;
	}

	public void setDistancedriven(int distancedriven) {
		this.distancedriven = distancedriven;
	}

	public String getWorkshop() {
		return workshop;
	}

	public void setWorkshop(String workshop) throws WorkshopFormatException {
		if(!workshop.contains("-") && !workshop.equals("")) {
			throw new WorkshopFormatException();
		}
		
		this.workshop = workshop;
	}
	
	public abstract void printInfo();
	
	public void setMaintenanceName(Scanner input) {
		System.out.print("Maintenance Name:");
		String maintenanceName1 = input.next();
		this.setMaintenanceName(maintenanceName1);			
	}
	public void setMaintenanceYear(Scanner input) {
		System.out.print("Maintenance Year:");
		int maintenanceYear = input.nextInt();
		this.setMaintenanceYear(maintenanceYear);			
	}
	public void setDistancedriven(Scanner input) {
		System.out.print("Distance driven:");
		int distancedriven  = input.nextInt();
		this.setDistancedriven(distancedriven);
	}
	public void setWorkshop(Scanner input) {
		String workshop = "";
		while(!workshop.contains("-")) {
		System.out.print("Workshop:");
		workshop  = input.next();
		try {
			this.setWorkshop(workshop);
		} catch (WorkshopFormatException e) {
			System.out.println("Incorrect Workshop Format. put the Workshop that contains '-' ");
		}
	}
}
	
	public String getkind() {
		String skind = "none";
	    switch(this.kind) {
	    case Enginepart:
	    	skind = "Engine";
	    	break;
	    case Tirepart:
	    	skind = "Tire";
	    	break;
	    case Breakpart:
	    	skind = "Break";
	    	break;
	    case Othermaintenancepart:
	    	skind = "Other";
	    	break;
	    	default:		
	    }
	    return skind;
	}
}	  