package Proxy;

public class Run {
    public static void main(String[] args) {
        String myIP = "192.168.123.0";
        Telegram telegram = new Telegram(myIP);
        System.out.println(telegram.load());

        String proxyIP = "132.158.11.0";
        TelegramProxy telegramProxy = new TelegramProxy(proxyIP);
        System.out.println(telegramProxy.load());
    }
}
