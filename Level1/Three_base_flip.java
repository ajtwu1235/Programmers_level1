package Level1;

class Theree_base_flip {
    public static int solution(int n) {
        int answer = 0;
        String temp="";
        while(n!=0){
            temp=n%3+temp; 
            n/=3;
        }
        String[] st =temp.split("");
        for(int i=0;i<st.length;i++){
            answer+=Math.pow(3,i)*Integer.parseInt(st[i]);
        }
        return answer;
    }


public static void main(String[] args) {
    System.out.println(solution(45));
    System.out.println(solution(125));
}
}