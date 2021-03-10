package controle;

public class Serveur 
{
	public static Serveur INSTANCE = null;
	public static Serveur getinstance()
	{
		if (INSTANCE ==null)
		{
			INSTANCE = new Serveur();
		}
		return INSTANCE;
	}
	public static void creerFano (int num)//utilisation de la factory pour création
	{
		Factory.getFano(num);
		System.out.println("numéro de dossard demandé"+ num);
	}
	public static void creerUtilisateurs (String nom,float temp)
	{
		Factory.getUtilisateur(nom,temp);
		System.out.println("l'utilisateur crée s'appelle:" + nom);
	}
	public static void afficherTour(float temps)
	
		System.currentTimeMillis();//affiche
	}
}