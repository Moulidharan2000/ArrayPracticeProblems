package Day3__AssignmentProblems;

public class FrequencyofElementsinArray {
	public static void main(String[] args) {
		int[] ar = new int[] {1,2,3,4,5,5,5,2,3,2};
		int[] fr = new int[ar.length];
		int visit = -1;
		for(int i=0; i<ar.length; i++) {
			int count = 1;
			for(int j=i+1; j<ar.length; j++) {
				if(ar[i] == ar[j]) {
					count++;
					fr[j] = visit;
				}
			}
			if(fr[i] != visit) {
				fr[i] = count;
			}
		}
		for(int i=0; i<fr.length; i++) {
			if(fr[i] != visit) {
				System.out.println(ar[i]+" | "+fr[i]);
			}
		}
	}

}
