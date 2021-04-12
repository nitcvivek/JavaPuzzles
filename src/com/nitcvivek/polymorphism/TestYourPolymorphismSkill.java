package com.nitcvivek.polymorphism;

public class TestYourPolymorphismSkill 
{

	public static void main(String[] args) 
	{
		Rafael rafael = new Tejas();
		
		System.out.println(rafael.name + rafael.getName());
		System.out.println(rafael.getManufacturer());
	}
	
	static class Rafael{
		String name = "Rafael";
		
		static String getManufacturer() {
			return "Dassault";
		}
		
		String getName() {
			return this.name;
		}
	}
	
	static class Tejas extends Rafael{
		String name = "Tejas";
		
		static String getManufacturer() {
			return "HAL";
		}
		
		String getName() {
			return this.name;
		}
	}
}
