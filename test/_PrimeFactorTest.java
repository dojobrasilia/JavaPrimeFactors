import static org.junit.Assert.*;

import org.junit.Test;


public class _PrimeFactorTest {

	@Test public void primeFactorsHaveOnlyThemselves(){
		assertEquals(new int[][]{{2,1}},PrimeFactor.factor(2));
		assertEquals(new int[][]{{3,1}},PrimeFactor.factor(3));
	}
	
}
