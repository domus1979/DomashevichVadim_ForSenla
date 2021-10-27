package by.dvn.sumOfDigits;

public class SumOfDigits {
	private String str;
	
	public SumOfDigits(String str) {
		this.str = str;
	}
	
	public int getSumOfDigits() {
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			if ( Character.isDigit(str.charAt(i))) {
				sum += str.charAt(i) - 48;
			}
		}
		return sum;
	}
}
