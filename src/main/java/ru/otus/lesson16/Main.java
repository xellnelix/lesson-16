package ru.otus.lesson16;

public class Main {
	public static void main(String[] args) {
		PhoneBook phoneBook = new PhoneBook();
		phoneBook.add("Test1", "11111111111");
		phoneBook.add("Test1", "00000000000");
		phoneBook.add("Test2", "22222222222");
		phoneBook.add("Test3", "33333333333");
		phoneBook.add("Test4", "4444444444");
		phoneBook.add("Test5", "55555555555");
		phoneBook.add("Test6", "66666666666");
		System.out.println(phoneBook.find("Test1"));
		System.out.println(phoneBook.containsPhoneNumber("89998887766"));
		System.out.println(phoneBook.containsPhoneNumber("66666666666"));
	}
}
