package numerocomptebanque;

import static org.junit.Assert.*;

import org.junit.Test;

import fr.gtm.entities.InvalidFormatException;
import fr.gtm.entities.NumEtablissement;

public class TestNumEtablissement {

	@Test
	public void testNumEtablissement() throws InvalidFormatException {
			NumEtablissement e1 = new NumEtablissement("12345");
			assertNotNull(e1);
		}	
		@Test(expected = InvalidFormatException.class)
		public void testException() throws InvalidFormatException {
			NumEtablissement e2 = new NumEtablissement("46588741");
			assertNotNull(e2);
		}
	}