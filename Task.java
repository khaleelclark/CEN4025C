public class Task {
    private String taskName;
    private boolean taskStatus;

    public Task(String taskName, boolean taskStatus) {
        this.taskName = taskName;
        this.taskStatus = taskStatus;
    }
    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }
    public boolean isTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(boolean taskStatus) {
        this.taskStatus = taskStatus;
    }

    public String taskStatus () {
        if (taskStatus) {
            return "Completed ✓";
        } else {
            return "Incomplete ✗";
        }
    }

}
