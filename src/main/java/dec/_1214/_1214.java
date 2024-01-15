package dec._1214;

import java.util.Arrays;

public class _1214 {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        //n부터의 값 먼저 넣기
        System.arraycopy(Arrays.copyOfRange(num_list, n, num_list.length - 1), 0, answer, 0, num_list.length - n);
        //0부터 n까지의 값 넣기
        System.arraycopy(Arrays.copyOfRange(num_list, 0, n - 1), 0, answer, num_list.length - n, n + 1);
        return answer;
    }
}
