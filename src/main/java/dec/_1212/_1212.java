package dec._1212;

public class _1212 {
    public int[] solution(int[] arr, int k) {
        if(k % 2 == 1) {
            for(int i = 0; i < arr.length; i++) {
                arr[i] = arr[i] * k;
            }
        } else if (k % 2 == 0) {
            for(int i = 0; i < arr.length; i++) {
                arr[i] = arr[i] + k;
            }
        }
        return arr;
    }
}
