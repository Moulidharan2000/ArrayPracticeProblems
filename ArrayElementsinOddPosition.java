package Day3__AssignmentProblems;

public class ArrayElementsinOddPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = new int[] {1,2,3,4,5,6,7,8,9,10};
		System.out.println("Elements in Odd Position : ");
		for(int i=0; i<ar.length; i=i+2) {
			System.out.println(ar[i]);
			
		}

	}

}
