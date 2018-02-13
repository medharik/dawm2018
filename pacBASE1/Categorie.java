package pacBASE1;

import java.util.ArrayList;
import java.util.List;

public class Categorie {
String codeCatgeorie, nomCategorie;
List<Produit> lesProduits;

	

	public String getCodecatgeorie() {
		// TODO Auto-generated method stub
		return null;
	}

	public static void main(String[] args) {
		Categorie c =new Categorie();
		c.nomCategorie="pc portable";
		c.codeCatgeorie="pc p300";
		
		c.lesProduits=new ArrayList<>();
		Produit dell=new Produit();
		dell.libelle="dell c8";
		dell.prix=1000;
		dell.qteStock=10;
		Produit hp=new Produit();
		hp.libelle="hp d9";
		hp.prix=2000;
		hp.qteStock=20;
	c.ajouterProduit(dell);

	c.ajouterProduit(hp);
	System.out.println(c);
	//c.supprimer(hp);
	System.out.println(c.nomCategorie+" contient "+c.nombreProduit());
//	c.supprimer(hp);
	double chiffreAffaire=c.getChiffreAffaire();
	System.out.println(chiffreAffaire);
	c.supprimer(hp);
	chiffreAffaire=c.getChiffreAffaire();
	System.out.println("chiffre affaire 2 :"+chiffreAffaire);
	
	}
	private int nombreProduit() {
		
		return lesProduits.size();
	}
	Produit get(int i){
	return lesProduits.get(i);	
	}
@Override
	public String toString() {
		String text="code "+codeCatgeorie+ "\n nom catégorie : "+nomCategorie+"\n";
		for (int i = 0; i < lesProduits.size(); i++) {
			text += "\n"+get(i);
		}
		return text;
	}
	private double getChiffreAffaire() {
	double somme=0;
		for (int i = 0; i < lesProduits.size(); i++) {
			Produit produitEncours=get(i);
			somme += produitEncours.prix*produitEncours.qteStock;
		//System.out.println("somme "+i+" est "+somme);
		}
		
		return somme;
	}
	private void supprimer(Produit unProduit) {
		lesProduits.remove(unProduit);		
	}
	private void ajouterProduit(Produit unProduit) {
		lesProduits.add(unProduit);	
	}
	private List<Produit> getListProduits() {
		return lesProduits;
	}
	
}
