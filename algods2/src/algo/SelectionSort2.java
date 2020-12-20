package algo;

import java.util.Arrays;

public class SelectionSort2 {

	private static void sort(Comparable[] a) {

		int n = a.length;
        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = i+1; j < n; j++) {
                if (less(a[j], a[min])) {
                	min = j;
                }
            }
            exchange(a, i, min);
        }
		
		Arrays.stream(a).forEach(System.out::println);
	}

	private static void exchange(Object[] a, int i, int j) {
		Object swap = a[i];
        a[i] = a[j];
        a[j] = swap;
	}

	private static boolean less(Comparable v, Comparable w) {
		// TODO Auto-generated method stub
		return v.compareTo(w) < 0;
	}
	
	public static void main(String[] args) {
		String a[] = { "Sunil", "Anil", "Pappu", "Kalia", "Gabbar" };
		sort(a);
	}

}
