package Lv0;

public class Q_181892 {
    public static class Solution {
        public int[] solution(int[] num_list, int n) {
            int[] answer = new int[num_list.length-(n-1)];
            System.out.println(num_list.length + " - " + n + " = 길이 : " +answer.length);

            int index = 0;

            for(int i=n; i<num_list.length+1; i++,index++){
                answer[index] = num_list[i-1];
                System.out.println(num_list[i-1]);
            }
            return answer;
        }
    }
}
