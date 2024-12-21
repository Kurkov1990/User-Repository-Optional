package app.controller;

import app.entity.User;
import app.model.DataRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserRepositoryService {

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

