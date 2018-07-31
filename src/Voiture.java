
public class Voiture extends LocationVehicule
{	
	public boolean changerRoues(int roues)
	{
		if (roues > 0)
			return true;
		
		return false;
	}
}