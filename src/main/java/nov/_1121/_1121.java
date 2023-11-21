package nov._1121;

import java.util.Arrays;

public class _1121 {
    public String[] solution(String my_string) {
        Validation(my_string);
        String[] answer = my_string.split(" ");
        return answer;
    }

    private void Validation(String myString) {
        if(myString.length() < 1 || myString.length() > 1000)
            throw new IllegalArgumentException("myString의 길이는 1 이상 1000 이하입니다.");
        if(myString.charAt(0) == ' ' ||  myString.charAt(myString.length() - 1) == ' ')
            throw new IllegalArgumentException("제일 앞과 뒤의 문자는 공백이어선 안됩니다.");
    }

    public static void main(String[] args) {
        _1121 test = new _1121();
        System.out.println(Arrays.toString(test.solution("I love you")));
    }
}
