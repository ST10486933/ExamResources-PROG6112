
package com.mycompany.moviegui;

// MovieTicketData class - Constructor class
// Consists of a constructor and getters for all the required strings, ints, and doubles
public class MovieTicketData 
{
    public String movieName;
    public int numberOfTickets;
    public double ticketPrice;

    // Constructor
    public MovieTicketData(String movieName, int numberOfTickets, double ticketPrice)
    {
        this.movieName = movieName;
        this.numberOfTickets = numberOfTickets;
        this.ticketPrice = ticketPrice;
    }

    // Getters
    public String getMovieName() {
        return movieName;
    }

    public int getNumberOfTickets() {
        return numberOfTickets;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }
}
