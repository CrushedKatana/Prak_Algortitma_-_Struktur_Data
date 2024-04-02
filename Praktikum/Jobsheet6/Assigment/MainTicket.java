package Praktikum.Jobsheet6.Assigment;

public class MainTicket {
    public static void main(String[] args) {
        TicketService ticketService = new TicketService();


        ticketService.add(new Ticket("Airline1", "Destination1", "Origin1", 500));
        ticketService.add(new Ticket("Airline2", "Destination2", "Origin2", 400));
        ticketService.add(new Ticket("Airline3", "Destination3", "Origin3", 700));
        ticketService.add(new Ticket("Airline4", "Destination4", "Origin4", 300));
        ticketService.add(new Ticket("Airline5", "Destination5", "Origin5", 600));

        System.out.println("Unsorted Tickets:");
        ticketService.displayAll();
        System.out.println();

        System.out.println("Tickets sorted by price in ascending order using bubble sort:");
        ticketService.bubbleSortAscending();
        ticketService.displayAll();
        System.out.println();

        System.out.println("Tickets sorted by price in descending order using selection sort:");
        ticketService.selectionSortDescending();
        ticketService.displayAll();
    }
}
