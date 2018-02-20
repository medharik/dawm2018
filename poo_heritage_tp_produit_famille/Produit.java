package poo_heritage_tp_produit_famille;

public class Produit {
//encapsulation
private String libell�;
private double prix;
private int qteStock;
public String getLibell�() {
	return libell�.toUpperCase();
}
public void setLibell�(String libell�) {
	this.libell� = libell�;
}
public double getPrix() {
	return prix;
}
public void setPrix(double prix) throws Exception {
	if(prix<0) throw new Exception("le prix ne doit pas �tre < 0");
	this.prix = prix;
}
public int getQteStock() {
	return qteStock;
}
public void setQteStock(int qteStock) {
	this.qteStock = qteStock;
}

public Produit() {
	// TODO Auto-generated constructor stub
}
public Produit(String libell�, double prix, int qteStock) {
	super();
	this.libell� = libell�;
	this.prix = prix;
	this.qteStock = qteStock;
}

@Override
	public String toString() {
		
		return libell�+" "+prix+" Dhs, "+qteStock+" en stock";
	}
public void afficher(){
	System.out.println(this);
}
public double calculerTht(int qte){
	return prix*qte;
}
}

