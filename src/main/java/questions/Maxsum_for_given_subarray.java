package questions;

public class Maxsum_for_given_subarray {
	public static void min_subarray() {
		
		// return the max sum for given size of subarray,, this is also solved using sliding window apprach
		int[] num= {1,1,8,2,2,4,8,7,6,4,2};
		int k =3;
		
		int min= Integer.MAX_VALUE;
		int strt=0;
		int sum=0;
		int maxsum=0;
		
		for (int i=0; i<k;i++) {
			sum= sum+num[i];
			maxsum= sum;
			strt=i;
			
					
				}
		
		for (int i=k; i<num.length;i++) {
			sum= sum+num[i]-num[i-k];
			//maxsum=Math.max(maxsum, sum);
			if (sum>maxsum) {
				maxsum=sum;
				strt=i-k+1;
				
			}
		}
		System.out.println(maxsum);
		int[] arr= new int[k];
		for(int j =0; j<k; j++) {
			arr[j]= num[strt+j];
			System.out.print(arr[j]+" ");
		}
			
			
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
