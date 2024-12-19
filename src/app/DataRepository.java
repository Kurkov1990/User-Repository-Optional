package app;

import java.util.Arrays;
import java.util.List;

public class DataRepository {

    public List<User> getData() {
        return Arrays.asList(
        new User(1, "Alice", "alice@test.com"),
        new User(2, "Bob", "bob@test.com"),
        new User(3, "Tom", "tom@test3.com"),
        new User(4, "John", "john@test4.com"),
        new User(5, "Peter", "peter@test.com"));
    }
}
