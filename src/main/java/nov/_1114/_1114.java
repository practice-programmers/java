package nov._1114;

import java.lang.reflect.Array;
import java.util.Arrays;

public class _1114 {
    public int[] solution(int start_num, int end_num) {
        //list 길이 설정
        int listLength = end_num - start_num + 1;
        int[] answer = new int[listLength];
        //for문으로 리스트에 넣기
        if(start_num >= 0 && start_num <= end_num && end_num <= 50) {
            for (int i = 0; i < listLength; i++) {
                answer[i] = start_num + i;
            }
            return answer;
        }
        return null;
    }

    public static void main(String[] args) {
        _1114 test = new _1114();
        int[] result = test.solution(3,7);
        System.out.println(Arrays.toString(result));
    }
}
