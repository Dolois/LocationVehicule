
public class Application 
{

	public static void main(String [] args)
    {
        Voiture vo = new Voiture();
        Moto mo = new Moto();
        Bateau bo = new Bateau();
    	
    	vo.loc.setMarque("Audi TT");
    	vo.loc.setCouleur("grise");
    	vo.loc.setPuissance(7);
    	vo.loc.setCarburant("Essence");
    	vo.loc.setKilometrage(500);					// 500 kilomètres est la limite max par jour
    	vo.loc.setCout(0.85);						// cout du kilomètre avec une limite de 500 kms par jour
    	vo.loc.setPrix(0);
		System.out.println("La location de la voiture " + vo.loc.getMarque() + 
				" me revient à " + vo.loc.getPrix() + "€ pour " + vo.loc.getKilometrage() + " kms par jour");
		System.out.println();
    	
    	mo.loc.setMarque("Yamaha Fazer 800");
    	mo.loc.setCouleur("noire");
    	mo.loc.setPuissance(9);
    	mo.loc.setCarburant("Essence");
    	mo.loc.setKilometrage(500);					// 500 kilomètres est la limite max par jour
    	mo.loc.setCout(1.20);						// cout du kilomètre avec une limite de 500 kms par jour
    	mo.loc.setPrix(0.00);
		System.out.println("La location de la moto " + mo.loc.getMarque() + 
				" me revient à " + mo.loc.getPrix() + "€ pour " + mo.loc.getKilometrage() + " kms par jour");
		System.out.println();
    	
    	bo.loc.setMarque("Beneteau Flyer 8.8");
    	bo.loc.setCouleur("blanc");
    	bo.loc.setPuissance(9);
    	bo.loc.setCarburant("Essence");
    	bo.loc.setKilometrage(200);					// 200 noeuds est la limite max par jour
    	bo.loc.setCout(2.70);						// cout du noeud avec une limite de 200 noeuds par jour
    	bo.loc.setPrix(0.00);
		System.out.println("La location du bateau " + bo.loc.getMarque() + 
				" me revient à " + bo.loc.getPrix() + "€ pour " + bo.loc.getKilometrage() + " noeuds par jour");
		System.out.println();
    }
}