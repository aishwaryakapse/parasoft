/*3. Write a short program in Java that will return the nth prime number.  For example, given the input 5, 
 * the program will return the 5th prime number, which is 11.  (Hint: use the mod operator to make things easier).
*/

public class Question3 {
	//Return the nth prime number
	int nthPrime(int n) {
		int number, count = 1;
		for(number = 2; count <= n; ++number) {
			if(isPrime(number)) {
				++count;
			}
		}
		return number-1;
	}
	
	//Check if a particular integer is prime
	boolean isPrime(int x) {
		if(x % 2 == 0 && x != 2) {
			return false;
		}
		for(int i = 2; i < x ; i++) {
			if(x % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Question3 q3 = new Question3();
		System.out.println(q3.nthPrime(7));
	}

}
