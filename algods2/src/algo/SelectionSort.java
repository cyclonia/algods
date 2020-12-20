package algo;

import java.util.Arrays;
import java.util.Comparator;


public class SelectionSort {

	private static void sort(Comparable[] a) {

		for (int i = 0; i < a.length; i++) {
			int min = i;
			for (int j = i + 1; j < a.length; j++) {

				if (less(a[j], a[min])) {
					min = j;
				}
			}
			exch(a, i, min);
		}

		Arrays.stream(a).forEach(System.out::println);
	}

	private static void sort(Object[] b, Comparator<Integer> c) {
		for (int i = 0; i < b.length; i++) {
			int min = i;
			for (int j = i + 1; j < b.length; j++) {
				if(less(c, b[j], b[min])) {
					min = j;
				}
				
			}
			exch(b, i, min);
		}
		Arrays.stream(b).forEach(System.out::println);
	}
	
	
	private static void sort2(Object[] b, Comparator<Student> c) {
		for (int i = 0; i < b.length; i++) {
			int min = i;
			for (int j = i + 1; j < b.length; j++) {
				if(less(c, b[j], b[min])) {
					min = j;
				}
				
			}
			exch(b, i, min);
		}
		Arrays.stream(b).forEach(System.out::println);
	}

	private static void exch(Object[] a, int i, int min) {
		Object swap = a[i];
		a[i] = a[min];
		a[min] = swap;

	}
	
	private static void exch(int[] a, int i, int min) {
		int swap = a[i];
		a[i] = a[min];
		a[min] = swap;

	}
	

	private static boolean less(Comparable c1, Comparable c2) {

		return c1.compareTo(c2) < 0;
	}
	
	private static boolean less(Comparator c, Object o1, Object o2) {

		return c.compare(o1, o2) < 0;
	}

	public static void main(String[] args) {

		String a[] = { "Sunil", "Anil", "Pappu", "Kalia", "Gabbar" };
		Integer b[] = {14,4,2,1,7};
		
		Comparator<String> sc = String.CASE_INSENSITIVE_ORDER;

		Comparator<Integer> c = (e1, e2) ->{
				
				 return e1 < e2 ? -1 :
		               (e1 == e2 ? 0 : 1);
			
		};
		
		Comparator<Student> studentComparator = new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				int nameCompare = o1.getName().compareTo(o2.getName());
				if(nameCompare == 0) {
					
					return o1.getCgpa() > o2.getCgpa()  ? -1: (o1.getCgpa() == o2.getCgpa() ? 0 : 1);
					}else {
					return o1.getName().compareTo(o2.getName());
					}
					
				}
				
				
			
		};
		
		Student[] s = {new Student("Sunil", 2323, 3.75),
					   new Student("Anil", 8483, 3.85),
					   new Student("Rohit", 5543, 3.75),
					   new Student("Anil", 7786, 3.95)
		};

		//sort(a);
		//sort(b, c);
		//sort(b);
		
		sort2(s, studentComparator);
		
	}

}
