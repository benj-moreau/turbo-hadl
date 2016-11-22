import hADL.Composant.Composant;
import hADL.Configuration.ConfigurationFactory;
import hADLM1.Client_Composant;
import hADLM1.HADLM1Factory;
import hADLM1.RPC_ConnectorExplicite;
import hADLM1.Serveur_Composant;
import hADLM1.Systeme_Configuration;
import hADLM1.util.HADLM1AdapterFactory;

public class M0Test {

	public static void main(String[] args) {
		//création factory
		HADLM1Factory f = HADLM1Factory.init();
		System.out.println("coucou");
		Systeme_Configuration cs = f.createSysteme_Configuration();
		
		//COMPOSANTS et connecteurs
		Client_Composant client_Composant = f.createClient_Composant();
		Serveur_Composant serveur_Composant = f.createServeur_Composant();
		RPC_ConnectorExplicite rpc_ConnectorExplicite = f.createRPC_ConnectorExplicite();
		
		Client_Composant[] newClient_composantList=new Client_Composant[1];
		newClient_composantList[0]= client_Composant;
		cs.setClient_composant(newClient_composantList);
		
		//PORT
		for (Composant compo : cs.getChildComposant()) {
			System.out.println(compo);
			System.out.println("a");
		}
		
		for (Composant compo : cs.getClient_composant()) {
			System.out.println(compo);
			System.out.println("b");
		}
		
		
		
		
		
	}

}
