package app;

public class DataProvider {
    UserRepository userRepository;
    public void fillRepository() {
        userRepository.addUser(new User(1, "Alice", "alice@test.com"));
        userRepository.addUser(new User(2, "Bob", "bob@test.com"));
        userRepository.addUser(new User(3, "Tom", "tom@test.com"));
        userRepository.addUser(new User(4, "John", "john@test.com"));
        userRepository.addUser(new User(5, "Peter", "peter@test.com"));
    }
}
