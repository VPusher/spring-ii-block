package io.models;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Collection;

/**
 * Created by Florian on 11/04/15.
 */
public interface BlockRepository extends CrudRepository<Block, Long> {

    Block findById(Long  id);

    Collection<Block> findByProject(@Param("project") Project project);

    Collection<Block> findByTitle(@Param("title") String title);


}
