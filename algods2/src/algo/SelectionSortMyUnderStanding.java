package algo;

import java.util.Arrays;

public class SelectionSortMyUnderStanding {
	
	public static void main(String[] args) {
		String a[] = { "Sunil", "Anil", "Pappu", "Kalia", "Gabbar" };
		sort(a);
	}

	private static void sort(Comparable[] a) {
		
		for (int i = 0; i < a.length; i++) {
			int min = i;
			for (int j = i + 1; j < a.length; j++) {
				
				if(less(a[j], a[min])) {
					min = j;
				}
			}
			exch(a, i, min);
		}
		
		Arrays.stream(a).forEach(System.out::println);
	}

	private static void exch(Object[] a, int i, int min) {
		Object swap = a[i];
		a[i] = a[min];
		a[min] = swap;
	}

	private static boolean less(Comparable v, Comparable w) {
		return v.compareTo(w) < 0;
	}

}
