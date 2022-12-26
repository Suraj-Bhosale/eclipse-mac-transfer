package two_pointers;

public class remove_dublicate {

	public static void main(String[] args) {
		int[] arr = {1,2,3,3,4,4,5};
		int ans = removeDuplicates(arr);
		System.out.println(ans);
//		for(int j = 0; j < arr.length; j++){
//			System.out.print(arr[j] + " ");
//		}
		
	}
	
    public static int removeDuplicates(int[] arr) {
        //define 2 indexes i,j:
        //i increments slower than j
        int i = 0, j = 0;
        
        for(j = 0; j < arr.length; j++){
            //Let index j increment first and check if the indexed element is different than the element at index i
            //if a different element is found at j, increment i and update it to the new value to form a non-repetitive array
            if(arr[j] != arr[i]){
                i++;
                arr[i] = arr[j];
            }
        }
        
        //The first k element = nums[0...i]
        return i+1;
    }


}
