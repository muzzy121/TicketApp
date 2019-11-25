package pl.programator.ticketapp.enums;

public enum TicketType {
    BUS(2.5d),
    TRAIN(4.5d),
    TRAM(1.5d);

    private double price;

    TicketType(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
