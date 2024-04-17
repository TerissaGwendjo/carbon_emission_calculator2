package java.src.dao_interfaces;

import java.src.model_classes.User;

public interface UserDAO {

    void insertUser (User user);
    User getUser (Long userId);
    void updateUser (User user);
    void deleteUser (Long userId);
}
