package aug._0812;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _0812_2 {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> answer = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % divisor == 0) {
                answer.add(arr[i]);
            }
        }
        if(answer.isEmpty()) {
            answer.add(-1);
        }
        answer.toArray(new Integer[answer.size()]);
        return Arrays.stream(answer.toArray(new Integer[answer.size()])).sorted().mapToInt(i -> i).toArray();
    }
}
