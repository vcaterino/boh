package canile;

public class Canile {

	private Cane[]canile;
	
	public Canile(int nC) {
		canile= new Cane[nC];
	}

	public Cane[] getCanile() {
		return canile;
	}

	public void setCanile(Cane[] canile) {
		this.canile = canile;
	}
	public void Addcane(Cane cane, int i) {
		canile[i]=cane;
	}
	 public void etaMedia() {
	        float media=0;
	        for(int i=0; i< canile.length; i++){
	          media+=canile[i].getEta();
	        }
	        media/= canile.length;// media=media/listacani.length
	        System.out.println(media);
	    }

	    public Cane getCani(int np) {
	        return canile[np];
	        }
}
