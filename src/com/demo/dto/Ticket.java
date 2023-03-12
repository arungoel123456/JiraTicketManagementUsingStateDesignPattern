package com.demo.dto;

import com.demo.state.*;

public class Ticket {
    private String description;
    private User createdBy;
    private State state;

    public Ticket(String description, User createdBy) {
        this.description = description;
        this.createdBy = createdBy;
        this.state= new Analysis(this);
    }

    public User getCreatedBy() {
        return createdBy;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }
}
