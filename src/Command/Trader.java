package Command;

public class Trader {
    Command buy;
    Command sell;

    public Trader(Command buy, Command sell) {
        this.buy = buy;
        this.sell = sell;
    }
    public void buyRecord(){
        buy.execute();
    }
    public void sellRecord(){
        sell.execute();
    }
}
