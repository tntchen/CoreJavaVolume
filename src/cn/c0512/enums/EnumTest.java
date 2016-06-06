package cn.c0512.enums;

import java.util.Scanner;

public class EnumTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a size:(SMALL,MEDIUM,LARGE,EXTRA_LARGE)");
		String input = sc.next().toUpperCase();
		Size size = Enum.valueOf(Size.class, input);
		System.out.println("size="+size);
		System.out.println("abbreviation="+size.getAbbreviation());
		if (size == Size.EXTRA_LARGE) {
			System.out.println("Good job--you paid attention to the _.");
		}
	}
}
