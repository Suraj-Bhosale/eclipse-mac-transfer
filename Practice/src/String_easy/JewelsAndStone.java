package String_easy;

import java.util.HashMap;

public class JewelsAndStone {

	public static void main(String[] args) {
		numJewelsInStones("ab", "abbbccccc");

	}

    public static int numJewelsInStones(String jewels, String stones) {
        HashMap<Character, Integer> map =new HashMap<>();
        
        for(char ch : stones.toCharArray()){
            map.put(ch ,map.getOrDefault(ch , 0)+1);
        }
        
        int count=0;
        for(char ch : jewels.toCharArray()){
            if(map.containsKey(ch)){
               count+= map.get(ch);
            }
        }
        
        return count ; 
    }
}
