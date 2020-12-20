package algo;

import java.util.Arrays;

public class InsertionSort {

	private static void sort(Comparable[] a) {

		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < i; j++) {

				if (a[j].compareTo(a[i]) > 0) {
					Object temp = a[i];
					a[i] = a[j];
					a[j] = (Comparable) temp;
				}

			}
		}

		Arrays.stream(a).forEach(System.out::println);

	}

	public static void main(String[] args) {
		String[] a = { "Sunil", "Anil", "Kalia", "Pappu", "Gabbar" };

		sort(a);
	}

}
