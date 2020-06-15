package Maintenance;

import java.util.Scanner;

import exception.WorkshopFormatException;

public interface MaintenanceInput {
	
	public String getMaintenanceName();
	public void setMaintenanceName(String maintenanceName);
	public int getMaintenanceYear();
	public void setMaintenanceYear(int maintenanceYear);
	public int getDistancedriven();
	public void setDistancedriven(int distancedriven);
	public String getWorkshop();
	public void setWorkshop(String workshop) throws WorkshopFormatException;
	public void getUserInput(Scanner input);
	public void printInfo();
	public void setMaintenanceName(Scanner input);
	public void setMaintenanceYear(Scanner input);
	public void setDistancedriven(Scanner input);
	public void setWorkshop(Scanner input);

}
