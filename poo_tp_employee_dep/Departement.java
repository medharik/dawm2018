package poo_tp_employee_dep;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public  class Departement {
private String nom,adresse;
private ArrayList<Employee> listEmployees;
public String getNom() {
	return nom;
}

public void setNom(String nom) {
	this.nom = nom;
}
public String getAdresse() {
	return adresse;
}
public void setAdresse(String adresse) {
	this.adresse = adresse;
}
public ArrayList<Employee> getListEmployees() {
	return listEmployees;
}

public void setListEmployees(ArrayList<Employee> listEmployees) {
	this.listEmployees = listEmployees;
}
public Departement(String nom, String adresse, ArrayList<Employee> listEmployees) {
	super();
	this.nom = nom;
	this.adresse = adresse;
	this.listEmployees = listEmployees;
}
public Departement() {
	// TODO Auto-generated constructor stub
}
public Departement(String nom, String adresse) {
	super();
	this.nom = nom;
	this.adresse = adresse;
}
public double getMasse() {
	double somme =0;
for (int i = 0; i < listEmployees.size(); i++) {
	somme +=listEmployees.get(i).getSalaire();
}

	return somme;

}

@Override
public String toString() {
	return "Departement [nom=" + nom + ", adresse=" + adresse + ", listEmployees=" + listEmployees + "]";
}
public static void main(String[] args) {

	Employee ali=new Employee("alami", "alaa", "info", 9000, null);
	Employee hicham=new Employee("hachimi", "hicham", "dev", 10000, null);
	ArrayList<Employee> l1=new ArrayList<>();
	l1.add(ali);
	l1.add(hicham);
	Departement d =new Departement("SI", "CASA", l1);
	System.out.println(d);
	System.out.println("la masse salariale est "+d.getMasse()+" Dhs");
}
}
