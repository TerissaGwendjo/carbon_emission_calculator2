package java.src.dao_interfaces;

import java.src.model_classes.Activity;

public interface ActivityDAO {

    void insertActivity(Activity activity);
    Activity getActivity(Long activityId);
    void updateActivity(Activity activity);
    void deleteActivity(Long activityId);

}
