package Level1;

public class Sum_betweenAtoB {
    public static long solution(int a, int b) {
        long answer = 0;
        if(a==b){
            answer=a;
        }
        else{
            for(int i=Math.min(a,b);i<=Math.max(a,b);i++){
                answer+=i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(3,6));
        System.out.println(solution(3,3));
        System.out.println(solution(10,6));
    }
}
