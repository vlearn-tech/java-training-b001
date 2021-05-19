package com.tech.javabasics.step20abstraction;

public interface Playable {

	default void playsAround() {
		System.out.println("playing since its so playable");
	}

}
