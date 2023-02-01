package Command;

public class Run {
    public static void main(String[] args) {
        Exchange exchange = new Exchange();
        Trader trader = new Trader(
                new BuyCommand(exchange),
                new SellCommand(exchange)
        );

        trader.buyRecord();
        trader.sellRecord();
    }
}
