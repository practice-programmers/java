package dec._1206;

public class _1206 {
    public int solution(String num_str) {
        int answer = 0;
        for(int i = 0; i < num_str.length(); i++) {
            answer += Character.getNumericValue(num_str.charAt(i));
        }
        return answer;
    }
}
