package week1.day2Assignments;

import java.util.Iterator;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int fact = 1;
		for (int i = 1; i <=n; i++) {
		fact = fact * i;
			
		}
		System.out.println("The Factorial Value of 5 is " + fact);
	}

}
