package giorgi.khachapuridze.second.service;

import giorgi.khachapuridze.second.dto.task.AddTaskOutput;
import giorgi.khachapuridze.second.dto.task.AddtaskInput;
import giorgi.khachapuridze.second.dto.task.GetTasksOutput;
import giorgi.khachapuridze.second.dto.task.GetasksInput;

public interface TaskService {

    AddTaskOutput addTask(AddtaskInput addtaskInput);

    GetTasksOutput getTasks(GetasksInput getasksInput);

    void deleteTasks(Long id);

}
