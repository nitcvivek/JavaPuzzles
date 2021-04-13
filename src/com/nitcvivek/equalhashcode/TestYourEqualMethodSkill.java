package com.nitcvivek.equalhashcode;

import java.util.HashSet;
import java.util.Set;

public class TestYourEqualMethodSkill 
{
	private final String firstName, lastName;	
	
	public TestYourEqualMethodSkill(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public boolean equals(TestYourEqualMethodSkill n) {
		return n.firstName.equals(firstName) && n.lastName.equals(lastName);
	}
	
	public int hashCode() {
		return 31* firstName.hashCode() + lastName.hashCode();
	}

	public static void main(String[] arg ) 
	{
		Set<TestYourEqualMethodSkill> s = new HashSet<TestYourEqualMethodSkill>();
		s.add(new TestYourEqualMethodSkill("Neil", "Johnson"));
		
		System.out.println(s.contains(new TestYourEqualMethodSkill("Neil","Johnson")));
	}
}
