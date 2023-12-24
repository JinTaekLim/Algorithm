package Lv0;

public class Q_181894 {
    public static class Solution {
        public int[] solution(int[] arr) {
            int[] answer = {-1};
            int start = -1,end = -1;

            for(int i=0; i<arr.length; i++){
                if(arr[i] == 2) {
                    if(start == -1) start = i;
                    end = i;
                }
            }

            if(start == -1) return answer;
            answer = new int[end-start+1];

            for(int i=0; start<=end; start++,i++){
                answer[i] = arr[start];
            }
            System.out.println(start+" "+end);
            return answer;
        }
    }
}
