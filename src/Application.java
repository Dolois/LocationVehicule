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
		System.out.println("La location de la voiture " + vo.loc.getMarque() + " me revient à " + vo.loc.getPrix());
    	
    	mo.setMarque("Yamaha");
    	mo.setCouleur("noire");
    	mo.setPuissance(9);
    	mo.setCarburant("Essence");
    	mo.setKilometrage(500);
    	mo.setCout(0.90);
    	mo.setPrix(0.00);
		System.out.println("La location de la moto " + vo.getMarque() + " me revient à " + vo.getPrix());
    	
    	bo.setMarque("Beneteau");
    	bo.setCouleur("blanc");
    	bo.setPuissance(9);
    	bo.setCarburant("Essence");
    	bo.setKilometrage(500);
    	bo.setCout(0.99);
    	bo.setPrix(0.00);
		System.out.println("La location du bateau " + vo.getMarque() + " me revient à " + vo.getPrix());
    }
}