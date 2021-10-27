package by.dvn.senla;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import by.dvn.printNumber.PrintNumber;
import by.dvn.sentenceParsing.SentenceParsing;
import by.dvn.simpleMultipliers.SimpleMultipliers;
import by.dvn.sumOfDigits.SumOfDigits;
import itemToSafe.Item;
import itemToSafe.ItemToSafe;
import itemToSafe.Safe;

public class SenlaTask {

	public static void main(String[] args) throws IOException {
		// 1.
		System.out.println("Task 1:");
		System.out.println("Sum of digits at string 'aa1d2f30' = " + new SumOfDigits("aa1d2f30").getSumOfDigits());
		System.out.println("");
		
		// 2/
		System.out.println("Task 2:");
		int n = 0;
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter number: ");
		String str = scn.next();
		try {
			n = Integer.parseInt(str);
			System.out.println("All simple multipliers of number: " + SimpleMultipliers.getSimpleMultipliersOfNumber(n).toString());
		} catch (Exception e) {
			System.out.println("Wrong argument`s value!");
			n = 0;
		}
		scn.close();
		System.out.println("");
		
		// 3.
		System.out.println("Task 3:");
		SentenceParsing sp = new SentenceParsing(" а когда придут  актеры и куда они пойдут");
		sp.printNumberOfVowelsInWords();
		sp.printSortWordsByNumberOfVowels();
		sp.makeFirstVowelInWordUppercase();
		System.out.println(sp.toString());
		System.out.println("");
		
		// 4.
		System.out.println("Task 4:");
		PrintNumber pn = new PrintNumber(1789023456);
		pn.printNumber('*');
		System.out.println("");

		// 5.
		System.out.println("Task 5:");
		ArrayList<Item> arrList = new ArrayList<Item>();
		arrList.add(new Item("Item 1", 3, 5));
		arrList.add(new Item("Item 2", 1, 1));
		arrList.add(new Item("Item 3", 2, 3));
		Safe safe = new Safe(6);
		
		ItemToSafe.getListOfItemsOfMaxPriceForSafe(arrList, safe);
		System.out.println("");
	
	}

}
