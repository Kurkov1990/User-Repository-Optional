package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserRepository {

    DataRepository dataRepo = new DataRepository();

    public Optional<User> findUserById(int id) {
        return dataRepo.getData().stream().filter(user -> user.getId() == id).findFirst();
    }

    public Optional<User> findUserByEmail(String email) {
        return dataRepo.getData().stream().filter(user -> user.getEmail().equalsIgnoreCase(email)).findFirst();
    }

    public Optional<List<User>> findAllUsers() {
        return dataRepo.getData().isEmpty() ? Optional.empty() : Optional.of(new ArrayList<>(dataRepo.getData()));
    }
}

