package Lv0;

import java.util.ArrayList;
import java.util.Arrays;

public class Q_181897 {

    public static class Solution {
        public int[] solution(int n, int[] slicer, int[] num_list) {

            ArrayList<Integer> arrList = new ArrayList<Integer>();
            int j = 0,k = num_list.length-1,l = 1;

            switch (n){
                case 1:
                    k = slicer[1];
                    break;

                case 2:
                    j = slicer[0];
                    break;

                case 3:
                    j = slicer[0];
                    k = slicer[1];
                    break;

                case 4:
                    j = slicer[0];
                    k = slicer[1];
                    l = slicer[2];
                    break;
            }

            for(int i = j; i <= k ; i = i+l){
                arrList.add(num_list[i]);
            }

            int[] answer = new int[arrList.size()];
            for (int i = 0; i < arrList.size(); i++) {
                answer[i] = arrList.get(i);
            }

            return answer;
        }
    }

}
