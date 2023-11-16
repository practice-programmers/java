package nov._1116;

public class _1116 {
    public int solution(String n_str) {
        int answer = 0;
        //validation check
        lengthValidation(n_str);

        try {
            answer = Integer.parseInt(n_str);
            return answer;
        } catch (NumberFormatException ex) {
           throw new NumberFormatException("숫자를 입력하세요");
        }
    }

    private void lengthValidation(String nStr) {
        if (nStr.isEmpty() && nStr.length() >= 5) throw new IllegalArgumentException();
    }

    public static void main(String[] args) {
        _1116 test = new _1116();
        System.out.println(test.solution("1284"));
    }
}
