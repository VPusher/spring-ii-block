package io.models;

import javax.persistence.*;

/**
 * Created by Florian on 17/04/15.
 */
//@Entity
public class Wire {

    //@GeneratedValue
    //@Id
    private Long id;

    //@ManyToOne
    //@JoinColumn(name = "input_id")
    private Block input;

    //@ManyToOne
    //@JoinColumn(name = "output_id")
    private Block output;

    public Wire(Block input, Block output) {
        this.input = input;
        this.output = output;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Block getInput() {
        return input;
    }

    public void setInput(Block input) {
        this.input = input;
    }

    public Block getOutput() {
        return output;
    }

    public void setOutput(Block output) {
        this.output = output;
    }
}
