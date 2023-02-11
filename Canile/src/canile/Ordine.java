package canile;

public class Ordine {

	private Persona cliente;
	private Cane[]caniAcq;
	
	public Ordine(Persona cliente,int ncani) {
		setCliente(cliente);
		caniAcq = new Cane[ncani];
	}

	public Persona getCliente() {
		return cliente;
	}

	public void setCliente(Persona cliente) {
		this.cliente = cliente;
	}

	public Cane[] getCaniAcq() {
		return caniAcq;
	}

	public void setCaniAcq(Cane[] caniAcq) {
		this.caniAcq = caniAcq;
	}
	public void addCani(Cane c, int i) {
		caniAcq[i]=c;
	}
	 public float costoOrdine(){
	        float costo=0;
	        for(int i=0; i< caniAcq.length; i++){
	            costo+=caniAcq[i].getCosto();
	        }
	        return costo;
	    }
}
