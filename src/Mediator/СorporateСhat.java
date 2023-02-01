package Mediator;

import java.util.ArrayList;
import java.util.List;

public class СorporateСhat implements Chat {
    User employer;
    List<User> users = new ArrayList<>();

    public void setEmployer(User employer) {
        this.employer = this.employer;
    }

    public void addWorkerToChat(User user) {
        this.users.add(user);
    }

    @Override
    public void sendMessage(String message, User sender, User receiver) {
        if(receiver == null){
            for(User u : users){
                if(u!= receiver){
                    u.getMessage(message,sender);
                }
            }
        }
        else receiver.getMessage(message,sender);
    }
}