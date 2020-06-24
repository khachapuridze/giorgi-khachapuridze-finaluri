package giorgi.khachapuridze.second.dto.task;

import lombok.Data;

import java.util.Date;
@Data
public class AddtaskInput {
    private Long id;
    private String title;
    private String description;
    private Date startDate;
    private Date endDate;

}
