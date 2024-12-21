package app;

import app.utils.AppValidator;
import app.view.UserRepositoryView;

public class Main {

    static UserRepositoryView demo = new UserRepositoryView();
    public static AppValidator appValidator = new AppValidator();

    public static void main(String[] args) {
        demo.demoValidatedUserId();
        demo.demoFindUserByMail();
        demo.getUsersCountDemo();
    }
}
