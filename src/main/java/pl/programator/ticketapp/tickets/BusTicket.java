package pl.programator.ticketapp.tickets;

import pl.programator.ticketapp.enums.TicketType;
import pl.programator.ticketapp.tickets.baseclass.Ticket;

public class BusTicket extends Ticket {
    public BusTicket() {
        super(TicketType.BUS);
    }
}
