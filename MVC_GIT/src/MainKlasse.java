import java.util.List;

public class MainKlasse {
	
	private  Daten date ;
	private  List<String> meineListe;

	static Benutzer meinFenster ;
	
	MainKlasse(){
		date = new Daten();
		meinFenster = new Benutzer(date);
		meinFenster.setSize(400, 200);
	}
	
	public static void main(String[] args) {
		System.out.println("Hallo");
		System.out.println("Hallo 1. Versuch");
		System.out.println("Commit and pusch");
		MainKlasse meineKlasse  = new MainKlasse();
		meineKlasse.schleife();
		meinFenster.setVisible(true);
	}	
	
	public void schleife() {
		meineListe = date.getListe();
		for(int i= 0; i < meineListe.size(); i++) {
			System.out.println("" + i + meineListe.get(i));
		}
	}
}
