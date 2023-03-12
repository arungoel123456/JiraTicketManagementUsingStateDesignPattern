package com.demo.state;

import com.demo.dto.*;

public class Analysis implements State{

    private final Ticket ticket;

    public Analysis(Ticket ticket) {
        this.ticket = ticket;
    }

    @Override
    public void startAnalysis() {
        System.out.println("ticket already in analysis");
    }

    @Override
    public void startReview() {
        System.out.println(ticket.getCreatedBy().getName() + " moved ticket to review" );
        ticket.setState(new Review(ticket));
    }

    @Override
    public void markDone() {
        System.out.println(ticket.getCreatedBy().getName() + " marked ticket done" );
        ticket.setState(new Done(ticket));
    }
}
