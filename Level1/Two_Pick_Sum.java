package Level1;
import java.util.*;

public class Two_Pick_Sum {

	 public static int[] solution(int[] numbers) {
	        TreeSet<Integer> s = new TreeSet<Integer>();
				for(int i=0;i<numbers.length-1;i++) {
					for(int j=i+1;j<numbers.length;j++) {
						s.add(numbers[i]+numbers[j]);
					}
				}
	        
	        int[] answer = new int[s.size()];
	        int index = 0;
	        Iterator itor = s.iterator();
	        while(itor.hasNext()){
	            answer[index] = (int)itor.next();
	            index++;
	        }
				return answer; 
	    }
		
		public static void main(String[] args) {
			int[] num1 = {2,1,3,1,4};
			int[] num2 = {5,0,2,7};
			System.out.println(Arrays.toString(solution(num1)));
			System.out.println(Arrays.toString(solution(num2)));
		}
	}


