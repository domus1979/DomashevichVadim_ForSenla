package by.dvn.sentenceParsing;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SentenceParsing {
	private String sentence;
	private List<StringBuilder> wordsList;
	
	public SentenceParsing(String sentence) {
		this.sentence = sentence.trim();
		fillInWordsList();
	}
	
	private void fillInWordsList() {
		wordsList = new ArrayList<StringBuilder>();
		int i = 0;
		while (i < sentence.length()) {
			int j = i;
			while (j < sentence.length() && sentence.charAt(j) != ' ') {
				j++;
			}
			if (i != j) {
				wordsList.add(new StringBuilder(sentence.substring(i, j)));
			}
			i = j + 1;
		}
	}
	
	private int numberOfVowels(StringBuilder sb) {
		int n = 0;
		for (int i = 0; i < sb.length(); i++) {
			if ( isSmallRussianVowels(sb.charAt(i)) || isBigRussianVowels(sb.charAt(i)) ) {
				n++;
			}
		};
		return n;
	}
	
	private boolean isSmallRussianVowels(char ch) {
		if (ch == 'à' || ch == 'î' || ch == 'è' || ch == 'ó' || ch == 'û' || 
				 ch == 'ý' || ch == 'å' || ch == '¸' || ch == 'þ' || ch == 'ÿ')
			return true;
		else
			return false;
	}
	
	private boolean isBigRussianVowels(char ch) {
		if (ch == 'À' || ch == 'Î' || ch == 'È' || ch == 'Ó' || ch == 'Û' || 
				 ch == 'Ý' || ch == 'Å' || ch == '¨' || ch == 'Þ' || ch == 'ß') 
			return true;
		else
			return false;
	}
	
	public void printNumberOfVowelsInWords() {
		for (StringBuilder sb : wordsList) {
			System.out.println(sb.toString() + " include " + numberOfVowels(sb) + " vowels.");
		}
	}
	
	public void printSortWordsByNumberOfVowels() {
		List<StringBuilder> sbCopy = new ArrayList<StringBuilder>();
		
		for (StringBuilder sb : wordsList) {
			sbCopy.add(sb);
		}
		
		sbCopy.sort(new Comparator<StringBuilder>() {
			public int compare(StringBuilder sb1, StringBuilder sb2) {
				return numberOfVowels(sb1) - numberOfVowels(sb2);
			};
		});
		
		System.out.println(sbCopy.toString());
	}
	
	public void makeFirstVowelInWordUppercase() {
		for (StringBuilder sb : wordsList) {
			if ( isSmallRussianVowels(sb.charAt(0)) ) {
				sb.replace(0, 1, sb.substring(0, 1).toUpperCase());
			}
		}
	}
	
	@Override
	public String toString() {
		String str = "";
		for (StringBuilder sb : wordsList) {
			str += sb.toString() + " ";
		}
		return str;
	}
}
