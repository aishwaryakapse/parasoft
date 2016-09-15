/*2. Given an array of arbitrary length, write a program (in C++ or Java) that will add up two consecutive 
 	numbers in the list and return the maximum value.
 
	For example, given the following array:
	[10, -2, 5, 6, -5]
	The possible values are: 8, 3, 11, 1, and the maximum value is 11.
 */
public class Question2 {
	
	//Return the maximum sum of two consecutive numbers
	public int maxConsecutiveSum(int[] num) {
		int max = (int) (-1 * Math.pow(10, 10));
		int i = 0;
		int j = i+1;
		while(j < num.length) {
			int sum = num[i] + num[j];
			max = max > sum ? max : sum;
			i++;
			j++;
		}
		return max;
	}
	
	public static void main(String[] args) {
		int[] arr ={10, -2, 5, 6, -5};
		Question2 q2 = new Question2();
		System.out.println(q2.maxConsecutiveSum(arr));
	}

}
