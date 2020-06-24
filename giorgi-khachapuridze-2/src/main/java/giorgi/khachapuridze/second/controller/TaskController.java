package giorgi.khachapuridze.second.controller;

import giorgi.khachapuridze.second.dto.task.AddTaskOutput;
import giorgi.khachapuridze.second.dto.task.AddtaskInput;
import giorgi.khachapuridze.second.dto.task.GetTasksOutput;
import giorgi.khachapuridze.second.dto.task.GetasksInput;
import giorgi.khachapuridze.second.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class TaskController {
    @Autowired
    TaskService taskService;

    @PostMapping("addtask")
    public AddTaskOutput addMovie(@RequestBody AddtaskInput addtaskInput) {
        return taskService.addTask(addtaskInput);
    }


    @PostMapping("gettasks")
    public GetTasksOutput getMovies(@RequestBody GetasksInput getasksInput) {
        return taskService.getTasks(getasksInput);
    }

    @DeleteMapping("deletemovie/{id}")
    public void deletePost(@PathVariable Long id) {
        taskService.deleteTasks(id);
    }
}
