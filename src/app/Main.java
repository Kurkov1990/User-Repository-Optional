package app;

public class Main {

    static UserRepositoryDemo demo = new UserRepositoryDemo();
    static AppValidator appValidator = new AppValidator();

    public static void main(String[] args) {
        demo.demoValidatedUserId();
        demo.demoFindUserByMail();
        demo.getUsersCountDemo();
    }
}
