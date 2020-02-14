package numerocomptebanque;

import static org.junit.Assert.*;

import org.junit.Test;

import fr.gtm.entities.InvalidFormatException;
import fr.gtm.entities.Rib;


public class TestNumRib {

	@Test
	public void testNumRib() throws InvalidFormatException {
	Rib r1 = new Rib("22");
	assertNotNull(r1);
		}
		@Test(expected = InvalidFormatException.class)
		public void testNumRib2() throws InvalidFormatException {
				Rib r2 = new Rib ("568") ;
				assertNotNull(r2);
		}
}
