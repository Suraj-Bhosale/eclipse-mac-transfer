package String;

public class Find_Value_After_Operations {

	public static void main(String[] args) {
		
		String[] str = {"--X","X++","X++"};
        int x = 0;
		
        
        for (int i = 0; i < str.length; i++) {
			String y = str[i];
			char z = y.charAt(1);
			if(z == '+') {
				x++;
			}
			
			else {
				x--;
			}
			
		}
        
        System.out.print(x);;
	}

}
