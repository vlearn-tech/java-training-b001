package com.tech.javabasics.step16collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupingObjectsUsingMaps {

	private static List<Dog> myPets = new ArrayList<>();

	public static void main(String[] args) {

		myPets.add(new Dog("Bru", "Black"));
		myPets.add(new Dog("Tiger", "Brown"));
		myPets.add(new Dog("SpookySpider", "White"));
		myPets.add(new Dog("DusterBoy", "Shaded"));
		myPets.add(new Dog("Scooby", "Brown"));
		myPets.add(new Dog("Silk", "White"));
		myPets.add(new Dog("DirtyDover", "Brown"));
		myPets.add(new Dog("DarkyBlacky", "Black"));
//		myPets.add(new Dog("SpookySpider", "Grey"));

//		showPets();

		// Group by dogs by name, so that I can search for a pet by its name
		Map<String, Dog> myPetMap = new HashMap<>();
		for (Dog d : myPets) {
			myPetMap.put(d.name, d);
		}

//		System.out.println(myPetMap);

		Dog ss = null;
		for (Dog d : myPets) {
			if ("SpookySpider".equals(d.name)) {
				ss = d;
				break;
			}
		}

		System.out.println("Search result using List : " + ss);

		System.out.println("Search result using Map : " + myPetMap.get("SpookySpider"));

		// Looping through a map

		System.out.println("======== K E Y     V A L U E     P A I R S =============");
		myPetMap.forEach((k, v) -> {
			System.out.println(k + " = { " + v + "}");
		});

		System.out.println("======== K E Y S =============");
		for (String name : myPetMap.keySet()) {
			System.out.println(name);
		}

		System.out.println("======== V A L U E S =============");
		for (Dog dog : myPetMap.values()) {
			System.out.println(dog);
		}

		// Check if a particular key is present
		Boolean isPresent = myPetMap.containsKey("Silky");
		System.out.println(isPresent);

		System.out.println("=========== D O G S    B Y     C O L O R =============");

		// Group the pets by color, so that I can find all dogs of a specific color at once
		Map<String, List<Dog>> dogsGroupedByColor = new HashMap<>();

		for (Dog d : myPets) {
			// If already there is an entry for the same color, just add the dog into the existing list
			if (dogsGroupedByColor.containsKey(d.color)) {
				dogsGroupedByColor.get(d.color).add(d);

			} else {
				// If there is no entry for this color, then create a new list, add the dog into this and then
				// proceed
				List<Dog> dogs = new ArrayList<>();
				dogs.add(d);
				dogsGroupedByColor.put(d.color, dogs);
			}
		}

		System.out.println(dogsGroupedByColor);

		// How many brown dogs in my pet shop/list
		System.out.println("Number of brown dogs = " + dogsGroupedByColor.get("Brown").size());

		// Names of the Black Pets

		System.out.println("======= B L A C K   D O G S ==============");
		for (Dog d : dogsGroupedByColor.get("Black")) {
			System.out.println(d.name);
		}
	}

	private static void showPets() {
		myPets.forEach(d -> {
			System.out.println(d);
		});
	}
}
