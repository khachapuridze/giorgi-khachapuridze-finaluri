package giorgi.khachapuridze.second.service.impl;

import giorgi.khachapuridze.second.dto.task.*;
import giorgi.khachapuridze.second.model.Task;
import giorgi.khachapuridze.second.repository.TaskRepository;
import giorgi.khachapuridze.second.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    TaskRepository taskRepository;

    @Override
    public AddTaskOutput addTask(AddtaskInput addtaskInput) {

        Task task = new Task();
        task.setTitle(addtaskInput.getTitle());
        task.setDescription(addtaskInput.getDescription());
        task.setStartDate(addtaskInput.getStartDate());
        task.setEndDate(addtaskInput.getEndDate());
        taskRepository.save(task);

        AddTaskOutput addTaskOutput = new AddTaskOutput();
        addTaskOutput.setMsg("task added");
        return addTaskOutput;
    }





    @Override
    public GetTasksOutput getTasks(GetasksInput getasksInput) {
        List<TaskDTO> tasks = new ArrayList<>();
        for (Task task : taskRepository.findAll()) {
            TaskDTO taskDTO = new TaskDTO();
            taskDTO.setId(task.getId());
            taskDTO.setTitle(task.getTitle());
            taskDTO.setDescription(task.getDescription());
            taskDTO.setStartDate(task.getStartDate());
            taskDTO.setEndDate(task.getEndDate());
            tasks.add(taskDTO);
        }
        GetTasksOutput getTasksOutput = new GetTasksOutput();
        getTasksOutput.setTaskDTOList(tasks);
        return getTasksOutput;
    }






    @Override
    public void deleteTasks(Long id) {
        Task task = taskRepository.getOne(id);
        taskRepository.delete(task);
    }



}
