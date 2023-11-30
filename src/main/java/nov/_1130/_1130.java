package nov._1130;

import java.util.Arrays;

public class _1130 {
    public int[] solution(int[] num_list) {
        int length = num_list.length;
        int[] answer = new int[num_list.length + 1];
        for(int i = 0; i < length; i++) {
            answer[i] = num_list[i];
        }
        if(num_list[length - 1] > num_list[length - 2]) {
            answer[length] = num_list[length - 1] - num_list[length - 2];
        } else {
            answer[length] = num_list[length - 1] * 2;
        }
        return answer;
    }

    public static void main(String[] args) {
        _1130 test = new _1130();
        System.out.println(Arrays.toString(test.solution(new int[]{2, 1, 6})));
    }
}