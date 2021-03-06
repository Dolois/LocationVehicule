
public class LocationVehicule {

    String marque;
    String carburant;
    int puissance;
    String couleur;
    int kilometrage;	// limite de kilom�trage par jour
    double cout;		// cout au kilom�tre
    double prix;		// prix de la location a partir de la limite max de kilom�trage par jour
    
    
    /* les getters et setters sont des m�thodes qui sont partag�es
     * avec les sous-Classes Voiture, Moto et Bateau de la Classe abstraite LocationVehicule
     *
     * les getters sont les m�thodes d'affectation d'une valeur dans une variable
     * les setters sont les m�thodes de r�cup�ration d'une valeur dans une variable
     * */
    
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
		return cout * kilometrage;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
}