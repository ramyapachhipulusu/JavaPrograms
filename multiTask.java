import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task implements Runnable {
    private final String taskName;

    public Task(String taskName) {
        this.taskName = taskName;
    }

    public void run() {
        System.out.println(Thread.currentThread().getName() + " is executing task: " + taskName);
        System.out.println(Thread.currentThread().getName() + " finished task: " + taskName);
    }
}

public class multiTask {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 1; i <= 7; i++) {
            Task task = new Task("Task " + i);
            executorService.submit(task);
        }      
        executorService.shutdown();
    }
}
