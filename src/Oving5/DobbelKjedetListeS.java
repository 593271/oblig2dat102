package Oving5;

public class DobbelKjedetListeS<T extends Comparable<T>> {

	private DobbelNode<T> foerste;
	private DobbelNode<T> siste;
	private int antall;

	public DobbelKjedetListeS(T minVerdi, T maksVerdi) {

		DobbelNode<T> nyNode1 = new DobbelNode<T>(minVerdi);
		foerste = nyNode1;

		DobbelNode<T> nyNode2 = new DobbelNode<T>();
		nyNode2.setElement(maksVerdi);
		nyNode1.setNeste(nyNode2);
		nyNode2.setForrige(nyNode1);
		siste = nyNode2;

		antall = 0;

		/*
		 * Konstruktøren må lage strukturen som vist i figuren.
		 */
	}

	public boolean fins(T x) {

		boolean funnet = false;
		DobbelNode<T> aktuell = foerste.getNeste();

		if ((x.compareTo(foerste.getElement()) <= 0) || (x.compareTo(siste.getElement()) >= 0)) {
			// Ugyldig. Alternativt kan vi ha det som et forkrav!
			System.out.println("Ugyldig verdi. verdi > " + foerste.getElement() + "verdi < " + siste.getElement());

		} else { // Kun lovlige verdier

			while (x.compareTo(aktuell.getElement()) > 0) {
				aktuell = aktuell.getNeste();
			} // while

			// Test på funnet
			if (x.compareTo(aktuell.getElement()) == 0) {
				funnet = true;
			}

		} // else

		return funnet;

	}

	public void leggTil(T ny) {

		DobbelNode<T> nyNode = new DobbelNode<T>(ny);

		DobbelNode<T> aktuell = foerste.getNeste();

		while (ny.compareTo(aktuell.getElement()) > 0) {
			aktuell = aktuell.getNeste();
		}
		nyNode.setNeste(aktuell);
		nyNode.setForrige(aktuell.getForrige());
		aktuell.getForrige().setNeste(nyNode);
		aktuell.setForrige(nyNode);
		antall++;

	}

	public void skrivListe() {
		DobbelNode<T> p = foerste;

		while (p != null) {
			System.out.print(p.getElement() + " ");
			p = p.getNeste();
		}

		System.out.println("Foerste:" + foerste.getElement() + " Siste:" + siste.getElement());
		System.out.println();

	}//

	public T fjern(T element) {
		DobbelNode<T> current = foerste;

		T slettet = null;

		if (foerste == null) {
			System.out.println("Tomt");
		}

		else if (foerste.getElement().equals(element)) {
			slettet = foerste.getElement();
			foerste = foerste.getNeste();
			foerste.getNeste().setForrige(null);
			antall--;
			return slettet;
		}

		while (current.getNeste() != null) {

			if (current.getNeste().getElement() == element && current.getNeste().getNeste() != null) {
				slettet = current.getNeste().getElement();
				current = current.getNeste();
				current.setElement(null);
				current = current.getForrige();
				current.setNeste(current.getNeste().getNeste());
				current = current.getNeste();
				current.setForrige(current.getForrige().getForrige());
				antall--;
				return slettet;
			}

			if (current.getNeste().getElement() == element && current.getNeste().getNeste() == null) {
				slettet = current.getNeste().getElement();
				current = current.getNeste();
				current.setElement(null);
				current = current.getForrige();
				current.setNeste(null);
				antall--;
				return slettet;

			} else if (current.getNeste() != null)
				current = current.getNeste();

		}

		return slettet;
	}

}
