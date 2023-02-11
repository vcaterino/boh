package canile;
import java.util.*;
public class Main {
	 static Scanner sc = new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Clienti clienti = creaClienti();
		Canile canile = creaCani();
		 System.out.println("L'eta media di tutti i cani è:");
		 canile.etaMedia();
		  System.out.println("inserisci la posizione persona dell array");
	        int v=sc.nextInt();
	        Persona p=clienti.getPersona(v);
	        System.out.println("quanti cani vuoi comprare?");
	        int ncani=sc.nextInt();
	        int np;
	        Ordine ordine=new Ordine(p,ncani);
	        for(int i=0; i<ncani; i++){
	            System.out.println("inserisci la posizione del cane dell array");
	            np=sc.nextInt();
	            Cane c=canile.getCani(np);
	            ordine.addCani(c,i);
	        }
	        System.out.println("costo da pagare:"+ordine.costoOrdine());


	}
	
	public static Canile creaCani() {
		System.out.println("Quanti cani vuoi inserire?");
		int nC = sc.nextInt();
		Canile canile = new Canile(nC);
		for (int i=0; i<nC; i++) {
			System.out.println("inserisci nome del cane");
			String n = sc.nextLine();
			System.out.println("inserisci la razza del cane");
			String r = sc.nextLine();
			System.out.println("inserisci l'eta del cane");
			int e = sc.nextInt();
			System.out.println("inserisci il prezzo del cane");
			float p = sc.nextFloat();
			Cane cane = new Cane(n,r,e,p);
			canile.Addcane(cane,i);
		}
		return canile;
	}
	
	public static Clienti creaClienti() {
		System.out.println("Quanti clienti vuoi inserire?");
		int nP = sc.nextInt();
		Clienti clienti = new Clienti(nP);
		for (int i=0; i<nP; i++) {
			System.out.println("inserisci nome cliente");
			String N = sc.nextLine();
			System.out.println("inserisci cognome del cliente");
			String C = sc.nextLine();
			Persona p1 = new Persona (N,C);
			clienti.AddClienti(p1,i);
		}
		return clienti;
	}


}
