package algorithm.day6;

public class BuyStock {
    private int buyStock(int[] price) {
        int sum = 0;
        for (int i = 1; i < price.length; i++) {
            if (price[i] > price[i - 1]) {
                int temp = price[i] - price[i - 1];
                System.out.println("price[i] - price[i - 1]" +price[i] +"-" +price[i - 1]);
                sum += temp;
            }
        }
        System.out.println(sum);
        return sum;
    }

    public static void main(String[] args) {
        int[] price = {7, 1, 5, 3, 6, 4};
        BuyStock buyStock = new BuyStock();
        buyStock.buyStock(price);
    }
}
