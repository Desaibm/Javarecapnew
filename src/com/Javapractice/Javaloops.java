package com.Javapractice;

public class Javaloops {

	public static void main(String[] args) {

		char grade = 'B';
		
		switch (grade) {
		case 'A':
			System.out.println("Execelent");
			break;
		case 'B':
			System.out.println("Well Done");
			break;
		case 'C':
			System.out.println("Better");
			break;

		default:
			System.out.println("Invalid Grade!");
			break;
		}
		
		for (int i = 1; i <= 10; i++) {
			
			if ((i != 7) && (i != 4)){
				System.out.println(i);
			}
		}
		
		int i = 10;
		while (i <= 100) {
			System.out.println(i);
			i +=10;
		}
		
		int s = 1;
		do {
			System.out.println(s);
			s++;
		} while (s <= 10);
		
		
		String [] arr = {"Aaaple", "Ball", "Food", "Jam"};
		for (String value : arr) {
			System.out.println(value);
		}
		
		int [] math = new int[3];
		int a = 10, b = 20;
		math[0] = a + b;
		math[1] = a - b;
		math[2] = a * b;
		for (int h : math) {
			System.out.println(h);
			
		}
	}
}