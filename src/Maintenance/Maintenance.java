package Maintenance;

import java.util.Scanner;

public class Maintenance {
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

	public void setWorkshop(String workshop) {
		this.workshop = workshop;
	}
	
	public void printInfo() {
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
	System.out.println("Kind: "+ skind + "MaintenanceName:" + maintenanceName + "  MaintenanceYear:" 
	+ maintenanceYear + "  Distancedriven:" + distancedriven + "  Workshop:" + workshop);
	}	
	public void getUserInput(Scanner input) {
		System.out.print("Maintenance Name:");
		String maintenanceName = input.next();
		this.setMaintenanceName(maintenanceName);
		
		System.out.print("Maintenance Year:");
		int maintenanceYear = input.nextInt();
		this.setMaintenanceYear(maintenanceYear);
		
		System.out.print("Distance driven:");
		int distancedriven  = input.nextInt();
		this.setDistancedriven(distancedriven);
		
		System.out.print("Workshop:");
		String workshop  = input.next();
		this.setWorkshop(workshop);	
	}	
  }

