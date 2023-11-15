package nov._1114;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _1114 {
    public List<Integer> solution(int start_num, int end_num) {
        //list 길이 설정
        List<Integer> answer = new ArrayList<>();
        for(int i = start_num; i <= end_num; i++) {
            answer.add(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        _1114 test = new _1114();
        List<Integer> solution = test.solution(3, 7);
        System.out.println(solution);
    }
}
