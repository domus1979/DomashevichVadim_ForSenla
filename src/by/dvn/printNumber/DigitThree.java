package by.dvn.printNumber;

public class DigitThree{
	public static String PrintDigitLine(int line, char s) {
		switch (line) {
		case 1:
			return ""+s+s+s+s+s+s+" ";
		case 2:
			return "     "+s+" ";
		case 3:
			return "     "+s+" ";
		case 4:
			return ""+s+s+s+s+s+s+" ";
		case 5:
			return "     "+s+" ";
		case 6:
			return "     "+s+" ";
		case 7:
			return ""+s+s+s+s+s+s+" ";
		default:
			return "";
		}
	}	
}
