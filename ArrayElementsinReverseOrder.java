package Day3__AssignmentProblems;

public class ArrayElementsinReverseOrder {
	public static void main(String[] args) {
		int[] ar = new int[] {1,2,3,4,5};
		System.out.print("Array Elements : ");
		for(int i=0; i<ar.length; i++) {
			System.out.print(ar[i]+" ");
		}
		System.out.println();		
		System.out.print("Array Elements in Reverse Order : ");
		for(int i=ar.length-1; i>=0; i--) {
			System.out.print(ar[i] + " ");
		}
	}

}
