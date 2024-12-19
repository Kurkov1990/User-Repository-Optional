package app;

import java.util.Scanner;

import static app.Main.appValidator;

public class UserRepositoryDemo {

    static UserRepository userRepository = new UserRepository();
    static Scanner scanner = new Scanner(System.in);

    public void fillRepository() {
        userRepository.addUser(new User(1, "Alice", "alice@test.com"));
        userRepository.addUser(new User(2, "Bob", "bob@test.com"));
        userRepository.addUser(new User(3, "Tom", "tom@test.com"));
        userRepository.addUser(new User(4, "John", "john@test.com"));
        userRepository.addUser(new User(5, "Peter", "peter@test.com"));
    }

    private static void findUserByIdDemo(int id) {
        userRepository.findUserById(id).ifPresentOrElse(user -> System.out.println("Found user by ID: " + user), () -> System.out.println("User with ID " + id + " not found"));
    }

    private static void findUserByEmailDemo(String mail) {
        userRepository.findUserByEmail(mail).ifPresentOrElse(user -> System.out.println("Found user by email: " + user), () -> System.out.println("User with email " + mail + " not found"));
    }

    public void getUsersCountDemo() {
        userRepository.findAllUsers().ifPresentOrElse(users -> {
            System.out.println("\nTotal users: " + users.size());
            users.forEach(System.out::println);
        }, () -> System.out.println("No users found"));
    }

    public static void demoValidatedUserId() {
        System.out.print("\nPlease, enter the user's id: ");
        String id = scanner.next();
        try {
            int validInteger = appValidator.validateId(id);
            findUserByIdDemo(validInteger);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void demoFindUserByMail() {
        System.out.print("\nPlease, enter the user's email: ");
        String email = scanner.next();
        try {
            appValidator.validateEmail(email);
            findUserByEmailDemo(email);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}


