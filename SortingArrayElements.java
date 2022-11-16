package Day3__AssignmentProblems;

public class SortingArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] {2,4,3,5,7,8,6,10,1,9};
		int temp = 0;
		System.out.println("Elements of Array : ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1 ; j<arr.length; j++) {
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println();
		System.out.println("Sorted Array in Ascending Order : ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
