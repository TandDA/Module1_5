package Mediator;

public interface User {
    void sendMessage(String message, User receiver);

    void getMessage(String message, User sender);

    String getName();
}