package Klasser;

public class Hobby {
	
	private String hobbyNavn;
	
	public Hobby(String hobby){
		
	hobbyNavn = hobby;
	
	} 
	
	public String getHobbyNavn() {
		return hobbyNavn;
	}

	public void setHobbyNavn(String hobbyNavn) {
		this.hobbyNavn = hobbyNavn;
	}

	public String toString(){
		
		return "<" + hobbyNavn + ">";
		
		
	//� returnerer hobbynavnet med �<� foran og �>� bak som
	// String (Eksempel: <tegne, male>)
	// Bmrk: Kan ogs� ha uten parenteser, men fors�k med
	//parenteser.
		
	}
	
	
	public boolean equals(Object hobby2){
	 // evntuelt fylle ut f�rst med "standard" kode
	// som vi ofte har med overkj�ring av
	// equals-metoden
		
	Hobby hobbyDenAndre = (Hobby)hobby2;
	return(hobbyNavn.equals(hobbyDenAndre.getHobbyNavn()));
	}


}
