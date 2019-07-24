package test;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapCalculator {
	public ArrayList<String> commonKeyValues(ArrayList<Integer> arr, HashMap<Integer, String> map) {
		ArrayList<String> st = new ArrayList<String>();
		for (int i = 0; i < arr.size(); i++) {
			for (Integer key : map.keySet()) {
				if (key == arr.get(i)) {
					String current = map.get(key);
					st.add(current);
				}
			}
		}
		return st;
	}
}
