package pac1;

public class Produit {
String libell�;
int qteStock;
double cout, prix;
 final double TAUX_TVA =1.20;

public static void main(String[] args) {
	//class => type / model
	//objet => instance / exemplaire
	Produit hp=new Produit();
	hp.libell�="hp dv 6";
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


private double vendre(int quantit�Avendre) {
	if(quantit�Avendre <= qteStock){
	qteStock -=  quantit�Avendre;
	return prix*quantit�Avendre*TAUX_TVA;
	}
		System.out.println("transaction de vente impossible car, la quantit� en stock < � "+quantit�Avendre);
	return 0;	

}


private double gain(int quantit�Avendre) {
	// TODO Auto-generated method stub
	
	return gain()*quantit�Avendre;
}


private double gain() {

	return (prix-cout);
}
//pernaliser l'affichage en chaine de caracteres d'un produit
	public String toString() {
		// TODO Auto-generated method stub
		return libell�+ " coute  "+prix+" Dhs, il en reste "+qteStock +" en stock";
	}

private void afficher() {
	System.out.println(this);
}
	

	
}
