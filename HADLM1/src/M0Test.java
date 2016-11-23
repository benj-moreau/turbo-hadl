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
		Systeme_Configuration cs = f.createSystemeConfigurationPerso(null);
		cs.sendRequest("key1");
	}
}
