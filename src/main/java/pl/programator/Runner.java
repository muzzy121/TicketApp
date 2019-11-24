package pl.programator;

import pl.programator.tickets.BusTicket;
import pl.programator.tickets.Ticket;
import pl.programator.tickets.TrainTicket;
import pl.programator.tickets.TramTicket;

import java.util.HashMap;
import java.util.Set;

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
