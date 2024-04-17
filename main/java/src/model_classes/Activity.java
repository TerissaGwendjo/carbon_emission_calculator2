package java.src.model_classes;

public class Activity {
    //Attributes
    private Long activityId;
    private String name;
    private String description;

    //Constructors
    public Activity() {
    }
    public Activity(Long activityId, String name, String description) {
        this.activityId = activityId;
        this.name = name;
        this.description = description;
    }
    public Activity(String name, String description) {
        this.name = name;
        this.description = description;
    }
    @Override
    public String toString() {
        return "Activity{" +
                "activityId=" + activityId +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}

