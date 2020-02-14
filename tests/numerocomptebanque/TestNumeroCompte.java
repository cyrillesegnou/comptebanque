package numerocomptebanque;

import static org.junit.Assert.*;

import org.junit.Test;

import fr.gtm.entities.Compte;
import fr.gtm.entities.InvalidFormatException;
import fr.gtm.entities.NumEtablissement;
import fr.gtm.entities.NumGuichet;
import fr.gtm.entities.NumeroCompte;
import fr.gtm.entities.Rib;

public class TestNumeroCompte {

	@Test
	public void testNumeroCompte() throws InvalidFormatException {
		NumeroCompte iban = new NumeroCompte(new NumEtablissement("15274"), new NumGuichet("12586"),
							new Compte("15869428536"), new Rib("2m5"));
		assertNotNull(iban);		
	}

}
