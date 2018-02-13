package poo;

import javax.swing.JOptionPane;

public class Test {
public static void main(String[] args) {
	Produit hp=new Produit("hp",5000,90);
	hp.setLibellé("hp dv 6");
	
	try {
		hp.setPrix(-6000);
	} catch (Exception e) {
		// TODO Auto-generated catch block
	JOptionPane.showConfirmDialog(null, e.getMessage());
	}
	System.out.println(hp);
	System.out.println("la qte est "+hp.getQteStock());
}

}
