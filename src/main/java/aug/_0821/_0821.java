package aug._0821;

public class _0821 {
    public boolean solution(String s) {
        return s.length() == 4 && s.chars().allMatch(Character::isDigit) || s.length() == 6 && s.chars().allMatch(Character::isDigit);
    }

    public static void main(String[] args) {
        _0821 test = new _0821();
        System.out.println(test.solution("s234"));
    }
}
