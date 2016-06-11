package io.models;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by Florian on 16/04/15.
 */
public interface ProjectRepository extends CrudRepository<Project, Long> {
    Project findById(Long id);
}
