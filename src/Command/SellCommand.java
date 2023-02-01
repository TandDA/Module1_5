package Command;

public class SellCommand implements Command{
    Exchange exchange;

    public SellCommand(Exchange exchange) {
        this.exchange = exchange;
    }

    @Override
    public void execute() {
        exchange.sell();
    }
}
