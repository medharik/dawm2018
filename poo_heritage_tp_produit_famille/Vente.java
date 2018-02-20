package poo_heritage_tp_produit_famille;

import java.util.ArrayList;

public class Vente {
public static void main(String[] args) {
	Produit lait=new Produit("lait uht", 10, 1);
	Produit pt=new Produit("pt", 5, 1);
	ProduitElec hp = new ProduitElec("hp dv 6", 1000, 1, "core i 3");
ArrayList<Produit> l=new ArrayList<>();
l.add(lait);
l.add(pt);
l.add(hp);
	Famille panier= new Famille("panier 1", l) ;
	System.out.println("ce panier coute "+panier.calculerTotal()+" dhs");
	
}
}
