package Proxy;

public class TelegramProxy implements Website{
    private final String proxyIp;
    private Telegram telegram;

    public TelegramProxy(String ip) {
        this.proxyIp = ip;
    }
    @Override
    public String load() {
        if(telegram==null)
            telegram = new Telegram(proxyIp);
        return telegram.load();
    }
}
