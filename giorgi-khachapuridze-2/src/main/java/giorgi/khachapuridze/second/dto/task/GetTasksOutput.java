package giorgi.khachapuridze.second.dto.task;

import lombok.Data;

import java.util.List;
@Data
public class GetTasksOutput {
    List<TaskDTO> taskDTOList;
}
