package cmpt220;

import java.util.ArrayList;

public class Problem133Thiele {

	
	public static void main(String[] args) {

		ArrayList<Number> list = new ArrayList<>();
		
		list.add(45);
		list.add(8);
		list.add(16);
		list.add(11);
		list.add(3);
		
		sort(list);
		
		System.out.print(list.toString());
	}
		
		
	public static void sort(ArrayList<Number> list) {

	        for (int i = 0; i < list.size() - 1; i++) {
	            Number currentMin = list.get(i);
	            int currentIndex = i;

	            for (int j = i + 1; j < list.size(); j++) {
	                if (list.get(j).doubleValue() < currentMin.doubleValue()) {
	                    currentMin = list.get(j);
	                    currentIndex = j;
	                }
	            }

	            if (currentIndex != i) {
	                list.set(currentIndex, list.get(i));
	                list.set(i, currentMin);
	            }
	        }

	    }

	}
	

