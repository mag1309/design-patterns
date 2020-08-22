package com.pattern.creational.factory;

public class FactoryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnimalFactory factory = new AnimalFactory();
		Animal dog  =  factory.getAnimal("dog");
		System.out.println("Object Received :" + dog.getDetails());
		
		Animal cat  =  factory.getAnimal("cat");
		System.out.println("Object Received :" + cat.getDetails());
	}

}
