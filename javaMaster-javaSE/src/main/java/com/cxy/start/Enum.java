package com.cxy.start;

public class Enum {
	public enum Animal{
		DOG,CAT,PIG
	}
	
	public static void main(String[] args) {
		Animal a=Animal.CAT;
		System.out.println(a);
		
		for (Animal animal : Animal.values()) {
			System.out.println(animal+" order "+animal.ordinal()+":"+animal.values());
		}
	}
}
