
public class Moto extends LocationVehicule 
{
	LocationVehicule loc = new LocationVehicule();
	
	public double setMarque(double cout, int kilometrage)
	{
		double prix = cout * kilometrage;
		return prix;
	}
}