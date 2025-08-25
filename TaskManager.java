import java.util.Scanner;

public class TaskManager {
    static TaskList taskList = new TaskList();
    public static Scanner scanner = new Scanner(System.in);

     public static void startToDo(){
         while (true) {
             System.out.println("\nWelcome to Zindel's Task Management System!\nPlease enter the number of the option you wish to select\n");
             System.out.println("1. Add a new task");
             System.out.println("2. Remove a task");
             System.out.println("3. Display all Tasks");
             System.out.println("4. Update a task");
             System.out.println("5. View all completed tasks");
             System.out.println("5. View all incomplete tasks");
             System.out.println("6. Exit the Task Management System");

             switch (scanner.nextLine()) {
                 case "1": addTask();
                 break;
                 case "2": removeTask();
                 break;
                 case "3": displayTasks();
                 break;
                 case "4":
                 case "5":
                 case "6": {
                     System.out.println("Thank you for using Zindel's Task Management System");
                     System.exit(0);
                     break;
                 }
                 default:
                     System.err.println("Error: invalid entry.\n");
                     break;
             }
         }
     }

    public static void addTask() {
        String taskName;
            System.out.println("\nPlease enter the name of the task you wish to add or enter 'c' to cancel");
            taskName = scanner.nextLine();
            if (!taskName.equalsIgnoreCase("c")) {
                Task t = new Task(taskName, false);
                taskList.add(t);
            }
    }

    public static void removeTask() {
        if (!taskList.isEmpty()) {
            displayTasks();
            System.out.println("\nPlease enter the number of the task you wish to remove or enter '99' to cancel");

            int taskIndexToRemove = scanner.nextInt();
            scanner.nextLine();

            if (taskIndexToRemove == 99) {
                System.out.println("Canceling...");
            } else if (taskIndexToRemove >= 0 && taskIndexToRemove < taskList.size()) {
                Task removedTask = taskList.remove(taskIndexToRemove);
                System.out.println(removedTask.getTaskName() + " has been removed.");
            } else {
                System.err.println("Error: invalid entry. No tasks were removed.\n");
            }
        } else {
            System.out.println("No tasks to remove.");
        }
    }


    public static void displayTasks() {
         if (taskList.isEmpty()) {
             System.out.println("\nThere are no tasks in this list. Add some now!");
         } else {
             int i = 1;
             for (Task task : taskList) {
                 System.out.println(i + ". " + task.getTaskName() + " " + task.taskStatus());
                 i++;
             }

         }
    }

    public static void updateTask() {
         //TODO
    }
    public static void viewCompletedTasks() {
         //TODO
    }
    public static void viewIncompleteTasks() {
         //TODO
    }
}
