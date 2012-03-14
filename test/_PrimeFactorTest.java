import static org.junit.Assert.*;

import org.junit.Test;


public class _PrimeFactorTest {

	@Test public void primeFactorsHaveOnlyThemselves(){
		assertEquals(new int[][]{{2,1}},PrimeFactor.factor(2));
		assertEquals(new int[][]{{3,1}},PrimeFactor.factor(3));
	}
	
	@Test public void calculateFactorsOfTheSameNumber(){
		assertEquals(new int[][]{{2,2}},PrimeFactor.factor(4));
		assertEquals(new int[][]{{2,3}},PrimeFactor.factor(8));
		assertEquals(new int[][]{{2,5}},PrimeFactor.factor(32));
		assertEquals(new int[][]{{3,2}},PrimeFactor.factor(9));
		assertEquals(new int[][]{{5,5}},PrimeFactor.factor((int)Math.pow(5,10)));
	}

	@Test public void calculateFactorsOfTwoPrimes(){
		assertEquals(new int[][]{{2,2},{3,2}},PrimeFactor.factor((int)Math.pow(2,2)*(int)Math.pow(3,2)));
		assertEquals(new int[][]{{2,2},{5,2}},PrimeFactor.factor(100));
		assertEquals(new int[][]{{2,1},{3,1},{5,1}},PrimeFactor.factor(30));
	}
	
	@Test public void checkIfANumberIsPrime(){
		assertEquals(true, PrimeFactor.isPrime(2));
		assertEquals(true, PrimeFactor.isPrime(3));
		assertEquals(true, PrimeFactor.isPrime(17));
		assertEquals(false, PrimeFactor.isPrime(15));
		assertEquals(false, PrimeFactor.isPrime(4));
	}
	
	@Test public void calculateNextPrime(){
		assertEquals(3, PrimeFactor.nextPrime(2));
		assertEquals(5, PrimeFactor.nextPrime(3));
		assertEquals(17, PrimeFactor.nextPrime(13));
	}
	
}
