package pl.programator.ticketapp.tickets.baseclass;

import pl.programator.ticketapp.enums.TicketType;

public abstract class Ticket {
    //TODO try to implement algorithm with target and number of km
    // to be inserted by user and then calculate price

    private final TicketType ticketType;

    public Ticket(TicketType ticketType) {
        this.ticketType = ticketType;
    }

    public TicketType getTicketType() {
        return ticketType;
    }
}
