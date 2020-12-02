package com.smlsnnshn.service;

import com.smlsnnshn.dto.ProjectDTO;

public interface ProjectService extends CrudService<ProjectDTO,String>  {

    void complete(ProjectDTO project);

}
