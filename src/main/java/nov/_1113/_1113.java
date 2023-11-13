package nov._1113;

public class _1113 {
    public String solution(String myString) {
        String answer = "";
        if (!myString.isEmpty() && myString.length() <= 100000) {
            answer = myString;
            return answer.toUpperCase();
        }
        return "error";
    }

    public static void main(String[] args) {
        _1113 test = new _1113();
        System.out.println(test.solution("test"));
    }
}
