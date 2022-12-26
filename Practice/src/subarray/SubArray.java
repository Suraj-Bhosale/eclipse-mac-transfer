package subarray;
public class SubArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int n = arr.length;

		System.out.println(sumOddLengthSubarrays(arr));
        int result = 0;


//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i+1; j <= arr.length; j+=2) {
//
//                for (int k = i; k < j; k++) {
//                    result+= arr[k];
//                }
//              //  System.out.println();
//            }
//        }
//        System.out.println(result);

	}
	
    public static int sumOddLengthSubarrays(int[] arr) {
        int odd=0;
        int  even=0;
        int res=0;
        for(int i=0;i<arr.length;i++){
            even += arr[i] * ((i/2) +1);
            odd += arr[i]*((i+1)/2);
            if(i%2==0){
               res+=even; 
            }
            else{
                res+=odd;
            }
            
        }
        return res;
        
    }

}
