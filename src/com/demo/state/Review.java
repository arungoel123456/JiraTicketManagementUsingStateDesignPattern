package com.demo.state;

import com.demo.dto.*;

public class Review implements State{
    private final Ticket ticket;

    public Review(Ticket ticket) {
        this.ticket = ticket;
    }


    @Override
    public void startAnalysis() {
        System.out.println(ticket.getCreatedBy().getName() + " moved ticket to analysis again" );
        ticket.setState(new Analysis(ticket));
    }

    @Override
    public void startReview() {
        System.out.println("ticket already in review");
    }

    @Override
    public void markDone() {
        System.out.println(ticket.getCreatedBy().getName() + "marked ticket to done" );
        ticket.setState(new Done(ticket));
    }
}
