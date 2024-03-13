package app;

import java.util.Arrays;
import java.util.List;

public class DataRepository {
    public List<User> getData() {
        return Arrays.asList(
                new User("Roman", "roman@gmail.com"),
                new User("Artem", "artem123@gmail.com"),
                new User("Bill", "bill@gmail.com"),
                new User("Bob", "bob@gmail.com"),
                new User("Tom", "tom123@gmail.com")
        );
    }
}
