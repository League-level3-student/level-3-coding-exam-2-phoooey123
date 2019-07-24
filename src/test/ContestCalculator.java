package test;

import java.util.ArrayList;

public class ContestCalculator {
	Double total1 = 0.0;
	Double total2 = 0.0;

	public ArrayList<Double> calculateWinner(ArrayList<Double> arr1, ArrayList<Double> arr2) {
		for (int i = 0; i < arr1.size(); i++) {
			total1 = total1 + arr1.get(i);
		}
		for (int i = 0; i < arr2.size(); i++) {
			total2 = total2 + arr2.get(i);
		}
		if (total1 > total2) {
			return arr1;
		} else {
			return arr2;
		}

	}
}
