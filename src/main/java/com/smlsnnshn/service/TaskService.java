package com.smlsnnshn.service;

import com.smlsnnshn.dto.TaskDTO;
import com.smlsnnshn.dto.UserDTO;

import java.util.List;

public interface TaskService extends CrudService<TaskDTO,Long> {

    List<TaskDTO> findTaskByManager(UserDTO manager);

}
