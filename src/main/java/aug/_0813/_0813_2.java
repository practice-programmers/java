package aug._0813;

public class _0813_2 {
    public String solution(String phone_number) {
        String answer = "";
        for(int i = 0; i < phone_number.length(); i++) {
            if(i < phone_number.length() - 4) answer += "*";
            else answer += phone_number.charAt(i);
        }
        return answer;
    }
}
