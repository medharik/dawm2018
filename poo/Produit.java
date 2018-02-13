package poo;

public class Produit {

	private String libellé;
	private double prix;
	private int qteStock;
	//constructeur
	public Produit() {
		// TODO Auto-generated constructor stub
	}
	public Produit(String libellé, double prix, int qteStock){
		this.libellé=libellé;
		this.prix=prix;
		this.qteStock=qteStock;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return libellé+" coute "+prix+" Dhs";
	}
	public String getLibellé() {
		return libellé.toUpperCase();
	}
	public void setLibellé(String libellé) {
		this.libellé = libellé;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) throws Exception {
	if(prix<0){
	throw new Exception("le prix ne doit pas être < 0");
	}
		this.prix = prix;
	
	}
	public int getQteStock() {
		return qteStock;
	}
	public void setQteStock(int qteStock) {
		this.qteStock = qteStock;
	}
	
	
	
}
