package Day3__AssignmentProblems;

import java.util.Scanner;

public class elementsofArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Ente the Elements of Array to store : ");
		int n = scan.nextInt();
		
		int[] ar = new int[5];
		System.out.println("Enter the Elements of Array : ");
		for(int i=0; i<n; i++) {
			ar[i]=scan.nextInt();
		}
		System.out.println("Array Elements : ");
		for(int i=0; i<n; i++) {
			System.out.println(ar[i]);
		}
		

	}

}
