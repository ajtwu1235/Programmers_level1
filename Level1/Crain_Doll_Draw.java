package Level1;
import java.util.Stack;

public class Crain_Doll_Draw {

	public static int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> s = new Stack<Integer>();
		for(int i=0; i<moves.length; i++) {
			for(int j=0; j<board.length; j++) {
				// 값이 0이면 continue, 
				if(board[j][moves[i]-1] != 0) {
					
					// 스택이 비어있는경우 -> 해당 인형 넣기
					if(s.isEmpty())
						s.push(board[j][moves[i]-1]);
					
					// 스택이 비어있지 않는경우 -> 인형이 동일한지 아닌지 비교
					else {
						// 인형이 동일하면 제거 후 사라진 인형개수 +2
						if(s.peek() == board[j][moves[i]-1]) {
							s.pop();
							answer += 2;
						}
						// 인형이 동일하지 않으면 스택에 인형 넣기
						else {
							s.push(board[j][moves[i]-1]);
						}
					}
					// 해당 작업 끝난 후에는 인형을 빼냈으므로 0으로 만든다.(인형이 없다는 표시)
					board[j][moves[i]-1] = 0;
					break;
				}
			}
		}
        
        return answer;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] board= {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
		int[] moves = {1,5,3,5,1,2,1,4};
		System.out.print(solution(board,moves));
	}

}
