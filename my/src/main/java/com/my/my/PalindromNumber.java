package com.my.my;

public class PalindromNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 121;
		int tmp=a;
		int rev = 0;
		while (a != 0) {

			int rim = a % 10;
			rev = rev * 10 + rim;
			a = a / 10;
		}

		if (rev==tmp) {
			System.out.println(tmp+ "palindrom");

		} else {
			System.out.println(tmp + "not palindrom");
		}
	}

}
