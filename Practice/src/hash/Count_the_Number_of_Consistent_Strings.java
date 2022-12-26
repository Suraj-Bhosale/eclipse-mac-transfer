package hash;

import java.util.HashMap;

public class Count_the_Number_of_Consistent_Strings {

	public static void main(String[] args) {
//		Input: allowed = "ab", words = ["ad","bd","aaab","baa","badab"]
//				Output: 2
//				Explanation: Strings "aaab" and "baa" are consistent since they only contain characters 'a' and 'b'.

	}
	
    public int countConsistentStrings(String allowed, String[] words) {
        
        HashMap<Character, Integer> map= new HashMap<>();
        for(int i=0;i<allowed.length();i++){
            map.put(allowed.charAt(i),1);
        }
        int res =words.length;
        for(String word: words){
         
            for(int i=0;i<word.length();i++){
                char match= word.charAt(i);
                if(map.containsKey(match)==false) {
                     res--;
                     break;
                }
               
            }
            
        }
        
        return res;
    }

}
