
public class Moto extends LocationVehicule 
{
	public boolean roulerMoto(boolean casque, boolean gants)
	{
		if (casque && gants)
			return true;
					
		return false;
	}
}