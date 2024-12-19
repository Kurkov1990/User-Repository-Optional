package app;

public class Main {

     static UserRepositoryDemo demo = new UserRepositoryDemo();

    static AppValidator appValidator = new AppValidator();

    public static void main(String[] args) {
        demo.fillRepository();
        UserRepositoryDemo.demoValidatedUserId();
        UserRepositoryDemo.demoFindUserByMail();
        demo.getUsersCountDemo();
    }


}
