package io.models;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by Florian on 17/04/15.
 */
public interface WireRepository extends CrudRepository<Project, Long> {
    Project findById(Long id);
}
