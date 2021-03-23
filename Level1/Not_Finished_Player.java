package Level1;
import java.util.*;
public class Not_Finished_Player {
public static String solution(String[] participant, String[] completion) {
        
        Arrays.sort(participant);
        Arrays.sort(completion);
        for(int i=0;i<completion.length;i++){
            if(!completion[i].equals(participant[i])){
                return participant[i];
            }
        }
        return participant[completion.length];
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] part1={"leo","kiki","eden"};
		String[] comp1={"leo","eden"};
        System.out.println(solution(part1,comp1));
			}

}
