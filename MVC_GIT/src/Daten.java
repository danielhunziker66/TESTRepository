import java.util.ArrayList;
import java.util.List;

public class Daten {
	
	private List<String> namenListe;
	
	Daten(){
		namenListe = new  ArrayList<String>();
		namenListe.add(" Daniel");
		namenListe.add(" Gabriella");
		namenListe.add(" Janik");
		namenListe.add(" Nicola");
	}
	
	
	public List<String> getListe() {
		return namenListe;
	}
	
	public void addInListe(String name) {
	
			namenListe.add(name);
		
	}

}
