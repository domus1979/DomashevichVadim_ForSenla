package itemToSafe;

import java.util.ArrayList;
import java.util.Iterator;

public class ItemToSafe {
	
	public static void getListOfItemsOfMaxPriceForSafe(ArrayList<Item> arrItem, Safe safe) {
		int n = arrItem.size();
		int w = safe.getWeight();
		
		int[][] arrPrice = new int[n + 1][w + 1];
		
		for (int j = 0; j < w; j++) {
			arrPrice[0][j] = 0;
		}
		
		// Find max price of item, which are placed in the safe. 
		for (int i = 1; i <=n; i++) {
			for (int j = 0; j <= w; j++) {
				if (j <= arrItem.get(i - 1).getWeight() - 1) {
					arrPrice[i][j] = arrPrice[i - 1][j];
				}
				else {
					if (arrPrice[i - 1][j] >= arrPrice[i][j - arrItem.get(i - 1).getWeight()] + arrItem.get(i - 1).getPrice()) {
						arrPrice[i][j] = arrPrice[i - 1][j];
					}
					else {
						arrPrice[i][j] = arrPrice[i][j - arrItem.get(i - 1).getWeight()] + arrItem.get(i - 1).getPrice();
					}
					
				}
			}
		}
		
		// Determining the count of each item
		int pr = arrPrice[n][w]; 
		int i = n;
		int j = w;
		while (pr > 0 && j >= 0 && i >= 0) {
			if (j - arrItem.get(i - 1).getWeight() >= 0 && arrPrice[i][j - arrItem.get(i - 1).getWeight()] == pr - arrItem.get(i - 1).getPrice()) {
				// Add 1 to put number for item
				arrItem.get(i - 1).setPutNumber(arrItem.get(i - 1).getPutNumber() + 1);
				
				j -= arrItem.get(i - 1).getWeight();
				pr -= arrItem.get(i - 1).getPrice();
			}
			else {
				i--;
			}
		}

		System.out.println("Safe volume = " + safe.getWeight());
		System.out.println("Weight and price each item:");
		Iterator<Item> itr = new ArrayList().iterator();
		for (Item item : arrItem) {
			System.out.println(item.getName() + ": " + item.getWeight() + ", " + item.getPrice());
		}
		
		System.out.println("Max price of items, that placed in the safe = " + arrPrice[n][w]);
		System.out.println("Item, that placed in the safe:");
		for (Item item : arrItem) {
			if (item.getPutNumber() > 0) {
				System.out.println(item.getName() + " put " + item.getPutNumber() + " times!");
			}
		}
	}
}
