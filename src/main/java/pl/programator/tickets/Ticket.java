package pl.programator.tickets;

public abstract class Ticket {
    private final TicketType ticketType;

    public Ticket(TicketType ticketType) {
        this.ticketType = ticketType;
    }

    public TicketType getTicketType() {
        return ticketType;
    }
}
