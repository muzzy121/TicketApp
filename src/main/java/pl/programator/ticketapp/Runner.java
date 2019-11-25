package pl.programator.ticketapp;

import pl.programator.ticketapp.tickets.BusTicket;
import pl.programator.ticketapp.tickets.baseclass.Ticket;
import pl.programator.ticketapp.tickets.TrainTicket;
import pl.programator.ticketapp.tickets.TramTicket;

import java.util.HashMap;

public class Runner {
    public static void main(String[] args) {
        BusTicket busTicket = new BusTicket();
        TramTicket tramTicket = new TramTicket();
        TrainTicket trainTicket = new TrainTicket();

        final HashMap<Ticket, Integer> ticketNumbers = new HashMap<>();
        ticketNumbers.put(busTicket, 1);
        ticketNumbers.put(tramTicket, 1);
        ticketNumbers.put(trainTicket, 1);
    }


}
