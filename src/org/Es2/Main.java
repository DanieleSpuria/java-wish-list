package org.Es2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
			Scanner scan = new Scanner(System.in);
			
			System.out.print("Inserisci una parola: ");
			String parola = scan.nextLine();
			
			Map<Character, Integer> counter = new HashMap<>();
			
			for (int i = 0; i < parola.length(); i++) {
				char lettera = parola.charAt(i);
				
				if (counter.containsKey(lettera)) 
					counter.put(lettera, counter.get(lettera) + 1);
				else 
					counter.put(lettera, 1);
			}
			
			System.out.println("");
			for (Character c : counter.keySet()) 
				System.out.println(c + " = " + counter.get(c));
	}
}
