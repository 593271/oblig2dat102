package Klasser;


public class Datakontakt<T>  {

	private int antallMedlemmer;
	private Medlem[] medlemstabell;

	public Datakontakt(int start) {
		antallMedlemmer = 0;
		medlemstabell = new Medlem[start];
	}

	public void leggTilMedlem(Medlem person) {
		if (!inneholder(person)) {
			if (antallMedlemmer == medlemstabell.length) {
				utvidKapasitet();
			}
			medlemstabell[antallMedlemmer] = (person);
			antallMedlemmer++;
		}
	}
	
	

	public int getAntallMedlemmer() {
		return antallMedlemmer;
	}

	public void setAntallMedlemmer(int antallMedlemmer) {
		this.antallMedlemmer = antallMedlemmer;
	}

	public Medlem[] getMedlemstabell() {
		return medlemstabell;
	}

	public void setMedlemstabell(Medlem[] medlemstabell) {
		this.medlemstabell = medlemstabell;
	}

	private void utvidKapasitet() {
		T[] hjelpetabell = (T[]) (new Object[2 * medlemstabell.length]);
		for (int i = 0; i < medlemstabell.length; i++) {
			hjelpetabell[i] = (T) (medlemstabell[i]);
		}
		medlemstabell = (Medlem[]) hjelpetabell;
	}

	public boolean inneholder(Medlem person) {
		boolean funnet = false;
		for (int i = 0; (i < antallMedlemmer) && (!funnet); i++) {
			if (medlemstabell[i].equals(person)) {
				funnet = true;
			}
		}
		return (funnet);
	}

	public int finnMedlemsIndeks(String medlemsnavn) {
		boolean funnet = false;
		int indeks = -1;
		for (int i = 0; (i < antallMedlemmer) && (!funnet); i++) {
			if (medlemstabell[i].getNavn().equals(medlemsnavn)) {
				indeks = i;
				funnet = true;
			}

		}

		return indeks;

	}

	public int finnPartnerFor(String medlemsnavn) {
		boolean funnet = false;
		int indeks = -1;
		int medlemindeks = finnMedlemsIndeks(medlemsnavn);

		if (medlemstabell[medlemindeks].getStatusIndeks() != -1) {
			return indeks;
		}
		for (int i = 0; (i < antallMedlemmer) && (!funnet); i++) {

			if (medlemstabell[i].passerTil(medlemstabell[medlemindeks]) && medlemstabell[i].getStatusIndeks() == -1) {
				indeks = i;
				funnet = true;
			}

		}

		return indeks;

	}

	public boolean tilbakestillStatusIndeks(String medlemsnavn) {
		boolean tilbakestilt = false;

		if (finnMedlemsIndeks(medlemsnavn) == -1 || finnPartnerFor(medlemsnavn) == -1) {
			return tilbakestilt;
		}
		
		//setter medlemmet og dets partner statusIndeks = -1.
		int medlemIndeks = finnMedlemsIndeks(medlemsnavn);
		int partnerIndeks = medlemstabell[medlemIndeks].getStatusIndeks();
		medlemstabell[medlemIndeks].setStatusIndeks(-1);
		medlemstabell[partnerIndeks].setStatusIndeks(-1);
		tilbakestilt = true;

		return tilbakestilt;

	}

}
