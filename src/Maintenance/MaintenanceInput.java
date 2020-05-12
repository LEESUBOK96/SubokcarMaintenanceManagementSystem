package Maintenance;

import java.util.Scanner;

public interface MaintenanceInput {
	
	public String getMaintenanceName();
	public void setMaintenanceName(String maintenanceName);
	public void setMaintenanceYear(int maintenanceYear);
	public void setDistancedriven(int distancedriven);
	public void setWorkshop(String workshop);
	public void getUserInput(Scanner input);
	public void printInfo();
	public void setMaintenanceName(Scanner input);
	public void setMaintenanceYear(Scanner input);
	public void setDistancedriven(Scanner input);
	public void setWorkshop(Scanner input);

}
