package Lv0;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Q_181891 {
    public static class Solution {
        public int[] solution(int[] num_list, int n) {
            int[] answer = new int[num_list.length];

            int index = 0;

            for(int i=n; i<num_list.length; i++ ,index++){
                answer[index] = num_list[i];
            }
            for(int i=0; i<n; i++,index++){
                answer[index] = num_list[i];
            }

            return answer;
        }
    }
}
