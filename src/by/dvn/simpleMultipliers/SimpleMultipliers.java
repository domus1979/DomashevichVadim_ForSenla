package by.dvn.simpleMultipliers;

import java.util.ArrayList;

public class SimpleMultipliers {
	
	public static ArrayList<Integer> getSimpleMultipliersOfNumber(int n){
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		if (n == 0 || n == 1) {
			return arr;
		}
		
		if (n < 0) {
			n *= (-1);
		}

		int ind = 2;

		while (ind  <= Math.sqrt(n)) {
			// found divisor
			while (n % ind == 0) {
				arr.add(ind);
				n /= ind;
			}
			ind++;
		}
		
		if (n != 1) {
			arr.add(n);
		}
		
		return arr;
	
	}

}
