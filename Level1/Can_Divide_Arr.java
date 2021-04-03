package Level1;
import java.util.*;
public class Can_Divide_Arr {
    public static int[] solution(int[] arr, int divisor) {
        
        List<Integer> list = new ArrayList<>();
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i]%divisor==0){
                list.add(arr[i]);
            }
        }
        
        if(list.size()==0){
            return new int[]{-1};
        }
        
        int[] answer = new int[list.size()];
        for(int i=0;i<list.size();i++){
            answer[i]=list.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] arr1={5,9,7,10};
        int[] arr2={2,36,1,3};
        int[] arr3={3,2,6};
        System.out.println(Arrays.toString(solution(arr1,5)));
        System.out.println(Arrays.toString(solution(arr2,1)));
        System.out.println(Arrays.toString(solution(arr3,10)));
    }
}

