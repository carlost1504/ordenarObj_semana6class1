package ui;

import java.util.Collections;

import javafx.print.Collation;
import model.PersonDANE;
import model.PersonalData;

public class Main {

	public static void main(String[] args) {
		
		PersonalData data=new PersonalData();
		data.addPersonas(new PersonDANE("andres", "andrade", 1000000, 12, 1));
		data.addPersonas(new PersonDANE("carlos", "Zapata", 1000000, 21, 1));
		data.addPersonas(new PersonDANE("juan", "andrade", 10005000, 16, 3));
		data.addPersonas(new PersonDANE("andres", "fef", 1000000, 22, 4));
		data.addPersonas(new PersonDANE("carlos", "andrade", 100000, 32, 4));
		data.addPersonas(new PersonDANE("danna", "andrade", 1000000, 19, 2));
		data.addPersonas(new PersonDANE("sofia", "andrade", 1000000, 20, 4));
		
		data.prinData();
		System.out.println("\n");
		Collections.sort(data.getPerson());
		data.prinData();
	}

}
