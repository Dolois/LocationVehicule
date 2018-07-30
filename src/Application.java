import java.util.*;

public class Application 
{

	public static void main(String [] args)
    {
        Voiture vo = new Voiture();
        Moto mo = new Moto();
        Bateau bo = new Bateau();
    	
    	vo.loc.setMarque("Audi");
    	vo.loc.setCouleur("grise");
    	vo.loc.setPuissance(9);
    	vo.loc.setCarburant("Essence");
    	vo.loc.setKilometrage(500);
    	vo.loc.setCout(0.85);
    	vo.loc.setPrix(0);
		System.out.println("La location du v�hicule " + vo.loc.getMarque() + " me revient � " + vo.loc.getPrix());
    	
    	mo.loc.setMarque("Yamaha");
    	mo.loc.setCouleur("noire");
    	mo.loc.setPuissance(9);
    	mo.loc.setCarburant("Essence");
    	mo.loc.setKilometrage(500);
    	mo.loc.setCout(0.90);
    	mo.loc.setPrix(0.00);
		System.out.println("La location du v�hicule " + mo.loc.getMarque() + " me revient � " + mo.loc.getPrix());
    	
    	bo.loc.setMarque("Beneteau");
    	bo.loc.setCouleur("blanc");
    	bo.loc.setPuissance(9);
    	bo.loc.setCarburant("Essence");
    	bo.loc.setKilometrage(500);
    	bo.loc.setCout(0.99);
    	bo.loc.setPrix(0.00);
		System.out.println("La location du v�hicule " + bo.loc.getMarque() + " me revient � " + bo.loc.getPrix());
    }
}