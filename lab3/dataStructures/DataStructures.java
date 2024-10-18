package lab3.dataStructures;


import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import lab3.TaskItem;
import lab3.enums.TaskStatus;

public class DataStructures {
    private List<TaskItem> tasks;

    public DataStructures() {
        tasks = Arrays.asList(
                new TaskItem(1,"Push lab code to the github", TaskStatus.TO_DO),
                new TaskItem(2, "Prepare for the quiz", TaskStatus.IN_PROGRESS),
                new TaskItem(3, "Go over tasks from Lab2", TaskStatus.COMPLETED),
                new TaskItem(4, "Night out", TaskStatus.CANCELLED));
    }
    public List<TaskItem> getAllObjects() {
        return this.tasks;
    }

    public Optional<TaskItem> getByStatus(String status) {
        TaskStatus desiredStatus = TaskStatus.valueOf(status.toUpperCase());
        return tasks
                .stream()
                .filter(taskItem -> {
                    return taskItem.getStatus().equals(desiredStatus);
                }).findFirst();
    }

    public void printTaskDescriptions() {
        tasks.stream()
                .forEach(taskItem -> System.out.println(taskItem.getDescription()));
    }
    public List<TaskItem> findIdGrater(int id) {
        return tasks
                .stream()
                .filter(taskItem -> taskItem.getId() >= id)
                .toList();
    }
}
