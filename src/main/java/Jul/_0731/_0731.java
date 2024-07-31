package Jul._0731;

public class _0731 {
    public double solution(int[] arr) {
        double answer = 0;
        int length = arr.length;
        for(int i = 0; i < length; i++) {
            answer += arr[i];
        }
        answer /= length;
        return answer;
    }
}
