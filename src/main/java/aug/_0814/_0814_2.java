package aug._0814;

import java.util.Arrays;

public class _0814_2 {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length - 1];
        if(arr.length == 1) {
            return new int[]{-1};
        }
        int min = Arrays.stream(arr).min().getAsInt();
        for(int i = 0, j = 0; i < arr.length; i++) {
            if(arr[i] == min) {
                continue;
            }
            answer[j++] = arr[i];
        }
        return answer;
    }
}
