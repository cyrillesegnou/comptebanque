package numerocomptebanque;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import fr.gtm.entities.Compte;
import fr.gtm.entities.InvalidFormatException;

public class CompteTest {

	@Test
	public void testNumCompte1() throws InvalidFormatException {
		Compte c1 = new Compte("15236987") ;
		assertNotNull(c1);
	}
	@Test(expected = InvalidFormatException.class)
	public void testNumCompte2() throws InvalidFormatException {
		Compte c2 = new Compte ("456454654564676787") ;
		assertNotNull(c2);;
	}
		
	}

