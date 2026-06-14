package com.todo.todoapp.controller;

import com.todo.todoapp.models.Task;
import com.todo.todoapp.services.TaskService;
import java.util.List;
import org.springframework.stereotype.Controller;

@Controller
public class TaskController {
    private final TaskService taskService;
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    public String getTasks() {
        List<Task> tasks = taskService.getAllTasks();
        return "Tasks";
    }
}
