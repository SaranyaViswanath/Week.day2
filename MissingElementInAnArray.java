package week1.day2.classroom.arrays;

import java.util.Arrays;

public class MissingElementInAnArray {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,7,6,8};
		Arrays.sort(arr);
		for (int i=0; i<arr.length;i++)
		{ if(i!=arr[i])
			System.out.println("Ths Sorted Array : "+i+" : "+arr[i]);
		}
		}
}