package Level1;
import java.time.*;
class Solution {
  public static String solution(int a, int b) {
      return LocalDate.of(2016, a, b).getDayOfWeek().toString().substring(0,3);
  }

  public static void main(String[] args) {
      System.out.println(solution(5,24));
  }
}