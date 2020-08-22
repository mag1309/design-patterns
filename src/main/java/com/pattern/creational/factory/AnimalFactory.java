package com.pattern.creational.factory;

public class AnimalFactory {
	
    public Animal getAnimal(String type) {

    	switch(type)
    	{
    		case "dog" 	: 	return new Dog();
    	
    		case "cat" 	: 	return new Cat();
    	
    		default 	:	return null;
    	}
    }
}