package lab3;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class DataStructures {
    private List<TaskItem> tasks = new ArrayList<>();
 
    public DataStructures() {
        tasks = Arrays.asList(
                new TaskItem(1,"Push lab code to the github", Status.TO_DO),
                new TaskItem(2,"Prepare for the quiz", Status.IN_PROGRESS),
                new TaskItem(3,"Go over tasks from lab2", Status.COMPLETED));
    }

    
}

// In this task, your goal is to create a Java program that exemplifies 
// object-oriented programming principles by implementing a Task Management System. 
// Your task is to design a class named TaskItem which should have three attributes:
//  taskId (an integer representing a unique identifier for each task), 
//  taskDescription (a string describing the task),
//  taskStatus (an enum representing the status of the task with values such as TO_DO, IN_PROGRESS, COMPLETED, and CANCELLED). 

public class DataStructures {
    private List<TaskItem> tasks;

    public DataStructures() {
        this.tasks = Arrays.asList(new TaskItem(1, "Push lab code to the github", TaskStatus.TO_DO), new TaskItem(2, "Prepare for the quiz", TaskStatus.IN_PROGRESS), new TaskItem(3, "Go over tasks from Lab2", TaskStatus.COMPLETED), new TaskItem(4, "Night out", TaskStatus.CANCELLED));
    }

    public List<TaskItem> getAllObjects() {
        return this.tasks;
    }

    public Optional<TaskItem> getByStatus(String status) {
        TaskStatus desiredStatus = TaskStatus.valueOf(status.toUpperCase());
        return this.tasks.stream().filter((taskItem) -> {
            return taskItem.getStatus().equals(desiredStatus);
        }).findFirst();
    }

    public void printTaskDescriptions() {
        this.tasks.stream().forEach((taskItem) -> {
            System.out.println(taskItem.getDescription());
        });
    }

    public List<TaskItem> findIdGrater(int id) {
        return this.tasks.stream().filter((taskItem) -> {
            return taskItem.getId() >= id;
        }).toList();
    }
}