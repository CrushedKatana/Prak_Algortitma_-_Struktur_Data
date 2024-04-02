package Praktikum.Jobsheet6.Assigment;

import java.util.ArrayList;
import java.util.List;

public class TicketService {
    List<Ticket> tickets;

    public TicketService() {
        this.tickets = new ArrayList<>();
    }

    public void add(Ticket t) {
        tickets.add(t);
    }

    public void displayAll() {
        for (Ticket ticket : tickets) {
            System.out.println(ticket);
        }
    }

    public void bubbleSortAscending() {
        for (int i = 0; i < tickets.size() - 1; i++) {
            for (int j = 0; j < tickets.size() - i - 1; j++) {
                if (tickets.get(j).price > tickets.get(j + 1).price) {
                    Ticket temp = tickets.get(j);
                    tickets.set(j, tickets.get(j + 1));
                    tickets.set(j + 1, temp);
                }
            }
        }
    }

    public void bubbleSortDescending() {
        for (int i = 0; i < tickets.size() - 1; i++) {
            for (int j = 0; j < tickets.size() - i - 1; j++) {
                if (tickets.get(j).price < tickets.get(j + 1).price) {
                    Ticket temp = tickets.get(j);
                    tickets.set(j, tickets.get(j + 1));
                    tickets.set(j + 1, temp);
                }
            }
        }
    }

    public void selectionSortAscending() {
        for (int i = 0; i < tickets.size() - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < tickets.size(); j++) {
                if (tickets.get(j).price < tickets.get(minIndex).price) {
                    minIndex = j;
                }
            }
            Ticket temp = tickets.get(minIndex);
            tickets.set(minIndex, tickets.get(i));
            tickets.set(i, temp);
        }
    }

    public void selectionSortDescending() {
        for (int i = 0; i < tickets.size() - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < tickets.size(); j++) {
                if (tickets.get(j).price > tickets.get(maxIndex).price) {
                    maxIndex = j;
                }
            }
            Ticket temp = tickets.get(maxIndex);
            tickets.set(maxIndex, tickets.get(i));
            tickets.set(i, temp);
        }
    }
}
