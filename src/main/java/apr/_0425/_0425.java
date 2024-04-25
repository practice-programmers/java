package apr._0425;

public class _0425 {
    public int solution(String myString, String pat) {
        String answer = "";
        for(int i = 0; i < myString.length(); i++) {
            if(myString.charAt(i) == 'A') answer += 'B';
            else if(myString.charAt(i) == 'B') answer += 'A';
        }
        if(answer.contains(pat)) return 1;
        else return 0;
    }
}
