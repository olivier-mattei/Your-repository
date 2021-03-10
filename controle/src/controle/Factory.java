package controle;

import java.util.ArrayList;
import java.util.List;

public class Factory 
{
	private static List<Utilisateurs> listeUtilisateurs= new ArrayList<>();
	
	public static Fano getFano (int dossard)
	{
		if (dossard==0)
		{
			System.out.println("veuillez taper un numéro de dossard correct");
			return null;
		}
		
		if (dossard>=1)//si sup ou égal à 1
		{
			System.out.println("Fano crée");
			return new Fano();
		}
		if (dossard <100)//si sup à 100
		{
			System.out.println("données trop grandre");
			return null;
		}
		return null;
	}
	public static Utilisateurs getUtilisateur (String Nom,float temps)
	{
		if (Nom!=null)//Nom!=listeUtilisateurs
		{
			//listeUtilisateurs.add(Nom);//ajoute la nom à la liste
			System.out.println("nouvelle utilisateurs crée");
			return new Utilisateurs();
		}
		if (temps!=0)
		{
			
		}
		return null;
	}
}
