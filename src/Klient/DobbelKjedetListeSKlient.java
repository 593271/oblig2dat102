package Klient;

import java.util.Scanner;

import Oving5.DobbelKjedetListeS;

public class DobbelKjedetListeSKlient {

	public static void main(String[] args) {
		System.out.println("Tast inn nummeret til handling du har lyst til å gjøre");
		System.out.println("1. Legg til Tall i DobbelKjedetListe" + "\n2. Vis listen på skjerm"
				+ "\n3. Fjern et tall i listen" + "\n4. sjekk om et tall finnes i listen" + "\n0 lukk klient");
		
		DobbelKjedetListeS<Integer> dobbel = new DobbelKjedetListeS<Integer>(1, 1000);

		Scanner scan = new Scanner(System.in);
		
		int handling = scan.nextInt();

		while (handling != 0) {
			
			if(handling == 1) {
				System.out.println("\nSkriv inn et tall mellom 1-1000 som skal legges til i listen");
			
			int nummer = scan.nextInt();
			
			dobbel.leggTil(nummer);
			System.out.println("\nHer er listen; \n");

			dobbel.skrivListe();
			System.out.println("Hva vil du gjøre nå?");
			System.out.println("1. Legg til Tall i DobbelKjedetListe" + "\n2. Vis listen på skjerm"
					+ "\n3. Fjern et tall i listen" + "\n4. sjekk om et tall finnes i listen" + "\n0 lukk klient");
			handling = scan.nextInt();
			
			} else if (handling == 2) {
				
				
				
				dobbel.skrivListe();
				System.out.println("Hva vil du gjøre nå?");
				System.out.println("1. Legg til Tall i DobbelKjedetListe" + "\n2. Vis listen på skjerm"
						+ "\n3. Fjern et tall i listen" + "\n4. sjekk om et tall finnes i listen" + "\n0 lukk klient");
				handling = scan.nextInt();

			} else if (handling == 3) {
				
				System.out.println("Skriv inn nummeret du vil fjerne ifra listen");
				int nummer = scan.nextInt();
				
				
				
				

				dobbel.fjern(nummer);
				dobbel.skrivListe();
				System.out.println("Hva vil du gjøre nå?");
				System.out.println("1. Legg til Tall i DobbelKjedetListe" + "\n2. Vis listen på skjerm"
						+ "\n3. Fjern et tall i listen" + "\n4. sjekk om et tall finnes i listen" + "\n0 lukk klient");
				handling = scan.nextInt();
				
			} else if (handling == 4) {
				
				
				System.out.println("skriv inn nummeret du vil sjekke om finnes i listen");
				int nummer = scan.nextInt();
				
				
				System.out.println(dobbel.fins(nummer));
				
				System.out.println("Hva vil du gjøre nå?");
				System.out.println("1. Legg til Tall i DobbelKjedetListe" + "\n2. Vis listen på skjerm"
						+ "\n3. Fjern et tall i listen" + "\n4. sjekk om et tall finnes i listen" + "\n0 lukk klient");
				handling = scan.nextInt();
				
			}
			
			
			
			
			
		}
			
		System.out.println("Program slukket");
		
		
		
		
		
	}

}
