/*4.  Write a Java class that represents a rational number.  Imagine that this class will be used by a program that 
 * works with rational numbers.  Include any members or methods that you think a rational number class would need to have.
 
For example, the class may need a printDecimal() method that prints the number in decimal form, 
or it may need a printFraction() method that prints the number in fraction form.  It may also need methods like add() 
that allow you to perform numerical operations.
*/

public class Question4 {

	public static void main(String[] args) {
		RationalNumber rn1 = new RationalNumber(2, 3);
		
		//print Numerator
		System.out.println(rn1.getNumerator());
		//print Denominator
		System.out.println(rn1.getDenominator());
		
		//print the decimal number
		rn1.printDecimal();
		
		//print the fraction
		rn1.printFraction();
		
		//get reciprocal of the fraction
		RationalNumber recip = rn1.reciprocal();
		recip.printFraction();
		
		//Add first rational number with second
		RationalNumber rn2 = new RationalNumber(3, 4);
		RationalNumber result = rn1.add(rn2);
		result.printFraction();
		
		//Subtract second rational number from first
		result = rn1.subtract(rn2);
		result.printFraction();
		
		//multiply first fraction with second
		result = rn1.multiply(rn2);
		result.printFraction();
		
		//Divide first fraction by second
		result = rn1.divide(rn2);
		result.printFraction();
		
	}

}
