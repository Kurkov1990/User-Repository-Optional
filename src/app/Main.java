package app;

public class Main {

    static UserRepositoryDemo demo = new UserRepositoryDemo();
    static DataProvider dataProvider = new DataProvider();
    static AppValidator appValidator = new AppValidator();

    public static void main(String[] args) {
        dataProvider.fillRepository();
        demo.demoValidatedUserId();
        demo.demoFindUserByMail();
        demo.getUsersCountDemo();
    }


}
