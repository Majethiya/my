package com.my.my;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 123;
		int rev = 0;
		while (a != 0) {

			int rim = a % 10;
			rev = rev * 10 + rim;
			a = a / 10;
		}
		System.out.println(rev);
	}

}
