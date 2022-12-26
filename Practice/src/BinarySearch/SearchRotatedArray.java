package BinarySearch;

public class SearchRotatedArray {

	public static void main(String[] args) {
	       int[] arr = {4,5,6,7,0,1,2};
	       int size = arr.length;
	       int ans =Search(arr,6);
	        System.out.println(ans);
	     //   System.out.println(pivot(arr,size));

	}
	
    static int Search(int nums[], int target)
	{
       int start=0;
        int end=nums.length -1;
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(nums[mid]==target) {return mid;}
          
            if(nums[mid]>=nums[start])
            {
             if(target>=nums[start]&& target<nums[mid])
             {
              end= mid-1;
             }
                else {start=mid+1;}
            }
            else
            {
                  if(target>nums[mid]&& target<=nums[end])
                  {
                       start =mid+1;
                  }
                else {end= mid-1;}
            }

        }
        return -1;
	}
	
	 public static int search(int[] nums, int target) {
	        int pivote = pivot(nums, nums.length);
	        if(nums[nums.length - 1] >= target && target >= nums[pivote]){
	            return binarySearch(nums, nums.length, target, pivote,nums.length - 1 );
	        }
	        else{
	            return binarySearch(nums, nums.length, target, 0,pivote - 1 );
	        }
	    }
	    
	    public static int binarySearch(int[] arr, int leng, int target,int s, int e){
	        int start = s;
			int end = e;
			int mid = (start + end)/2;
			
			while(start <= end) {
				
				if(arr[mid] == target) {
					return mid;
				}
				
				if(target > arr[mid]) {
					start = mid + 1;
				}
				else {
					end = mid - 1;
				}
				
				 mid = (start + end)/2;
			}
			return -1;
	    }
	    
	    public static int pivot(int[] arr, int leng){
			int s = 0;
			int e = leng;
			int m = s + (e - s)/2;
			int ans = -1;
			while(s < e) {
				if(arr[m] >= arr[0]) {
					s = m + 1;
					
				}else {
					e = m;
				}
				
				m = s + (e - s)/2;
			}
			
			return s;
	    }

}


//Optimized

class Solution 
{ 
    static int Search(int nums[], int target)
	{
       int start=0;
        int end=nums.length -1;
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(nums[mid]==target) {return mid;}
          
            if(nums[mid]>=nums[start])
            {
	             if(target>=nums[start]&& target<nums[mid])
	             {
	              end= mid-1;
	             }
	               else {start=mid+1;}
	             }
            else
            {
                  if(target>nums[mid]&& target<=nums[end])
                  {
                       start =mid+1;
                  }
                else {end= mid-1;}
            }

        }
        return -1;
	}
} 
