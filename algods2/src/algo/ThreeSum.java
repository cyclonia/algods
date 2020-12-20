package algo;

public class ThreeSum {

	public static int subArraySum(int x, int y, int[] array) {

		int sum = 0;
		for (int i = x; i <= y; i++) {
			sum = sum + array[i];
		}

		return sum;

	}
	
	public static void main(String[] args) {
		int a[] = {30, -40, -20, -10, 40, 0, 10 , 5};
		
		ThreeSum t = new ThreeSum();
		int x = t.threeSumCal(a);
		System.out.println(x);
		
	}
	private int threeSumCal(int a[]) {
		int sum =0;
		int sum2 =0;
		int counter = 0;
		for (int i = 0; i < a.length; i++) {
			
			sum = a[i];
			
			for (int j = 1, k =2; j < a.length; j++) {
				sum2 = a[j] + a[k];
				if(sum + sum2 ==0) {
					counter++;
				}
			}
			
		}
		return counter;
	}
	
	private int threeSumCal2(int a[]) {
		int sum =0;
		int sum2 =0;
		int counter = 0;
		for (int i = 0; i < a.length; i++) {
			
			sum = a[i] + a[i +1];
			
			
			for (int j = 1, k =2; j < a.length; j++) {
				sum2 = a[j] + a[k];
				if(sum + sum2 ==0) {
					counter++;
				}
			}
			
		}
		return counter;
	}

}
