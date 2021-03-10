package controle;

import java.util.Timer;

public class Fano
{
	public Fano()
	{
		System.out.println("je suis  un Fano trop bien!");
		
	}
	public void dureeTour(float temp)
	{
		new Timer(temp,evt->Serveur.afficherTour()).start();//déclenche le chrone appelle de afficherMaintenant
	}
}
