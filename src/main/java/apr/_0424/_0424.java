package apr._0424;

import java.util.Arrays;
//미완성
public class _0424 {
    public int[] solution(int[] arr) {
        int answerLength = 0;
        for(int i = 0; i < arr.length; i++) {
           answerLength += arr[i];
        }
        int[] answer = new int[answerLength];
        int section = 0;
        for(int i =0; i < arr.length; i++) {
            section += arr[i];
            for(int j = i; j < section; j++) {
                answer[j] = arr[i];
            }
        }

        //System.out.println(answerLength);

        return answer;
    }

    public static void main(String[] args) {
        _0424 test = new _0424();
        int[] arr = {1, 2, 3, 4};
        System.out.println(Arrays.toString(test.solution(arr)));
    }
}
