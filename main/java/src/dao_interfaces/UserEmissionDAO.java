package java.src.dao_interfaces;

import java.src.model_classes.UserEmission;

public interface UserEmissionDAO {

    void insertUserEmission(UserEmission userEmission);
    UserEmission getUserEmission(Long emissionId);
    void updateUserEmission(UserEmission userEmission);
    void deleteUserEmission(Long emissionId);
}
