package com.fuzailshaikh;

import java.util.Optional;

public class OptionalExample {

	public static void main(String[] args) {

		Optional<Integer> a = Optional.ofNullable(null);
		Optional<Integer> b = Optional.ofNullable(5);

		boolean isValuePresent = a.isPresent();

		// Get value or default value
		Integer value = a.orElse(0);

		// Gets the value, value should be present
		Integer value2 = b.get();

		System.out.println(value);
		System.out.println(value2);
	}

}
