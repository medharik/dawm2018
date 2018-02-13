package pacBASE1;

public class Produit {
final	double TAUX_TVA=1.20;
String reference,libelle;
double qteStock,prix,cout;
Categorie categorie;
@Override
	public String toString() {
		// TODO Auto-generated method stub
		return libelle+" coute "+prix+ " dhs"+" quantité en stock est :"+qteStock;
	}

public static void main(String[] args) {	
	Produit hp=new Produit();
	hp.reference="hp c677";
	hp.libelle="hp dv 6";
	hp.cout=2000;
	hp.prix=3000;
	hp.qteStock=10;
	System.out.println(hp);
	hp.charger(15);
	System.out.println(hp.toString());
	hp.decharger(5);
	System.out.println(hp);
	double ttc=hp.vendre(4);
	System.out.println(hp);
	System.out.println("ttc est "+ttc);
//Categorie c=hp.getCategorie();
//	String codecatgeorie=c.getCodecatgeorie();
}


public void decharger(int qteADecharger) {
	if(qteADecharger <=qteStock)
	qteStock -=qteADecharger;
	else {
		System.out.println("erreur , qteStock insuffisante");
	}
}


private Categorie getCategorie() {
	
	return categorie;
}


private double vendre(int qteAVendre) {
	if(qteAVendre <= qteStock){
		decharger(qteAVendre);
		return prix*qteAVendre*TAUX_TVA;
	}
	else {
		System.out.println("opération de vente impossible car insuffisance de stock");
		return 0;
	}
	
}


private void charger(int quantitéACharger) {
	qteStock +=quantitéACharger;
	
}
}
