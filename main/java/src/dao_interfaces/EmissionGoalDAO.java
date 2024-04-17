package java.src.dao_interfaces;

import java.src.EmissionGoal;

public interface EmissionGoalDAO {

    void insertEmissionGoal(EmissionGoal emissionGoal);
    EmissionGoal getEmissionGoal(Long goalId);
    void updateEmissionGoal(EmissionGoal emissionGoal);
    void deleteEmissionGoal(Long goalId);

}
