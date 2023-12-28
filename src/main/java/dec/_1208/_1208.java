package dec._1208;

public class _1208 {
    public int solution(String my_string, String is_suffix) {
        int suffix_length = is_suffix.length();
        if (my_string.length() >= suffix_length) {
            if ((my_string.substring(my_string.length() - suffix_length)).equals(is_suffix)) {
                return 1;
            } else {
                return 0;
            }
        } else {
            return 0;
        }
    }
}
