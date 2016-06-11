package io.models;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Florian on 11/04/15.
 */

@Entity
public class Block {

    @GeneratedValue
    @Id
    private Long id;

    private String title;

    private String component;

    @ManyToOne
    @JoinColumn(name = "project_id")
    private Project project;

    @ManyToMany
    @JoinTable(name = "wire",
        joinColumns = @JoinColumn(name = "output_id"),
        inverseJoinColumns = @JoinColumn(name = "input_id")
    )
    private List<Block> inputs;

    @ManyToMany
    @JoinTable(name = "wire",
            joinColumns = @JoinColumn(name = "input_id"),
            inverseJoinColumns = @JoinColumn(name = "output_id")
    )
    private List<Block> outputs;

    public Block() {
    }

    public Block(Project project, String title, String component) {
        this.project = project;
        this.title = title;
        this.component = component;
    }

    public Block(Project project, String title) {
        this.project = project;
        this.title = title;
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

    public String getComponent() {
        return component;
    }

    public void setComponent(String component) {
        this.component = component;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public List<Block> getInputs() {
        return inputs;
    }

    public void setInputs(List<Block> inputWires) {
        this.inputs = inputWires;
    }

    public List<Block> getOutputs() {
        return outputs;
    }

    public void setOutputs(List<Block> outputs) {
        this.outputs = outputs;
    }
}
