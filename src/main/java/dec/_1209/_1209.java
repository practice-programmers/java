package dec._1209;

import java.lang.reflect.Array;
import java.util.Arrays;

public class _1209 {
    public int[] solution(int[] num_list) {
        Arrays.sort(num_list);
        return Arrays.copyOfRange(num_list, 5, num_list.length);
    }
}
