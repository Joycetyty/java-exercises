//資三B 06156288 郭家柔
public class A2_06156288 {
    public static void main(String[] args) {

        Stock stock1 = new Stock("ORCL", "Oracle Corporation");
        stock1.setCurrentPrice(34.5);
        stock1.setCurrentPrice(34.35);
        System.out.println("Stock name: " + stock1.getName() + " Symbol: " + stock1.getSymbol());
        System.out.println("previous price: " + stock1.getPreviousClosingPrice());
        System.out.println("current price: " + stock1.getCurrentPrice());
        System.out.println("Percent changed: " + stock1.getChangePercent());

    }
}
