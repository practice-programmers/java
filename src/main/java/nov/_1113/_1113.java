package nov._1113;

public class _1113 {
    public String solution(String myString) {
        extracted(myString);
        return myString.toUpperCase();
    }

    private static void extracted(String myString) {
        if (myString.isEmpty() || myString.length() > 100000) {
            throw new IllegalArgumentException();
        }
    }

    public static void main(String[] args) {
        _1113 test = new _1113();
        System.out.println(test.solution("test"));
    }
}
