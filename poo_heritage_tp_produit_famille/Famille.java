package poo_heritage_tp_produit_famille;

import java.util.ArrayList;

public class Famille {
private String nom;
private ArrayList<Produit> list;
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public ArrayList<Produit> getList() {
	return list;
}
public void setList(ArrayList<Produit> list) {
	this.list = list;
}
public Famille() {
	super();
}
public Famille(String nom, ArrayList<Produit> list) {
	super();
	this.nom = nom;
	this.list = list;
}
public double calculerTotal(){
	double somme =0;
	for (int i = 0; i < list.size(); i++) {
		somme +=list.get(i).calculerTht(list.get(i).getQteStock());
	}
	return somme;
}



}
