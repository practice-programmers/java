package dec._1203;

public class _1203 {
    public int solution(int n, String control) {
        int result = n;
        String[] arr = control.split("");
        for (String index : arr) {
            switch (index) {
                case "w":
                    result += 1;
                    break;
                case "s":
                    result -= 1;
                    break;
                case "d":
                    result += 10;
                    break;
                case "a":
                    result -= 10;
                    break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        _1203 test = new _1203();
        System.out.println(test.solution(0, "wsdawsdassw"));
    }
}
