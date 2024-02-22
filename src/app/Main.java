package app;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("Джон", "+380992257984"));
        users.add(new User("Маша", "+380758813579"));
        users.add(new User("Пітер", "+380749978561"));
        users.add(new User("Лейла", "+380945521478"));
        users.add(new User("Вася", "+380975586145"));

        Consumer<User> userConsumer = user -> System.out.println("Ім'я: " + user.getName() + ", Телефон: " + user.getPhone());

        UserProcessor.processUsers(users, userConsumer);
    }
}
