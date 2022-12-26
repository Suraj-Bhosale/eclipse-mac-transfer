package String;

import java.util.Stack;

public class Largest_Rectangular_Area_Histogram {

	public static void main(String[] args) {
		int hist[] = { 6, 2, 5, 4, 5, 1, 6 };
        System.out.println("Maximum area is " + getMaxArea(hist, hist.length));

	}

	private static int getMaxArea(int[] arr, int length) {
		Stack<Integer> st = new Stack<>();
		
		
		int max_area = 0, top, max_top_area, i = 0;
		
		while(i < length) {
			if(st.isEmpty() || arr[st.peek()] <= arr[i]) {
				st.push(i++);
			}
			else {
				top = st.peek();
				st.pop();
				
				max_top_area = arr[top] * (st.isEmpty() ? i : i - st.peek() - 1);
				
				
				if(max_area < max_top_area) {
					max_area = max_top_area;
				}
			}
			
		}
		
		
		while(st.isEmpty() == false) {
		
				top = st.peek();
				st.pop();
				
				max_top_area = arr[top] * (st.isEmpty() ? i : i - st.peek() - 1);
				
				
				if(max_area < max_top_area) {
					max_area = max_top_area;
				}
			
		}
		return max_area;
	}

}
