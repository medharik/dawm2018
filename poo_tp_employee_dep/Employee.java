package poo_tp_employee_dep;

public class Employee {
private String nom,prenom,sp�cialit�;
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
	return "Employee [nom=" + nom + ", prenom=" + prenom + ", sp�cialit�=" + sp�cialit� + ", salaire=" + salaire
			+ ", departement=" + departement + "]";
}
public Employee(String nom, String prenom, String sp�cialit�, double salaire, Departement departement) {

	this.nom = nom;
	this.prenom = prenom;
	this.sp�cialit� = sp�cialit�;
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
public String getSp�cialit�() {
	return sp�cialit�;
}
public void setSp�cialit�(String sp�cialit�) {
	this.sp�cialit� = sp�cialit�;
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
