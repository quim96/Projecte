import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;

public class Tauler {

public Tauler() throws IOException{

//metode o algo per preguntar quines cartes no es volen.

mazo = new ArrayDeque<Carta>();

mazo.push(new Carta("Rei"));
mazo.push(new Carta("Bruixa"));
mazo.push(new Carta("Bisbe"));
mazo.push(new Carta("Llop"));
mazo.push(new Carta("Mussol"));
mazo.push(new Carta("Drac"));
mazo.push(new Carta("Estrella"));
mazo.push(new Carta("Lladre"));
mazo.push(new Carta("Ninja"));


}

public Carta agafarCarta(){ return mazo.pop(); }

private Deque<Carta> mazo;

ArrayDeque<Carta> cartesExcloses;

}









