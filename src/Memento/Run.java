package Memento;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        Database database = new Database();
        DatabaseStorage databaseStorage = new DatabaseStorage();

        System.out.println("Создание БД. Version 1.0");
        database.setVersionAndDate("Версия 1.0");

        System.out.println(database);

        System.out.println("Сохраняем текущую версию в databaseStorage...");
        databaseStorage.setSave(database.save());

        System.out.println("Обновляем БД до версии 1.1");

        System.out.println("Что-то сломали...");
        Thread.sleep(2000);
        database.setVersionAndDate("Версия 1.1.");

        System.out.println(database);

        System.out.println("Что-то не так...");

        System.out.println("Откатываемся до версии 1.0");
        database.load(databaseStorage.getSave());

        System.out.println("После отката:");
        System.out.println(database);
    }
}
