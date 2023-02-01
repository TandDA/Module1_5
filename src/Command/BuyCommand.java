package Command;

public class BuyCommand implements Command{
    Exchange exchange;

    public BuyCommand(Exchange exchange) {
        this.exchange = exchange;
    }

    @Override
    public void execute() {
        exchange.buy();
    }
}
