package Day3__AssignmentProblems;

import java.util.Scanner;

public class LargestElementinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Element : ");
		int n = scan.nextInt();
		int[] ar = new int[10];
		for(int i=0; i<n; i++) {
			ar[i]=scan.nextInt();
		}
		int max = ar[0];
		for(int i=0; i<ar.length; i++) {
			if(ar[i] > max) {
				max = ar[i];
			}
		}
		System.out.println("Largest Element in Array : "+ max);
	}

}
