package ru.otus.lesson16;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;

public class PhoneBook {
	private final Map<String, Set<String>> book = new HashMap<>();

	public void add(String key, String number) {
		if (number.length() != 11) {
			throw new RuntimeException();
		}
		if (!book.containsKey(key)) {
			book.put(key, new HashSet<>());
		}
		book.get(key).add(number);
	}

	public Set<String> find(String name) {
		return book.get(name);
	}

	public boolean containsPhoneNumber(String number) {
		for (Set<String> numSet : book.values()) {
			if (numSet.contains(number)) {
				return true;
			}
		}
		return false;
	}
}
