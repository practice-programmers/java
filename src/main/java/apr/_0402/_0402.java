package apr._0402;

public class _0402 {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[((num_list.length - 1)/ n) + 1];
        for(int i = 0; i  < answer.length; i++) {
            answer[i] = num_list[i * n];
        }
        return answer;
    }
}
