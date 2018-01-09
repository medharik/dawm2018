package pac1;

public class Voiture {
	//attribut
String modele;
double consommation;
double volumereservoir;

	@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Modèle : "+modele+"\nConsommation est : "+consommation+"\n volume max est : "+volumereservoir+" l";
		}
	
	public static void main(String[] args) {
		Voiture clio=new Voiture();
		clio.modele="clio 4";
		clio.consommation=5;
		clio.volumereservoir=100;
	System.out.println(clio);	
	double cout=clio.coutDistance(10.0,100);
	System.out.println("le cout est "+cout);
	double volumeUtilisé=clio.rouler(100);
	System.out.println("volume utilsé (100km ) est "+volumeUtilisé);
	clio.rechargerVolume(50);
	clio.rouler(400);
	System.out.println(clio);
	
	}

	
	private  void rechargerVolume(int volumeEnLitre) {
	volumereservoir += volumeEnLitre;
		
	}

	private double rouler(int distance) {
		double volumeutilisé=consommation*distance/100;
		volumereservoir -= volumeutilisé;
		return volumeutilisé;
	}

	private double coutDistance(double prixParLitre, double distanceEnKm) {
	double cout=consommation*prixParLitre*distanceEnKm/100;
		return cout;
	}
	
	
}
