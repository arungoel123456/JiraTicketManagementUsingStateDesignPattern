package com.demo.services;

import com.demo.dto.*;
import com.demo.state.*;

public class TicketService {
    public Ticket createTicket(String description, User createdBy){
        return new Ticket(description, createdBy);
    }


    public void startAnalysis(Ticket ticket) {
        ticket.getState().startAnalysis();
    }

    public void startReview(Ticket ticket) {
        ticket.getState().startReview();
    }

    public void markDone(Ticket ticket) {
        ticket.getState().markDone();
    }


//    private void changeTicketStatus(Ticket ticket, State oldState, State newState){
//        if(oldState instanceof  Analysis){
//            if(newState instanceof Done){
//                System.out.println("Ticket moved from analysis to done");
//            }
//            else if(newState instanceof Review){
//                System.out.println("Ticket moved from analysis to review");
//            }
//        }
//        else if(oldState instanceof Review){
//            if(newState instanceof Done){
//                System.out.println("Ticket moved from review to done");
//            }
//            else if(newState instanceof Analysis){
//                System.out.println("Ticket moved from review to analysis");
//            }
//        }
//        else if (oldState instanceof Done) {
//            if(newState instanceof Review){
//                System.out.println("Ticket moved from done to review");
//            }
//            else if(newState instanceof Analysis){
//                System.out.println("Ticket moved from done to analysis");
//            }
//        }
//    }
}
