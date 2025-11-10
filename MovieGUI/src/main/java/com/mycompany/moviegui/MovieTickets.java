
package com.mycompany.moviegui;

// MovieTickets Class
// Movie Tickets implementing the interface
public class MovieTickets implements IMovieTickets{
    
    // Method to calculate total ticket price - with VAT
    @Override
    public double CalculateTotalTicketPrice(int numberOfTickets, double ticketPrice)
    {
        double normalPrice = ticketPrice * numberOfTickets;
        double VAT_price = normalPrice * 0.14;
        double finalPrice = VAT_price + normalPrice;
        
        return finalPrice;
    }
    
    // Method to Validate data from the MovieTicketData class
    @Override
    public boolean ValidateData(MovieTicketData movieTicketData)
    {
        if(movieTicketData.getMovieName().isEmpty())
        {
            return false;
        }
        
        if(movieTicketData.getNumberOfTickets() <=0)
        {
            return false;
        }
        
        if(movieTicketData.getTicketPrice() <=0)
        {
            return false;
        }
        
        return true;
    }

}
