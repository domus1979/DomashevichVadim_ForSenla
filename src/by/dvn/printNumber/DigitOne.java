package by.dvn.printNumber;

public class DigitOne{

	public static String printDigitLine(int line, char s) {
		switch (line) {
		case 1:
			return "  "+s+" ";
		case 2:
			return " "+s+s+" ";
		case 3:
			return s+" "+s+" ";
		case 4:
			return "  "+s+" ";
		case 5:
			return "  "+s+" ";
		case 6:
			return "  "+s+" ";
		case 7:
			return "  "+s+" ";
		default:
			return "";
		}

	}
	
}
