
package space_craft;

import java.util.Scanner;


public class SpaceStation {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		boolean flag=true;
		int option;
		boolean isSpaceCraft=true;
		
		while(flag){
			
		
		
		if(isSpaceCraft){
		
		Shuttle Space1 = new Shuttle();
		Shuttle Space2 = new Shuttle("PROPELENTE");
		NotTripulated Space3 = new NotTripulated();
		Creweb Space4 = new Creweb();
		
		
		Space1.takeoff();
		Space2.takeoff("propelente");
		Space3.takeoff();
		Space4.takeoff();
		
			System.out.println("Want to stop th program?/n 1.YES/n 2. NO");
			option=keyboard.nextInt();
			
			if(option==1){
			
			
			flag=false;
			
			}
			
		}else{
		
			System.out.println("Is another Vehicle");
		
		
		}

		
		}
		
	}

	
}
