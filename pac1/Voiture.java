  package pac1;

public class Voiture {
	//attribut
String modele;
double consommation;
double volumereservoir;

	@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Mod�le : "+modele+"\nConsommation est : "+consommation+"\n volume max est : "+volumereservoir+" l";
		}
	
	

	
	private  void rechargerVolume(int volumeEnLitre) {
	volumereservoir += volumeEnLitre;
		
	}

	private double rouler(int distance) {
		double volumeutilis�=consommation*distance/100;
		volumereservoir -= volumeutilis�;
		return volumeutilis�;
	}

	private double coutDistance(double prixParLitre, double distanceEnKm) {
	double cout=consommation*prixParLitre*distanceEnKm/100;
		return cout;
	}
	
	
}
