package subarray;

public class Count_Subarrays_Between_two_Values {

	public static void main(String[] args) {
		int[] arr = {1, 4, 6};
		int l = 3, r = 8, sum = 0, i = 0, j =0,count = 0;
		int n = arr.length;
		

		 System.out.print(solve(arr,n,r)-solve(arr,n,l-1));
	}
	
	
    static long solve(int A[],int N, long a) {
        int j=0;
         long ans=0;
         long sum=0;
        for(int i=0;i<N;i++){
            sum+=A[i];
            while(sum>a){
                sum-= A[j];
                j++;
            }
            ans+=i-j+1;
            
        }
        return ans;
    }


}
