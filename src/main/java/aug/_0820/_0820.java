package aug._0820;

import java.util.Arrays;

public class _0820 {
    public String solution(String s) {
        char[] array = s.toCharArray();
        Arrays.sort(array);
        String result = new String(array);
        return new StringBuilder(result).reverse().toString();
    }
}
