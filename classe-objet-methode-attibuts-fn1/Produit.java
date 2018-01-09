package pac1;

public class Produit {
String libellé;
int qteStock;
double cout, prix;
 final double TAUX_TVA =1.20;

public static void main(String[] args) {
	//class => type / model
	//objet => instance / exemplaire
	Produit hp=new Produit();
	hp.libellé="hp dv 6";
	hp.prix=1000;
	hp.cout=900;
	hp.qteStock=20;
	
	//hp.afficher();
	System.out.println(hp);
	double g=hp.gain();
	System.out.println("le gain par produit est  "+g);
	
	System.out.println("le gain par 10 produit "+hp.gain(10));
	System.out.println("le prix ttc de la vente de 10 produits "+hp.vendre(10));
	System.out.println(hp);
	hp.vendre(10);
	System.out.println(hp);
}


private double vendre(int quantitéAvendre) {
	if(quantitéAvendre <= qteStock){
	qteStock -=  quantitéAvendre;
	return prix*quantitéAvendre*TAUX_TVA;
	}
		System.out.println("transaction de vente impossible car, la quantité en stock < à "+quantitéAvendre);
	return 0;	

}


private double gain(int quantitéAvendre) {
	// TODO Auto-generated method stub
	
	return gain()*quantitéAvendre;
}


private double gain() {

	return (prix-cout);
}
//pernaliser l'affichage en chaine de caracteres d'un produit
	public String toString() {
		// TODO Auto-generated method stub
		return libellé+ " coute  "+prix+" Dhs, il en reste "+qteStock +" en stock";
	}

private void afficher() {
	System.out.println(this);
}
	

	
}
