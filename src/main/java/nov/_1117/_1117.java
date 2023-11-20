package nov._1117;

public class _1117 {
    public int solution(int[] num_list) {
        listLengthCheck(num_list);
        arrayCheck(num_list);
        int answer = 0;
        if(num_list.length >= 11) {
            for (int i = 0; i < num_list.length; i++) {
                answer += num_list[i];
            }
            return answer;
        } else {
            answer = 1;
            for (int i = 0; i < num_list.length; i++) {
                answer *= num_list[i];
            }
            return answer;
        }
    }

    private void arrayCheck(int[] numList) {
        for (int i = 0; i < numList.length; i++) {
            if(numList[i] < 1 || numList[i] > 9 ) throw new NumberFormatException("원소는 1 이상 9 이하의 숫자입니다.");
        }
    }

    private void listLengthCheck(int[] num_list) {
        if (num_list.length < 2 || num_list.length > 20) {
            throw new IllegalArgumentException("배열의 길이는 2 이상 20 이하입니다.");
        }
    }

    public static void main(String[] args) {
        _1117 test = new _1117();
        System.out.println(test.solution(new int[]{1,2,3,4}));
    }
}
