package com.skilldistillery.jet;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JetsFileReader {

	public static void main(String[] args) {
		List<Jet> jet = new ArrayList<>();

		try (BufferedReader bufIn = new BufferedReader(new FileReader("jets.txt"))) {
			String line;
			while ((line = bufIn.readLine()) != null) {
				String[] fields = line.split(", ");
				Jet jet2 = new Jet(fields[0],Double.parseDouble(fields[1]),Integer.parseInt(fields[2]),Long.parseLong(fields[3]));
				
				jet.add(jet2);
			}

		} catch (IOException e) {
			System.err.println(e);
		}
		System.out.println(jet);

	}
}
