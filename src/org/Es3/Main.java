package org.Es3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Quanti numeri vuoi inserire? ");
		int numInt = scan.nextInt();
		
		int[] interi = new int[numInt];
		for (int i = 0; i < numInt; i++) {
			System.out.print("Inserisci numero: ");
			interi[i] = scan.nextInt();
		}
		
		scan.close();
		
		Interi n = new Interi(interi, numInt);
				
		while(n.hasAncoraElementi()) {
			System.out.println(n.getElementoSuccessivo());
		}
	}
}
