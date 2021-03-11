package Klient;

import java.util.Scanner;

import Klasser.*;
import Oving5.DobbelKjedetListeS;
import no.hvl.dat102.mengde.kjedet.KjedetMengde;
import no.hvl.dat102.mengde.tabell.TabellMengde;

public class MedlemKlient {

	public static void main(String[] args) {
		System.out.println("Tast inn nummeret til handling du har lyst til å gjøre");
		System.out.println("\n1. Lag et Medlem" + "\n2. Vis info om medlem" + "\n3. Legg Til hobby i et medlem"
				+ "\n4. PasserTil metode" +  "\n5. slett hobbyer i det ene medlemmet (for å sjekke passertil metode) " + "\n0 lukk klient" );
		
		KjedetMengde<Hobby> Liste = new KjedetMengde<Hobby>();
		Medlem medlem = new Medlem("medlem1");
		Medlem medlem2 = new Medlem("medlem2");


		Scanner scan = new Scanner(System.in);

		int handling = scan.nextInt();

		while (handling != 0) {

			if (handling == 1) {

				System.out.println("Skriv inn navnet på medlem 1");

				String navn = scan.next();

				medlem.setNavn(navn);

				System.out.println("Medlem " + navn + " ble lagd! \n");
				
				System.out.println("Skriv inn navnet på medlem 2\n");
				
				navn = scan.next();

				medlem2.setNavn(navn);
				
				System.out.println("Medlem " + navn + " ble lagd! \n");


				System.out.println("Hva vil du gjøre nå?");

				System.out.println("\n1. Lag et Medlem" + "\n2. Vis info om medlem" + "\n3. Legg Til hobby i et medlem"
						+ "\n4. PasserTil metode" +  "\n5. slett hobbyer i det ene medlemmet (for å sjekke passertil metode) " + "\n0 lukk klient" );
				handling = scan.nextInt();

			} else if (handling == 2) {

				System.out.println("Skriv inn navnet på et Medlem du vil ha info om");

				String info = scan.next();
				
				medlem.skrivUtData();
				
				

				System.out.println("Hva vil du gjøre nå?");
				System.out.println("\n1. Lag et Medlem" + "\n2. Vis info om medlem" + "\n3. Legg Til hobby i et medlem"
						+ "\n4. PasserTil metode" +  "\n5. slett hobbyer i det ene medlemmet (for å sjekke passertil metode) " + "\n0 lukk klient" );
				handling = scan.nextInt();

			} else if (handling == 3) {

				System.out.println("Skriv inn hvilken hobby du vil legge til i medlemmene");
				String hobby = scan.next();
				Hobby noe = new Hobby(hobby);
				Liste.leggTil(noe);
				
				System.out.println("La til hobby i medlem og medlem 2\n");
				
				medlem.setHobbyer(Liste);
				medlem2.setHobbyer(Liste);
				System.out.println("Hva vil du gjøre nå?");
				System.out.println("\n1. Lag et Medlem" + "\n2. Vis info om medlem" + "\n3. Legg Til hobby i et medlem"
						+ "\n4. PasserTil metode" +  "\n5. slett hobbyer i det ene medlemmet (for å sjekke passertil metode) " + "\n0 lukk klient" );
				handling = scan.nextInt();

			} else if (handling == 4) {

				System.out.println("Skriv inn om " +  medlem.getNavn() +  " passer til " + medlem2.getNavn() + "\n");
				
				
				
				
				System.out.println("La til hobby i medlem\n");
				
				medlem.passerTil(medlem2);
				System.out.println("Hva vil du gjøre nå?");
				System.out.println("\n1. Lag et Medlem" + "\n2. Vis info om medlem" + "\n3. Legg Til hobby i et medlem"
						+ "\n4. PasserTil metode" +  "\n5. slett hobbyer i det ene medlemmet (for å sjekke passertil metode) " + "\n0 lukk klient" );
				handling = scan.nextInt();

			} else if (handling == 5) {

				
				System.out.println("slettet hobbyer i medlem 2");
				
				medlem2.setHobbyer(null);
				
				System.out.println("Hva vil du gjøre nå?");
				System.out.println("\n1. Lag et Medlem" + "\n2. Vis info om medlem" + "\n3. Legg Til hobby i et medlem"
						+ "\n4. PasserTil metode" +  "\n5. slett hobbyer i det ene medlemmet (for å sjekke passertil metode) " + "\n0 lukk klient" );
				handling = scan.nextInt();

			}
			
			

		}

		System.out.println("Program slukket");



	}
}
