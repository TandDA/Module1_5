package Mediator;

public class Worker implements User {
    Chat chat;
    String name;

    public Worker(Chat chat, String name) {
        this.chat = chat;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void sendMessage(String message, User receiver) {
        chat.sendMessage(message, this, receiver);
    }

    @Override
    public void getMessage(String message, User sender) {
        System.out.println(this.name + " получил сообщение от " + sender.getName()+": " + message + ".");
    }
}