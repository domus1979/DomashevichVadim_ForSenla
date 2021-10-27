package by.dvn.printNumber;

public class PrintNumber {
	private int number;
	
	public PrintNumber(int number) {
		this.number = number;
	}
		
	@Override
	public String toString() {
		return Integer.toString(number);
	}

	public void printNumber(char symbol) {
		int max = maxDigit();
		
		for (int i = 1; i <= 7; i++) {
			for (int j = 0; j < Integer.toString(number).length(); j++) {
				int digit = Integer.parseInt(Integer.toString(number).substring(j, j + 1));
				switch (digit) {
				case 1:
					System.out.print( DigitOne.printDigitLine(i, (max == 1) ? '1' : symbol) );
					break;
				case 2:
					System.out.print( DigitTwo.PrintDigitLine(i, (max == 2) ? '2' : symbol) );
					break;
				case 3:
					System.out.print( DigitThree.PrintDigitLine(i, (max == 3) ? '3' : symbol) );
					break;
				case 4:
					System.out.print( DigitFour.PrintDigitLine(i, (max == 4) ? '4' : symbol) );
					break;
				case 5:
					System.out.print( DigitFive.printDigitLine(i, (max == 5) ? '5' : symbol) );
					break;
				case 6:
					System.out.print( DigitSix.printDigitLine(i, (max == 6) ? '6' : symbol) );
					break;
				case 7:
					System.out.print( DigitSeven.printDigitLine(i, (max == 7) ? '7' : symbol) );
					break;
				case 8:
					System.out.print( DigitEight.printDigitLine(i, (max == 8) ? '8' : symbol) );
					break;
				case 9:
					System.out.print( DigitNine.printDigitLine(i, (max == 9) ? '9' : symbol) );
					break;
				case 0:
					System.out.print( DigitZero.printDigitLine(i, (max == 0) ? '0' : symbol) );
					break;
				}
			}
			System.out.println();
		}
	}

	private int maxDigit() {
		int max = 0;
		for (int i = 0; i < Integer.toString(number).length(); i++) {
			if (max < Integer.parseInt(Integer.toString(number).substring(i, i + 1))) {
				max = Integer.parseInt(Integer.toString(number).substring(i, i + 1));
			}
		}
		return max;
	}
}
