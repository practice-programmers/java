package aug._0820;

public class _0820_2 {
    public long solution(int price, int money, int count) {
        long totalPrice = 0;
        for(int i = 1; i <= count; i++) {
            totalPrice += price * i;
        }
        if(totalPrice > money) return totalPrice - money;
        return 0;
    }
}
