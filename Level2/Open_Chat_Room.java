package Level2;
import java.util.*;
public class Open_Chat_Room {
    public static String[] solution(String[] record) {
        //기록을 남길 List 생성
        List<String> result = new ArrayList<>();
        // Key:Id  value:닉네임 을넣고 저장 
        Map<String,String> Id = new HashMap<>();
        for(int i=0;i<record.length;i++){
            String[] temp=record[i].split(" ");
            //Enter일경우
            if(temp[0].equals("Enter")){
                //동일한 Id가 다시들어왓다면, 닉네임 Change 
                if(Id.containsKey(temp[1])){
                    Id.replace(temp[1],temp[2]);
                    result.add(temp[1]+"님이 들어왔습니다.");
                    continue;
                }
                Id.put(temp[1],temp[2]);
                result.add(temp[1]+"님이 들어왔습니다.");
            }
            //Leave인 경우
            else if(temp[0].equals("Leave")){
                result.add(temp[1]+"님이 나갔습니다.");
            }
            //Change 인경우
            else if(temp[0].equals("Change")){
                Id.replace(temp[1],temp[2]);
            }
        }  
        // 아이디+문장 형식으로 저장된 List 배열을 
        // 닉네임+문장 으로 수정      
        String[] answer=new String[result.size()];      
        for(int i=0;i<result.size();i++){
            //id만 빼오기위해, 0부터 indexOf("님")까지 substring 
            int idx=result.get(i).indexOf("님");
            String id=result.get(i).substring(0,idx);
            answer[i]=Id.get(id)+result.get(i).substring(idx);
        }
        
        return answer;
    }
    
    public static void main(String[] args) {
        String[] record={"Enter uid1234 Muzi", "Enter uid4567 Prodo",
        "Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
        System.out.println(Arrays.toString(solution(record)));
    }
}
