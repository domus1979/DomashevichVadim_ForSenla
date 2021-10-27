package by.dvn.printNumber;

public class DigitSeven {
	public static String printDigitLine(int line, char s) {
		switch (line) {
		case 1:
			return ""+s+s+s+s+s+" ";
		case 2:
			return "   "+s+"  ";
		case 3:
			return "  "+s+"   ";
		case 4:
			return " "+s+"    ";
		case 5:
			return ""+s+"     ";
		case 6:
			return ""+s+"     ";
		case 7:
			return ""+s+"     ";
		default:
			return "";
		}
	}
}
