package com.skilldistillery.jet;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JetsApplication {

	List<Jet> ListJets = new ArrayList<>();
	private AirField airfield;
	private static Scanner kb = new Scanner(System.in);

	public static void main(String[] args) {
		JetsApplication app = new JetsApplication();

		app.launch(kb);
	}

	private void launch(Scanner kb) {
		
		
		boolean keepGoing = true;
		int choice;

		while (keepGoing) {
			displayUserMenu();
			System.out.print("Pick a choice from the menu: ");
			choice = kb.nextInt();
			System.out.println();
			// Switch was used with while loop to keep repeating menu after picking menu
			// item.
			switch (choice) {
			case 1:
				listFleet();
				break;
			case 2:
				flyAllJets();
				break;
			case 3:
				fastestJet();
				break;
			case 4:
				longestJetRange();
				break;
			case 5:

				break;
			case 6:
				System.out.println("How did you know it was a MIG? Well because it was inverted.");
				System.out.println("Tom Cruise will be back to fight again in Top Gun 3.");
				System.out.println();
				break;
			case 7:
				addJets();
				break;
			case 8:

				break;
			case 9:
				System.out.println("You have chosen to quit the program. Goodbye.");
				keepGoing = false;
				break;
			default:
				System.out.println("Invalid entry, please try again.");
				break;
			}

		}
	}

//User story #4 create menu with the options as follows:
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
//User story #5
	public void listFleet() {
		try {
			FileReader fr = new FileReader("jets.txt");
			BufferedReader br = new BufferedReader(fr);
			String line;
			while ((line = br.readLine()) != null) {
				String[] fields = line.split(", ");
				{
					if (fields[4].contains("cargo")) {
						CargoPlane newJet = new CargoPlane(fields[0], Double.parseDouble(fields[1]),
								Integer.parseInt(fields[2]), Long.parseLong(fields[3]));
						ListJets.add(newJet);
					}
					if (fields[4].contains("fighter")) {
						FighterJet newJet = new FighterJet(fields[0], Double.parseDouble(fields[1]),
								Integer.parseInt(fields[2]), Long.parseLong(fields[3]));
						ListJets.add(newJet);
					}
					if (fields[4].contains("regular")) {
						RegularJet newJet = new RegularJet(fields[0], Double.parseDouble(fields[1]),
								Integer.parseInt(fields[2]), Long.parseLong(fields[3]));
						ListJets.add(newJet);
					}
				}
			}
		} catch (IOException e) {
			System.err.println(e);
		}
		System.out.println(ListJets + "\n");
	}

	public void flyAllJets() {
		for (Jet jet : ListJets) {
			jet.fly();
		}
	}

	public void fastestJet() {
		Jet speedOfJets = ListJets.get(0);
		for (int i = 0; i < ListJets.size(); i++) {
			Jet speedTracker = ListJets.get(i);
			if (speedOfJets.getSpeed() < speedTracker.getSpeed()) {
				speedOfJets = speedTracker;
			}
		}
		System.out.println("The fastet " + speedOfJets);
		System.out.println();
	}

	

	public void longestJetRange() {
		Jet jetRange = ListJets.get(0);
		for (int i = 0; i < ListJets.size(); i++) {
			Jet longestJetRange = ListJets.get(i);
			if (jetRange.getRange() < longestJetRange.getRange()) {
				jetRange = longestJetRange;
			}
		}
		System.out.println(jetRange);
		System.out.println("Is the plane with the longest range.");
		System.out.println();
	}

	public void addJets() {
		String jetType;
		String model;
		double speed;
		int range;
		long price;

		System.out.println("Which of the following would you like to add to the airfield?");
		System.out.print("Cargo, Fighter, Regular: ");
		jetType = kb.next();
		System.out.print("What model is the plane: ");
		model = kb.next();
		System.out.print("What is the speed of the plane in MPH: ");
		speed = kb.nextDouble();
		System.out.print("What is the range of the plane in miles: ");
		range = kb.nextInt();
		System.out.print("What is the price of the plane in dollars: ");
		price = kb.nextLong();
		System.out.println();

		if (model.contentEquals("Cargo") || model.contentEquals("cargo")) {
			this.ListJets.add(new CargoPlane(model, speed, range, price));
		}
		if (model.contentEquals("Fighter") || model.contentEquals("fighter")) {
			this.ListJets.add(new FighterJet(model, speed, range, price));
		}
		if (model.contentEquals("Regular") || model.contentEquals("regular")) {
			this.ListJets.add(new RegularJet(model, speed, range, price));

		}

	}

}

