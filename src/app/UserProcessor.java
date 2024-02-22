package app;

import java.util.List;
import java.util.function.Consumer;

public class UserProcessor {
    public static void processUsers(List<User> users, Consumer<User> consumer) {
        for (User user : users) {
            consumer.accept(user);
        }
    }
}

