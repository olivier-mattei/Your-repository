package controle;

public class App {

	public static void main(String[] args) 
	{
	
		Serveur serveur = Serveur.getinstance();
		serveur.creerFano(9);//création de Fano
		serveur.creerUtilisateurs("jean");//création d'un utilisateurs
		
		try 
		{
			sleep(10000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}

}
