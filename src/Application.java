import java.util.Scanner;

public class Application 
{

	public static void main(String [] args)
    {
		Scanner sc = new Scanner(System.in);
		
        Voiture vo = new Voiture();
        Moto mo = new Moto();
        Bateau bo = new Bateau();
    	
    	vo.setMarque("Audi TT");
    	vo.setCouleur("grise");
    	vo.setPuissance(7);
    	vo.setCarburant("Essence");
    	
    	System.out.print("Nombre de kilomètres/jour (max 500kms) pour le vehicule " +
    					vo.getMarque() + " : ");
    	int kms = sc.nextInt();
    	
    	vo.setKilometrage(kms);					// 500 kilomètres est la limite max par jour
    	vo.setCout(0.85);						// cout du kilomètre avec une limite de 500 kms par jour
    	vo.setPrix(0);
		System.out.println("La location de la voiture " + vo.getMarque() + 
				" me revient à " + vo.getPrix() + "€ pour " + vo.getKilometrage() + " kms par jour");
		System.out.println();
    	
    	mo.setMarque("Yamaha Fazer 800");
    	mo.setCouleur("noire");
    	mo.setPuissance(9);
    	mo.setCarburant("Essence");
    	
    	System.out.print("Nombre de kilomètres/jour (max 500kms) pour le vehicule " +
    					mo.getMarque() + " : ");
    	kms = sc.nextInt();
    	
    	mo.setKilometrage(kms);					// 500 kilomètres est la limite max par jour
    	mo.setCout(1.20);						// cout du kilomètre avec une limite de 500 kms par jour
    	mo.setPrix(0.00);
		System.out.println("La location de la moto " + mo.getMarque() + 
				" me revient à " + mo.getPrix() + "€ pour " + mo.getKilometrage() + " kms par jour");
		System.out.println();
    	
    	bo.setMarque("Beneteau Flyer 8.8");
    	bo.setCouleur("blanc");
    	bo.setPuissance(9);
    	bo.setCarburant("Essence");
    	
    	System.out.print("Nombre de noeuds/jour (max 300noeuds) pour le vehicule " +
    					bo.getMarque() + " : ");
    	int nds = sc.nextInt();
    	
    	bo.setKilometrage(nds);					// 200 noeuds est la limite max par jour
    	bo.setCout(2.70);						// cout du noeud avec une limite de 200 noeuds par jour
    	bo.setPrix(0.00);
		System.out.println("La location du bateau " + bo.getMarque() + 
				" me revient à " + bo.getPrix() + "€ pour " + bo.getKilometrage() + " noeuds par jour");
		System.out.println();
    }
}