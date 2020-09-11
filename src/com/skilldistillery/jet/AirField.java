package com.skilldistillery.jet;

public class AirField {
private Jet[] jets;

public AirField(Jet[] jets) {
	this.jets = jets;
}

public void addJets(Jet jet) {
	for (int i = 0; i < jets.length; i++) {
		if (jets[i] == null) {
			jets[i] = jet;
			break;
		}
	}
}
}
