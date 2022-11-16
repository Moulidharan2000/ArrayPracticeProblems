package Day3__AssignmentProblems;

public class ArrayElementsinEvenPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = new int[] {1,2,3,4,5,6,7,8,9,10};
		System.out.println("Elements in Even Position : ");
		for(int i=1; i<ar.length; i+=2) {
			System.out.println(ar[i]);
		}
	}

}
