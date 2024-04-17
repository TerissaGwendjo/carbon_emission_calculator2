package java.src.dao_interfaces;

import java.src.model_classes.User;
import java.src.model_classes.UserEmissions;

public interface UserEmissionDAO {

    void insertUserEmission (UserEmissions user);
    void getUserEmission (Long userId);
    void updateUserEmission (User user);
    void deleteUserEmission (Long userId);
}
