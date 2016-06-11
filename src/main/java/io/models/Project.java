package io.models;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Florian on 16/04/15.
 */
@Entity
public class Project {

    @GeneratedValue
    @Id
    private Long id;

    private String title;

    @OneToMany(mappedBy = "project")
    private List<Block> blocks;

    public Project() {
    }

    public Project(String title) {
        this.title = title;
    }

    public Project(List blocks) {
        this.blocks = blocks;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List getBlocks() {
        return blocks;
    }

    public void setBlocks(List blocks) {
        this.blocks = blocks;
    }
}
