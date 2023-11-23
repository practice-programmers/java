package nov._1123;

public class _1123 {
    public int solution(int[] num_list) {
        arrayLengthValidation(num_list);
        arrayValidation(num_list);
        int answer = 0;
        for(int i = 0; i < num_list.length; i++) {
            if (num_list[i] < 0) return i;
        }
        return -1;
    }

    private void arrayValidation(int[] numList) {
        for(int i = 0; i < numList.length; i++) {
            if(numList[i] < -10 || numList[i] > 100)
                throw new IllegalArgumentException("배열의 원소는 -10 이상 100 이하의 정수입니다.");
        }
    }

    private void arrayLengthValidation(int[] numList) {
        if(numList.length < 5 || numList.length > 100)
            throw new IllegalArgumentException("배열의 길이는 5 이상 100 이하입니다.");
    }

    public static void main(String[] args) {
        _1123 test = new _1123();
        System.out.println(test.solution(new int[]{1,3,-1,3,3}));
    }
}
