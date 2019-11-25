package pl.programator.utils;

public class TicketMachine {
    void sellTicket(){}
    void countHowManyTicketsHasBeenSold(){}
    void calculateRevenue(){}

    void showInitialMenu(){
        System.out.println("Please choose your option:");
        System.out.println("1. Buy ticket");
        System.out.println("2. Show how many tickets has been sold");
        System.out.println("3. Calculate revenue from sold tickets");
        System.out.println("4. Exit");
    }

    void showBuyTicketMenu(){
        System.out.println("Which ticket would you like to buy?");
        System.out.println("1. Bus ticket");
        System.out.println("2. Tram ticket");
        System.out.println("3. Train ticket");
    }
}
