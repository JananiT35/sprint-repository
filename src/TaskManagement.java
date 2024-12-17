import java.util.LinkedList;
import java.util.Queue;

public class TaskManagement {
    public static void main(String[] args) {
        TaskSystem taskSystem = new TaskSystem();
        TaskManager taskManager = taskSystem.getTaskManager();
        Task task1 = new Task("Task 1", "Description 1", "High", "pending");
        Task task2 = new Task("Task 2", "Description 2", "Medium", "pending");
        Task task3 = new Task("Task 3", "Description 3", "Low", "completed");
        taskManager.addTask(task1);
        taskManager.addTask(task2);
        taskManager.addTask(task3);
        taskManager.displayAll();
        Task removedTask = taskManager.removeTask();
        taskManager.setStatus("Task 2", "completed");
        System.out.println("\nAll Tasks after update:");
        taskManager.displayAll();
        Task nextTask = taskManager.displayNext();
        System.out.println("\nCompleted Tasks:");
        taskManager.displayCompleted();
    }
}
class Task {
    private String title;
    private String description;
    private String priority;
    private String status;

    Task(String title, String description, String priority, String status) {
        this.title = title;
        this.description = description;
        this.priority = priority;
        this.status = status;
    }
    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
    public String getPriority() {
        return priority;
    }

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    @Override
    public String toString() {
        return "Task [Title=" + title + ", Description=" + description + ", Priority=" + priority + ", Status=" + status + "]";
    }
}
class TaskManager {
    private Queue<Task> taskQ;
    TaskManager() {
        taskQ = new LinkedList<>();
    }
    public void addTask(Task t) {
        taskQ.add(t);
    }
    public Task removeTask() {
        return taskQ.poll();
    }
    public Task displayNext() {
        return taskQ.peek();
    }
    public void displayAll() {
        for (Task t : taskQ) {
            System.out.println(t);
        }
    }
    public void setStatus(String taskTitle, String status) {
        for (Task t : taskQ) {
            if (t.getTitle().equalsIgnoreCase(taskTitle)) {
                t.setStatus(status);
                System.out.println("Updated Task: " + t);
                return;
            }
        }
        System.out.println("Task not found.");
    }
    public void displayCompleted() {
        for (Task t : taskQ) {
            if ("completed".equalsIgnoreCase(t.getStatus())) {
                System.out.println(t);
            }
        }
    }
}
class TaskSystem {
    private TaskManager m;
    private Queue<Task> q;
    TaskSystem() {
        m = new TaskManager();
        q = new LinkedList<>();
    }
    public TaskManager getTaskManager() {
        return m;
    }
}
