package org.Es1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		boolean stop = false;
		
//		List<String> regali = new ArrayList<>();
//		
//		while(!stop) {
//			System.out.print("Regalo da inserire: ");
//			String regalo = scan.nextLine();
//			regali.add(regalo);
//			
//			System.out.print("\nVuoi continuare? (s/n) ");
//			String risposta = scan.nextLine();
//			
//			stop = (risposta.equals("s")) ? false : true;
//		}
		
		Map<String, String> regali = new HashMap<>();
		
		while(!stop) {
			System.out.print("Il regalo è per? ");
			String dest = scan.nextLine();
			System.out.print("Regalo da inserire: ");
			String regalo = scan.nextLine();
			regali.put(dest, regalo);
			
			System.out.print("\nVuoi continuare? (s/n) ");
			String risposta = scan.nextLine();
			
			stop = (risposta.equals("s")) ? false : true;
			
			System.out.println("");
		}
		
		scan.close();
		
		System.out.println("\n------------\n");
		System.out.println("Lista regali");
		System.out.println(regali);
		
		for (String dest : regali.keySet()) {
			String regalo = regali.get(dest);
			System.out.println(dest + " = " + regalo);
		}
	}
}
