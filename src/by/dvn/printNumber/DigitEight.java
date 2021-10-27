package by.dvn.printNumber;

public class DigitEight {
	public static String printDigitLine(int line, char s) {
		switch (line) {
		case 1:
			return ""+s+s+s+s+s+s+" ";
		case 2:
			return ""+s+"    "+s+" ";
		case 3:
			return ""+s+"    "+s+" ";
		case 4:
			return ""+s+s+s+s+s+s+" ";
		case 5:
			return ""+s+"    "+s+" ";
		case 6:
			return ""+s+"    "+s+" ";
		case 7:
			return ""+s+s+s+s+s+s+" ";
		default:
			return "";
		}
	}
}
