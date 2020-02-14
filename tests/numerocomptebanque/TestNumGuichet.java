package numerocomptebanque;

import static org.junit.Assert.*;

import org.junit.Test;

import fr.gtm.entities.InvalidFormatException;
import fr.gtm.entities.NumGuichet;

public class TestNumGuichet {

	@Test
	public void testNumGuichet1() throws InvalidFormatException {
		NumGuichet g1 = new NumGuichet("56812") ;
		assertNotNull(g1);
	}
	@Test(expected = InvalidFormatException.class)
	public void testNumGuchet2() throws InvalidFormatException {
			NumGuichet g2 = new NumGuichet("568") ;
			assertNotNull(g2);
		}
	}
