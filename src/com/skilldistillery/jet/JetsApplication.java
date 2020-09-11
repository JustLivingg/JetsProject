package com.skilldistillery.jet;

import java.util.Scanner;

public class JetsApplication {
private AirField airfield;
private Scanner kb = new Scanner(System.in);

public static void main(String[] args) {
	JetsApplication app = new JetsApplication();
	
	app.launch();
}


public JetsApplication() {
	super();
	// TODO Auto-generated constructor stub
}

private void launch() {
	
}

private void displayUserMenu() {
System.out.println("*************************************************");	
System.out.println("* Please select an item from the following menu *");
System.out.println("*                                               *");
System.out.println("* 1. List fleet.                                *");
System.out.println("* 2. Fly all jets.                              *");
System.out.println("* 3. View fastest jet.                          *");
System.out.println("* 4. View jet with the longest range.           *");
System.out.println("* 5. Load all Cargo Jets.                       *");
System.out.println("* 6. Dogfight!!!!!!                             *");
System.out.println("* 7. Add a jet to Fleet.                        *");
System.out.println("* 8. Remove a jet from the Fleet.               *");
System.out.println("* 9. Quit.                                      *");
System.out.println("*                                               *");
System.out.println("*************************************************");
System.out.println();
}


}
