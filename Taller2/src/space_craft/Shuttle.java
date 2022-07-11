
package space_craft;


public class Shuttle extends SpaceCraft  implements ILoad{

	public Shuttle() {
	}
	
	public Shuttle(String fueltype) {
	
	this.fueltype = fueltype;
	
	}
	
	
	
	@Override
	protected void takeoff() {
		
	System.out.println(" takeoff with  solid chemical fuel");
	
	}
	
	public void takeoff(String fueltype) {
		
	System.out.println("takeoff with"+" liquid "+fueltype);
	
	}
	
	
	
	

	@Override
	public void thorwLoad() {
	
	}

	@Override
	protected void stop() {
	
	}







	
}
