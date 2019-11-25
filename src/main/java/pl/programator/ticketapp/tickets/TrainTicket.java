package pl.programator.ticketapp.tickets;

import pl.programator.ticketapp.enums.TicketType;
import pl.programator.ticketapp.tickets.baseclass.Ticket;

public class TrainTicket extends Ticket {
    public TrainTicket() {
        super(TicketType.TRAIN);
    }
}
