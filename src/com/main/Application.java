package com.main;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		int n;
		int total = 0;
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.print("Sayi Giriniz: ");
			n = scan.nextInt();
			if(n % 4 == 0) {
				total += n;
			}
		}while(n > 0 && !(n%2==1));
		
		System.out.println("Toplam: " + total);

	}

}
