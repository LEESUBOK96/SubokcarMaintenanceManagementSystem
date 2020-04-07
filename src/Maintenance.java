
public class Maintenance {
	
	String maintenanceName;
	int maintenanceYear;
	int distancedriven;
	String workshop;
	
	public Maintenance() {
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
		
	public void printInfo() {
		System.out.println("MaintenanceName:" + maintenanceName + "  MaintenanceYear:" 
	+ maintenanceYear + "  Distancedriven:" + distancedriven + "  Workshop:" + workshop);
	}	
	
}
