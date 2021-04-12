package com.nitcvivek.equalhashcode;

import java.util.HashMap;
import java.util.Map;

public class LinkedHashMapEqualChallenge 
{
	public static void main(String[] args) 
	{	
		Map<User,String> userMap = new HashMap<User,String>();
		
		userMap.put(new User("Ravi"), "1");
		userMap.put(new User("Ray"), "2");
		userMap.put(new User("Vivek"), "3");
		userMap.put(new User("Samy"), "4");
		userMap.put(new User("Nitin"), "5");
		
		userMap.forEach((k,v)-> System.out.println(v));

	}
	static class User
	{
		String name;
		
		User(String name)
		{
			this.name=name;
		}
		public boolean equals(Object obj)
		{
			return ((User)obj).name.length() == this.name.length();
		}
		public int hashCode()
		{
			return 4000 << 2*2000/10000;
		}
	}

}
