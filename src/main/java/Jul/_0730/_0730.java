package Jul._0730;

public class _0730 {
    public String solution(int num) {
        String answer = "";
        if(num % 2 == 0) answer = "Even";
        else answer = "Odd";
        return answer;
    }

    public static void main(String[] args) {
        _0730 test = new _0730();
        int num = 3;
        System.out.println(test.solution(num));
    }
}
