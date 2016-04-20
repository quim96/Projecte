
public class Carta {

public Carta(String pers){

	personatje = pers;
}

public String getPersonatje(){ return personatje; }

public void accionar(Persona p){ //despres aixo sera overrride de una interface superior

	int x=(int) (Math.random()*3+1);
	
	if ( x==EntradaSortida.demanaNumRnd() ) {p.setMonedes(1); System.out.println(p.getNom()+": "+personatje+" agafa MONEDA."); }
	else {p.setMonedes(-1); System.out.println(p.getNom()+": "+personatje+" llença moneda."); }
}

private String personatje;

}


