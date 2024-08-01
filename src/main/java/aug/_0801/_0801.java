package aug._0801;

import java.util.stream.Stream;

public class _0801 {
    public int solution(int n) {
        int answer = 0;
        int[] arrNum = Stream.of(String.valueOf(n).split("")).mapToInt(Integer::parseInt).toArray();
        for(int i = 0; i < arrNum.length; i++) {
            answer += arrNum[i];
        }
        return answer;
    }
}
