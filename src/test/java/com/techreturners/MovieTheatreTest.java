package com.techreturners;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MovieTheatreTest {
      @Test
      public void checkAllSeatsAvailable(){
            MovieTheatre movieTheatre=new MovieTheatre();

            assertEquals(15,movieTheatre.createAllSeatsAvailable());
      }

      @Test
      public void checkNoSeatIsAllocated(){
            MovieTheatre movieTheatre=new MovieTheatre();

            assertEquals(0,movieTheatre.allocatedSeats.size());
      }

      @Test
      public void checkOneTicketRequested(){
            MovieTheatre movieTheatre=new MovieTheatre();

            movieTheatre.createAllSeatsAvailable();

            assertEquals(1,movieTheatre.requestTickets(1));
            assertEquals(14,movieTheatre.availableSeats.size());
      }
      //Creating movieTheatre object outside the method to access it directly to allocate seats sequentially
      MovieTheatre movieTheatre=new MovieTheatre();
      @Test
      public void checkThreeTicketsRequested(){
            movieTheatre.createAllSeatsAvailable();

            int seatsAllocated=3;
            int seatsAvailable=12;

            assertEquals(seatsAllocated,movieTheatre.requestTickets(3));
            assertEquals(seatsAvailable,movieTheatre.availableSeats.size());
      }
}
