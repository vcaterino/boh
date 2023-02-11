package canile;

public class Clienti {

	private Persona[]listaPersone;
	
	public Clienti(int nP) {
		listaPersone = new Persona[nP];
	}

	public Persona[] getListaPersone() {
		return listaPersone;
	}

	public void setListaPersone(Persona[] listaPersone) {
		this.listaPersone = listaPersone;
	}
	public void AddClienti(Persona p1, int i) {
		listaPersone [i]= p1;
	}
	public Persona getPersona(int v) {
	       return listaPersone[v];
	}
}
