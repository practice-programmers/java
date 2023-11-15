package nov._1115;

import java.util.Arrays;
import java.util.stream.Stream;

public class _1115 {
    public int[] solution(int[] arr) {
        //결과 넣을 새로운 int[] 생성
        int arrLength = arr.length;
        int[] answer = new int[arrLength];
        //for문으로 arr의 값들 추출해서 계산해서 answer 배열에 넣기
        for(int i = 0; i < arrLength; i++) {
            if(arr[i] >= 50 && arr[i] % 2 == 0) {
                answer[i] = arr[i] / 2;
            } else if (arr[i] < 50 && arr[i] % 2 == 1) {
                answer[i] = arr[i] * 2;
            } else {
                answer[i] = arr[i];
            }
        }
        return answer;
    }
    public int[] newSol(int[] arr) {
        int[] answer = new int[arr.length];
        for (int i : arr) {
            if(i >= 50 && i % 2 == 0) {
                answer[i] = i / 2;
            } else if (i < 50 && i % 2 == 1) {
                answer[i] = i * 2;
            } else {
                answer[i] = i;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        _1115 test = new _1115();
        int[] testArr = {1,50,79};
        int[] result = test.solution(testArr);
        System.out.println(Arrays.toString(result));
    }
}
