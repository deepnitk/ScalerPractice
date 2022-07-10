package abstractclasses;

public class Instructor extends User {
    private String assignedBatch;
    private String topic;

    private String description;

    Instructor() {
        super("Instructor");
    }

    public String getAssignedBatch() {
        return assignedBatch;
    }

    public void setAssignedBatch(String assignedBatch) {
        this.assignedBatch = assignedBatch;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    void saySomething() {
        System.out.println("Solve your assignment.");
    }
}
