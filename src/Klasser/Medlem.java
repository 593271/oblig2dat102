package Klasser;


import no.hvl.dat102.mengde.adt.MengdeADT;
import no.hvl.dat102.mengde.kjedet.KjedetMengde;

public class Medlem {

	private String navn;
	private MengdeADT<Hobby> hobbyer;
	private int statusIndeks;
	

	public Medlem(String medlemNavn) {
		navn = medlemNavn;
		statusIndeks = -1;
		hobbyer = new KjedetMengde<Hobby>();

	}



	public String getNavn() {
		return navn;
	}

	public void setNavn(String navn) {
		this.navn = navn;
	}

	public MengdeADT<Hobby> getHobbyer() {
		return hobbyer;
	}

	public void setHobbyer(MengdeADT<Hobby> hobbyer) {
		this.hobbyer = hobbyer;
	}

	public int getStatusIndeks() {
		return statusIndeks;
	}

	public void setStatusIndeks(int statusIndeks) {
		this.statusIndeks = statusIndeks;
	}

	public boolean passerTil(Medlem medlem2) {
		boolean passer = false;
		
		if (this.getHobbyer().equals(medlem2.getHobbyer())) {
			passer = true;
			System.out.println("De passer til hverandre");
			//this.setStatusIndeks(Datakontakt.finnMedlemsIndeks(medlem2));
		} else {
			System.out.println("De passer ikke til hverandre");
		}
		
		

		return passer;

	}

	public void skrivUtData() {

		System.out.println(this.navn);
		System.out.println(this.hobbyer);
		System.out.println(this.statusIndeks);

	}
	




}
