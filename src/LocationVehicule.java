import java.util.*;

public class LocationVehicule {

    String marque;
    String carburant;
    int puissance;
    String couleur;
    int kilometrage;	// limite de kilométrage
    double cout;		// cout au kilomètre
    double prix;		// prix de la location a partir de la limite de kilométrage
    
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public String getCarburant() {
		return carburant;
	}
	public void setCarburant(String carburant) {
		this.carburant = carburant;
	}
	public int getPuissance() {
		return puissance;
	}
	public void setPuissance(int puissance) {
		this.puissance = puissance;
	}
	public String getCouleur() {
		return couleur;
	}
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	public int getKilometrage() {
		return kilometrage;
	}
	public void setKilometrage(int kilometrage) {
		this.kilometrage = kilometrage;
	}
	public double getCout() {
		return cout;
	}
	public void setCout(double cout) {
		this.cout = cout;
	}
	public double getPrix() {
		return prix = cout * kilometrage;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
}