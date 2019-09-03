package com.Javapractice;

public class OOPSTest {
	public static void studentRank(int marks) {
		if (marks >= 600) {
			System.out.println("Rank is A !");
			
		} else if (marks >= 500) {
			System.out.println("Rank is B !");
		} else {
			System.out.println("Rank is C !");
		}
	}

	public static void main(String[] args) {
		studentRank(1000);
	}

}
