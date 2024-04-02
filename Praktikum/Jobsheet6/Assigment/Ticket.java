package Praktikum.Jobsheet6.Assigment;

public class Ticket {
    String airlines;
    int price;
    String destination;
    String origin;

    public Ticket(String airlines, String destination, String origin, int price) {
        this.airlines = airlines;
        this.destination = destination;
        this.origin = origin;
        this.price = price;
    }

    public String toString() {
        return "Ticket{" +
                "airlines='" + airlines + '\'' +
                ", price=" + price +
                ", destination='" + destination + '\'' +
                ", origin='" + origin + '\'' +
                '}';
    }
}
