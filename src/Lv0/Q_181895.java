package Lv0;

public class Q_181895 {
    public static class Solution {
        public int[] solution(int[] arr, int[][] intervals) {
            int[] answer = new int[( intervals[0][1] - intervals[0][0] + 1) + (intervals[1][1] - intervals[1][0] + 1)];

            int index = 0;

            for(int A = 0; A<2; A++) {
                for (int i = intervals[A][0]; i <= intervals[A][1]; i++, index++) {
                    answer[index] = arr[i];
                }
            }

            return answer;
        }
    }
}
