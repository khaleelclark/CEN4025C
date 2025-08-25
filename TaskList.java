import java.util.ArrayList;

public class TaskList  extends ArrayList<Task> {

    public void getCompletedTasks() {
        TaskList completed = new TaskList();
        if (this.isEmpty()){
            System.out.println("No tasks found");
            return;
        }
        for (Task task : this) {
            if (!task.isTaskStatus()) {
                completed.add(task);
            }
        }
        System.out.println(completed);
    }
    public void getIncompleteTasks() {
        TaskList incomplete = new TaskList();
        if (this.isEmpty()){
            System.out.println("No tasks found");
            return;
        }
        for (Task task : this) {
            if (task.isTaskStatus()) {
                incomplete.add(task);
            }
        }
        System.out.println(incomplete);
    }

}

