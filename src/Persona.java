
public class Persona {


	Persona (String nom, Carta c){
		this.nom=nom;
		monedes=3;
		
		cartes = new Carta[1];
		cartes[0] = c;
		//this.nCartes=cartes.length; //encara no
	}


	void ferTorn(Tauler tau) {cartes[0].accionar(this);}
	
	void setMonedes(int n) {monedes+=n;}
	
	int getMonedes() {return monedes;}
	
	String getNom() {return nom;}
	
	Carta getCarta(int nCarta){return cartes[nCarta];}
	
	private String nom;
	private int monedes;
	private Carta [] cartes;

}


