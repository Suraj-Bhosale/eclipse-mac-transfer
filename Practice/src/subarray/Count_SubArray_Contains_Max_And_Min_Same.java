package subarray;

public class Count_SubArray_Contains_Max_And_Min_Same {

	
    static int calculate(int a[], int n)
    {
        // stores the answer
        int ans = 0;
 
        // loop to traverse from 0-n
        for (int i = 0; i < n; i++) {
 
            // start checking subarray from
            // next element
            int r = i + 1;
 
            // traverse for finding subarrays
            for (int j = r; j < n; j++) {
 
                // if the elements are same then
                // we check further and keep a
                // count of same numbers in 'r'
                if (a[i] == a[j])
                    r += 1;
                else
                    break;
            }
 
            // the no of elements in between r
            // and i with same elements.
            int d = r - i;
 
            // the no. of subarrays that can be
            // formed between i and r
            ans += (d * (d + 1) / 2);
 
            // again start checking from the next
            // index
            i = r - 1;
        }
 
        // returns answer
        return ans;
    }
     
    // Driver program to test above functions
    public static void main(String[] args)
    {
    int a[] = {  2, 4, 5, 3, 3, 3 };
    System.out.println(calculate(a, a.length));
    }
}
