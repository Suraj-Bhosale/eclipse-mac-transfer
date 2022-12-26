package String;

import java.util.Arrays;

public class isAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

    public boolean isAnagram(String s, String t) {
        int n1 = s.length();
        int n2 = t.length();
        
        if(n1 != n2){
            return false;
        }
        

        
        char[] sc = s.toCharArray();
        char[] tc = t.toCharArray();
        
        Arrays.sort(sc);
        Arrays.sort(tc);
        
        for(int i = 0; i < n1; i++){
            if(sc[i] != tc[i]){
                return false;
            }
        }
        return true;
    }
}
