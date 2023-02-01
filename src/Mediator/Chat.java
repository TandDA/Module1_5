package Mediator;

public interface Chat {
    void sendMessage(String message, User user, User receiver);
}