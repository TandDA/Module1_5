package Mediator;

public class Run {
    public static void main(String[] args) {
        СorporateСhat chat = new СorporateСhat();

        User employer = new Employer(chat, "Employer");
        User worker1 = new Worker(chat, "Worker 1");
        User worker2 = new Worker(chat, "Worker 2");

        chat.setEmployer(employer);
        chat.addWorkerToChat(worker1);
        chat.addWorkerToChat(worker2);

        employer.sendMessage("Задание для тебя следующие:...",worker1);
        worker1.sendMessage("Все сделанно...",employer);
        employer.sendMessage("Сегодня выходной",null);
    }
}
