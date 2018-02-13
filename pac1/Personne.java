package pac1;

public class Personne {
	//attributs => fields
String nom,prenom;
double salaire;
int age ;
//le methodes 
void afficher() {
	Double d=new Double(3);
	double dd=3;
System.out.println("nom complet : "+nom+" "+prenom);
System.out.println("le salaire est "+salaire);	
System.out.println("age est "+age+" ans");

}

String maj(){
	return (age>18)? "majeur":"mineur" ; 
}

public static void main(String[] args) {
	//instancier un objet de type Personne
	Personne p=new Personne();
	p.nom="alami";
	p.prenom=" mohamed";
	p.age=15;
	p.salaire=7000;
	p.afficher();
	int i=90;
	long l=i;
	i=(int) l;
	float f= 90.9f;
//	System.out.println("test "+p.age);
	System.out.println("vous êtes "+p.maj());
String s="053653";

}

//byte, short, int, long


	
	
}
