package ba.Vjezbe;

import java.util.Arrays;

public class Task5 {

	public static void main(String[] args) {

		int[] arr1 = new int[0];

		getMax(2, 3);
		getMax(arr1);
	}

	public static void getMax(double a, double b) {
		System.out.println(a > b ? a : b);
	}

	public static void getMax(int[] a) {

		int[] arr2=new int[0];
		
		for (int i=0;i<a.length;i++){
			a[i]+=Math.random()*9+1;
		}
		
		for (int i=0;i<a.length;i++){
		
			if (i==4) {
				if (a[i-1]>a[i]) {
					arr2[0]=a[i-1];
				}else if (a[i-1]<a[i]) {
					arr2[0]=a[i];
				}
			}else if (i!=4) {			
				if (a[i+1]>a[i]) {
				arr2[0]=a[i+1];
			}else if (a[i+1]<a[i]) {
				arr2[0]=a[i];
			}
		}
		}
		
		System.out.println(Arrays.toString(arr2));
	}
}
