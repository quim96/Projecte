import java.io.IOException;

public class Partida {
	
	Partida() throws IOException{
		
		nJugadors = EntradaSortida.demanarNumJugs();
		
		taul=new Tauler();
		
		jugs = new Persona[nJugadors];
		for( int i=0; i<nJugadors; i++) jugs[i] = new Persona( EntradaSortida.demanarNomJug(i),taul.agafarCarta() );
		
		
		
	}
	

	void jugarPartida() throws IOException{
		
		int tornJug=0;
		while(guanyador()==-1){
			
			tornJug++;
			if(tornJug==nJugadors)tornJug=0;
			
			EntradaSortida.torn(jugs[tornJug].getNom());
			jugs[tornJug].ferTorn(taul);
		}
		Persona winner= jugs[guanyador()];
		
		 System.out.println("\nEl guanyador es: "+winner.getNom()+" amb "+winner.getMonedes()+" monedes.");
		
	}
	
	private int guanyador(){
		
		int i=0,maxMon=6;
		while(i<nJugadors && jugs[i].getMonedes()>0 && jugs[i].getMonedes()<maxMon) i++;
		
		if(i==nJugadors) return -1;
		else if(jugs[i].getMonedes()==maxMon) return i;
		else{
			
			int winner=0;
			
			for(int j=0; j<nJugadors; j++) if(jugs[j].getMonedes()>jugs[winner].getMonedes()) winner=j;
			
			return winner;	
		}
	}
	
	void classificacio(){
		
		for( int i=0; i<nJugadors; i++) System.out.println(jugs[i].getCarta(0).getPersonatje()+": "+jugs[i].getMonedes());
	}

	private int nJugadors;
	private Tauler taul;
	
	private Persona[] jugs;
}



