package projecteuler.problem28;

public class NumberSpiralDiagonals {

	/**
	 * Author: James Norcross
	 * Date: 12/8/14
	 * Purpose: Project Euler problem 28
	 * Description:  Consider the number spiral as follows
	 * 
	 * 		21	22	23	24	25
	 * 		20	7	8	9	10
	 * 		19	6	1	2	11
	 * 		18	5	4	3	12
	 * 		17	16	15	14	13
	 * 
	 * The sum of all the digits on the diagonals is 101
	 * Can find an analytical expression for the sum of all numbers on the diagonals, given n is odd
	 * 
	 * upper right diagonal 		n2
	 * upper left diagonal			n2 - n + 1
	 * lower left diagonal 			n2 - 2n + 2
	 * lower right diagonal			n2 - 3n + 3
	 * 
	 * so at each layer (for n greater than 1) the sum is 4n2 - 6n + 6
	 */
	public static void main(String[] args) {
		
		int i, n, diagonalSum = 0, imax = 500;
		
		for (i=1; i<=imax; i++) {
			n = (2*i)+1;
			diagonalSum += (4*n*n) - (6*n) + 6;
		}
		diagonalSum = diagonalSum + 1;		// for center value
		
		System.out.println("The diagonal sum is " + diagonalSum);
	}

}
