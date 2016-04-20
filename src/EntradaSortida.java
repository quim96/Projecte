import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

@SuppressWarnings("unused")
public class EntradaSortida {

	public static int demanarNumJugs() throws IOException {
		
		System.out.println("Introdueix el numero de jugadors: ");
		tec = new Scanner(System.in);
		
		return tec.nextInt();
	}
	
	public static String demanarNomJug(int jugN){
		
		tec = new Scanner(System.in);
		
		System.out.print("Nom Jugador "+jugN+": ");
		
		return tec.nextLine();
	}
	
	public static int demanaNumRnd(){ 
		
		System.out.print("Entra numero entre 1 i 3: ");
		tec = new Scanner(System.in);
		
		return tec.nextInt();
	}
	
	public static void torn(String nom){System.out.println("\nTorn de "+nom+"\n--------------------------------");}

	@SuppressWarnings("serial")
	public ArrayDeque<String> demanarCartes() throws IOException {
		ArrayDeque<String>cartes=new ArrayDeque<String>() {
		};
		System.out.println("Introdueix Nom cartes finalitzat per 0:");
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
	 	String s = br.readLine();
	 	while(!s.equals("0")){
	 		cartes.push(s);
	 		s = br.readLine();
	 	}
		return cartes;
	}
	
	private static Scanner tec;
}


