package canile;

public class Cane {

	private String nome;
	private String razza;
	private int eta;
	private float costo;
	
	public Cane (String nome, String razza, int eta,float costo) {
		
		setNome(nome);
		setRazza(razza);
		setEta(eta);
		setCosto(costo);
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRazza() {
		return razza;
	}

	public void setRazza(String razza) {
		this.razza = razza;
	}

	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}

	public float getCosto() {
		return costo;
	}

	public void setCosto(float costo) {
		this.costo = costo;
	}
	
}
