
public class RationalNumber {
	private int numerator, denominator;
	
	//The constructor for that takes numerator and denominator as integers
	public RationalNumber(int n, int d) {
		if(d == 0) {
			d = 1;
		}
		if(d < 1) {
			n = -n;
			d = -d;
		}
		numerator = n;
		denominator = d;
		reduce();
	}
	
	//Return the numerator
	public int getNumerator() {
		return numerator;
	}
	
	//return the denominator
	public int getDenominator() {
		return denominator;
	}
	
	//reduce the fraction into simplest form
	public void reduce() {
		if(numerator != 0) {
			int common = hcf(Math.abs(numerator), denominator);
			numerator = numerator / common;
			denominator = denominator / common;
		}
	}
	
	//Get the highest common factor of two numbers
	public int hcf(int n1, int n2) {
		if(n2 == 0) {
			return n1;
		}
			
		return hcf(n2, n1%n2);
	}
	
	//Return the reciprocal of the rational number
	public RationalNumber reciprocal() {
		return new RationalNumber(denominator, numerator);
	}
	
	//Add new rational number with current rational number
	public RationalNumber add(RationalNumber operand2) {
		int commonD = denominator * operand2.getDenominator();
		int n1 = numerator * operand2.getDenominator();
		int n2 = operand2.getNumerator()*denominator;
		int sum = n1 + n2;
		
		return new RationalNumber(sum, commonD);
	}
	
	//Subtract new rational number from current rational number
	public RationalNumber subtract(RationalNumber operand2) {
		int commonD = denominator * operand2.getDenominator();
		int n1 = numerator * operand2.getDenominator();
		int n2 = operand2.getNumerator() * denominator;
		int difference = n1 - n2;
		
		return new RationalNumber(difference, commonD);
	}
	
	//Multiply new rational number with current rational number
	public RationalNumber multiply(RationalNumber operand2) {
		int n = numerator * operand2.getNumerator();
		int d = denominator * operand2.getDenominator();
		
		return new RationalNumber(n, d);
	}
	
	//Divide current rational number by new rational number 
	public RationalNumber divide(RationalNumber operand2) {
		return multiply(operand2.reciprocal());
	}
	
	//Print the rational number in fractional form
	public void printFraction() {
		String result;
		if(numerator == 0) {
			result = "0";
		}else {
			if(denominator == 1) {
				result = numerator + "";
			}else{
				result = numerator + "/" + denominator;
			}
		}
		System.out.println(result);
	}
	
	//Print the decimal form of the rational number
	public void printDecimal() {
		double n, d;
		n = (double)numerator;
		d = (double)denominator;
		
		double result = n / d;
		System.out.println(result);
	}
	
}
