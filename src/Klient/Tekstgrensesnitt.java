package Klient;

import Klasser.*;
import no.hvl.dat102.mengde.kjedet.KjedetMengde;

public class Tekstgrensesnitt {

	public static void main(String[] args) {

		Datakontakt data = new Datakontakt(8);
		Medlem Pham = new Medlem("Pham");
		Medlem Sofie = new Medlem("Sofie");
		Medlem Bob = new Medlem("Bob");
		Medlem Ole = new Medlem("Ole");
		Medlem Harald = new Medlem("Harald");
		Medlem Karl = new Medlem("Karl");
		Medlem Knut = new Medlem("Knut");
		Medlem Markus = new Medlem("Markus");

		Hobby gaming = new Hobby("Gaming");
		Hobby Tegning = new Hobby("Tegning");
		Hobby Tennis = new Hobby("Tennis");
		Hobby Fotball = new Hobby("Fotball");
		Hobby Jogging = new Hobby("Jogging");
		Hobby StyrkeTrening = new Hobby("StyrkeTrening");
		Hobby Volleyball = new Hobby("Volleyball");
		Hobby Svomming = new Hobby("Svomming");


		KjedetMengde<Hobby> Liste1 = new KjedetMengde<Hobby>();
		Liste1.leggTil(gaming);
		Liste1.leggTil(Tegning);
		Liste1.leggTil(Tennis);
		
		KjedetMengde<Hobby> Liste2 = new KjedetMengde<Hobby>();
		Liste1.leggTil(Fotball);
		Liste1.leggTil(Jogging);
		Liste1.leggTil(StyrkeTrening);

		KjedetMengde<Hobby> Liste3 = new KjedetMengde<Hobby>();
		Liste1.leggTil(StyrkeTrening);
		Liste1.leggTil(Volleyball);
		Liste1.leggTil(Svomming);
		
		KjedetMengde<Hobby> Liste4 = new KjedetMengde<Hobby>();
		Liste1.leggTil(gaming);


		Pham.setHobbyer(Liste4);
		Sofie.setHobbyer(Liste1);
		Bob.setHobbyer(Liste1);
		Ole.setHobbyer(Liste2);
		Harald.setHobbyer(Liste2);
		Karl.setHobbyer(Liste3);
		Knut.setHobbyer(Liste3);
		Markus.setHobbyer(Liste1);

		data.leggTilMedlem(Pham);
		data.leggTilMedlem(Sofie);
		data.leggTilMedlem(Bob);
		data.leggTilMedlem(Ole);
		data.leggTilMedlem(Harald);
		data.leggTilMedlem(Karl);
		data.leggTilMedlem(Knut);
		data.leggTilMedlem(Markus);


	}

	public static Medlem lesMedlem() {

		System.out.println();

		return null;

	}

	public static void skrivHobbyListe(Medlem medlem) {
		System.out.println("Alle hobbyene ");
		System.out.println(medlem.getHobbyer().toString());

	}

	public static void skrivParListe(Datakontakt arkiv) {

		Medlem[] tabell = new Medlem[arkiv.getAntallMedlemmer()];

		Medlem[] parTabell = new Medlem[arkiv.getAntallMedlemmer()];

		tabell = arkiv.getMedlemstabell();

		System.out.println("PARNAVN  " + "\t" + "HOBBYER");

		for (int i = 0; i < tabell.length; i++) {
			
			
			
			
//					if( arkiv.finnPartnerFor(tabell[i].getNavn()) != -1) {
//						
//						
//						System.out.println(tabell[i].getNavn() + tabell[tabell[i].getStatusIndeks()].getNavn());
//						System.out.println(tabell[i].getHobbyer() + tabell[tabell[i].getStatusIndeks()].getHobbyer());
//						
//						
//					}

		}

	}

	


	

}
