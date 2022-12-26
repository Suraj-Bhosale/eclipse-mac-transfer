package subarray;

public class Count_Increasing_Subarrays {

	public static void main(String[] args) {

			int N = 6;
			int Arr[] = {1, 3, 3, 2, 3, 5};
			//Output: 4
//			Explanation:
//			(1,3), (2, 3), (3, 5) and (2, 3, 5)
//			are the only increasing subarrays.

	}

	//Very Bad TC
    int countIncreasing(int arr[], int n) {
        int count=0;
		 for(int i=0;i<n;i++){
		     for(int j=i+1;j<n;j++){
		       
		         if(arr[j]>arr[j-1]){
		             count++;
		         }
		         else{
		             break;
		         }
		     }
		 }
		 return count;
	}

}
