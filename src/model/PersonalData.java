package model;

import java.util.ArrayList;
import java.util.Arrays;

public class PersonalData {

	private ArrayList<PersonDANE>person;
	
	public PersonalData() {
		person=new ArrayList<PersonDANE>();
		
	}
	
	public void addPersonas(PersonDANE personas) {
		person.add(personas);
	}
	
	public void prinData( ) {
		for(PersonDANE persons:person) {
			System.out.println(persons.toString());
		}
	}

	public ArrayList<PersonDANE> getPerson() {
		return person;
	}

	public void setPerson(ArrayList<PersonDANE> person) {
		this.person = person;
	}
	
}
