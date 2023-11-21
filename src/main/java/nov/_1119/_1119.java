package nov._1119;

public class _1119 {
    public int solution(int[] num_list, int n) {
        lengthValidation(num_list);
        numberValidation(num_list);
        nuValidation(n);
        for(int i = 0; i < num_list.length; i++) {
            if(num_list[i] == n) return 1;
        }
        return 0;
    }

    private void nuValidation(int n) {
        if( n < 1 || n > 100 ) throw new IllegalArgumentException("n은 1이상 100 이하의 정수입니다.");
    }

    private void numberValidation(int[] numList) {
        for(int i = 0; i < numList.length; i++) {
            if(numList[i] < 1 || numList[i] > 100) throw new IllegalArgumentException("배열의 원소는 1 이상 100 이하의 정수입니다.");
        }
    }

    private void lengthValidation(int[] numList) {
        if(numList.length < 3 || numList.length > 100) throw new IllegalArgumentException("배열 길이는 3 이상 100 이하입니다.");
    }

    public static void main(String[] args) {
        _1119 test = new _1119();
        System.out.println(test.solution(new int[]{1,2,3}, 3));
    }


}
