package aug._0816;

public class _0816_2 {
    public String solution(int n) {
        String answer = "";
        if(n % 2 != 0) {
            answer = "수박".repeat((n - 1) / 2) + "수";
        } else {
            answer = "수박".repeat(n / 2);
        }
        return answer;
    }
}
