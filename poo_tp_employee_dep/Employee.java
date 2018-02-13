package poo_tp_employee_dep;

public class Employee {
private String nom,prenom,spécialité;
private double salaire;
private Departement departement;

public Employee(String nom, String prenom) {
	super();
	this.nom = nom;
	this.prenom = prenom;
}
public Employee() {
	// TODO Auto-generated constructor stub
}


@Override
public String toString() {
	return "Employee [nom=" + nom + ", prenom=" + prenom + ", spécialité=" + spécialité + ", salaire=" + salaire
			+ ", departement=" + departement + "]";
}
public Employee(String nom, String prenom, String spécialité, double salaire, Departement departement) {

	this.nom = nom;
	this.prenom = prenom;
	this.spécialité = spécialité;
	this.salaire = salaire;
	this.departement = departement;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getPrenom() {
	return prenom;
}
public void setPrenom(String prenom) {
	this.prenom = prenom;
}
public String getSpécialité() {
	return spécialité;
}
public void setSpécialité(String spécialité) {
	this.spécialité = spécialité;
}
public double getSalaire() {
	return salaire;
}
public void setSalaire(double salaire) {
	this.salaire = salaire;
}
public Departement getDepartement() {
	return departement;
}
public void setDepartement(Departement departement) {
	this.departement = departement;
}


}
