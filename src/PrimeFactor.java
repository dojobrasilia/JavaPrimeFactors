import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class PrimeFactor {

	private static Set<Integer> primes = new HashSet<Integer>();
	
	public static int[][] factor(int n) {
		
		List<int[]> factorsList = new ArrayList<int[]>();
		
		int i = 2;
		do {
			
			if (n % i == 0){
				int cont = factorsOf(n,i);
				factorsList.add(new int[]{i, cont});
			}
			
			i = nextPrime(i);
			
		} while(i<=n);
		
		return factorsList.toArray(new int[0][0]);
	}

	public static int nextPrime(int i) {
		do{
			i++;
		} while(!isPrime(i));
		return i;
	}

	private static int factorsOf(int n, int factor) {
		int temp=n;
		int cont = 0;
		while (temp % factor == 0){
			cont++;
			temp /= factor;
		}
		return cont;
	}

	public static boolean isPrime(int number) {
		if (primes.contains(number)) return true;
		
		for(int i=2; i<=number/2 ; i++){
			if (number % i == 0){
				return false;
			}
		}
		primes.add(number);
		return true;
	}
	
}
