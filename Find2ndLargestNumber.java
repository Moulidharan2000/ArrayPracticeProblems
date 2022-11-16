package Day3__AssignmentProblems;

public class Find2ndLargestNumber {
	public static int getSecondLargestNumber(int[] arr, int num) {
	int temp = 0 ;
	for(int i=0; i<num; i++) {
		if(arr[i]>temp) {
				temp = arr[i];
			}
		}
	return arr[num-2];
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] {1,2,3,4,5,6,7,8,9,10};
		System.out.println("Second Largest Number in the Array : "+getSecondLargestNumber(arr,10));
	}
}


