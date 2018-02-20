package poo_heritage_tp_produit_famille;

public class ProduitElec extends Produit {
private String config;

public String getConfig() {
	return config;
}

public void setConfig(String config) {
	this.config = config;
}
public ProduitElec() {
	
}

public ProduitElec(String libellé, double prix, int qteStock, String config) {
		super(libellé, prix, qteStock);
		this.config = config;
}

	@Override
		public String toString() {
			
			return super.toString()+"\n , config "+config;
		}
}
