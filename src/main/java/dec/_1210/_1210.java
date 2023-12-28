package dec._1210;

public class _1210 {
    public int[] solution(int n, int k) {
        int answer_length = (int) Math.floor(n / k);
        int[] answer = new int[answer_length];
        for (int i = 0; i < answer_length; i++) {
            answer[i] = k * (i + 1);
        }
        return answer;
    }
}
