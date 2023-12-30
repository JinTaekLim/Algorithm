package Lv0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q_181893 {
    public static class Solution {
        public int[] solution(int[] arr, int[] query) {
            int[] answer = arr;


            for(int i=0; i<query.length; i++)
            {
                if(i % 2 == 0) {
                    System.out.println("짝수 " + i);
                    answer = Arrays.copyOfRange(answer, 0 ,query[i] + 1);
                }
                else{
                    System.out.println("홀수 " + i);
                    answer = Arrays.copyOfRange(answer, query[i] ,answer.length);
                }

                for( int a : answer){
                    System.out.print(" "+a);
                }
                System.out.println(" ");
            }
            return answer;
        }
    }
}
