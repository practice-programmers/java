package nov._1122;

public class _1122 {
    public int solution(String my_string, String is_prefix) {
        int answer =0;
        lengthValidation(my_string, is_prefix);
        //my_string 쪼개기
        String[] string = my_string.split("");
        //is_prefix 쪼개기
        String[] prefix = is_prefix.split("");
        if(my_string.length() < is_prefix.length()) {
            return 0;
        } else {
            for (int i = 0; i < is_prefix.length(); i++) {
                if (prefix[i].equals(string[i])) answer = 1;
                else return 0;
            }
        }
        return answer;
    }

    private void lengthValidation(String myString, String isPrefix) {
        if(myString.length() < 1 || myString.length() > 100 || isPrefix.length() < 1 || isPrefix.length() > 100)
            throw new IllegalArgumentException("문자열은 1이상 100이하의 숫자여야 합니다.");
    }

    public static void main(String[] args) {
        _1122 test = new _1122();
        System.out.println(test.solution("banana", "nan"));
    }
}
