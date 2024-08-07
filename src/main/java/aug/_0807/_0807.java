package aug._0807;

import java.util.Arrays;

public class _0807 {
    public long solution(long n) {
        // 정수 내림차순 정렬
        // 1. long -> String -> char[] -> Arrays.sort -> StringBuilder -> long
        char[] arr = Long.toString(n).toCharArray();
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder(new String(arr));
        return Long.parseLong(String.valueOf(sb.reverse()));
    }
}
