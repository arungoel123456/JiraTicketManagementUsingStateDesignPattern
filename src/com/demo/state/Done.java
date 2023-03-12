package com.demo.state;

import com.demo.dto.*;

public class Done implements State{

    private final Ticket ticket;

    public Done(Ticket ticket) {
        this.ticket = ticket;
    }

    @Override
    public void startAnalysis() {
        System.out.println(ticket.getCreatedBy().getName() + " moved ticket to analysis again from done, Whats the issue??" );
        ticket.setState(new Analysis(ticket));
    }

    @Override
    public void startReview() {
        System.out.println(ticket.getCreatedBy().getName() + " moved ticket to review again from Done, I think he missed something to review" );
        ticket.setState(new Review(ticket));
    }

    @Override
    public void markDone() {
        System.out.println(ticket.getCreatedBy().getName() + " marked ticket done" );
        ticket.setState(new Done(ticket));
    }
}
