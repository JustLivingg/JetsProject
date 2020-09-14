package com.skilldistillery.jet;

public interface CargoCarrier {
	public default void loadCargo() {
		System.out.println("Loaded 1 cargo plane." );
	}
}
