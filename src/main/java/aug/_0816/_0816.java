package aug._0816;

public class _0816 {
    public String solution(String s) {
        if(s.length() % 2 == 0) {
            return s.charAt(s.length() / 2 - 1) + "" + s.charAt(s.length() / 2);
        } else {
            return s.charAt(s.length() / 2) + "";
        }
    }
}
