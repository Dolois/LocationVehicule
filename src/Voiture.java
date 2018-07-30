import java.util.*;

public class Voiture extends LocationVehicule
{
	LocationVehicule loc = new LocationVehicule();
	
	public double setMarque(double cout, int kilometrage)
	{
		double prix = cout * kilometrage;
		return prix;
	}
}