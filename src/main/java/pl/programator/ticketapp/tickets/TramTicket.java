package pl.programator.ticketapp.tickets;

import pl.programator.ticketapp.enums.TicketType;
import pl.programator.ticketapp.tickets.baseclass.Ticket;

public class TramTicket extends Ticket {
    public TramTicket() {
        super(TicketType.TRAM);
    }
}
