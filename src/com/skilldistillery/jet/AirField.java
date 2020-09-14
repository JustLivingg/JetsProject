package com.skilldistillery.jet;

import java.util.Scanner;

public class AirField {
	static Scanner kb = new Scanner(System.in);
	private Jet[] jets;

	public AirField(Jet[] jets) {
		this.jets = jets;
	}

	public void addJetArray(Jet jetting) {
		for (int i = 0; i < jets.length; i++) {
			if (jets[i] == null) {
				jets[i] = jetting;
				break;
			}
		}
	}


}


