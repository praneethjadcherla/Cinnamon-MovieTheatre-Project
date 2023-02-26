package com.techreturners;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

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
      public void checkOneTicketRequested() throws Exception{
            MovieTheatre movieTheatre=new MovieTheatre();

            movieTheatre.createAllSeatsAvailable();

            assertEquals(1,movieTheatre.requestTickets(1));
            assertEquals(14,movieTheatre.availableSeats.size());
      }
      @Test
      public void checkThreeTicketsRequested() throws Exception{
            MovieTheatre movieTheatre=new MovieTheatre();
            movieTheatre.createAllSeatsAvailable();

            int seatsAllocated=3;
            int seatsAvailable=12;

            assertEquals(seatsAllocated,movieTheatre.requestTickets(3));
            assertEquals(seatsAllocated,movieTheatre.allocatedSeats.size());
      }

      @Test
      public void checkA1IsAllocated() throws Exception{
            MovieTheatre movieTheatre=new MovieTheatre();

            movieTheatre.createAllSeatsAvailable();
            movieTheatre.requestTickets(1);

            assertTrue(movieTheatre.allocatedSeats.contains("A1"));
      }

      @Test
      public void checkInvalidNumberOfSeatsRequested() throws Exception{
            MovieTheatre movieTheatre=new MovieTheatre();

            movieTheatre.createAllSeatsAvailable();

            assertThrows(Exception.class,() -> movieTheatre.requestTickets(16));
      }

      @Test
      public void checkIfTheatreIsFilledWithRandomSeats() throws Exception {
            MovieTheatre movieTheatre=new MovieTheatre();
            Random random=new Random();

            int numberOfAvailableSeats=15;
            int numberOfSeats=0;
            movieTheatre.createAllSeatsAvailable();
            for(int i=0;numberOfSeats<=numberOfAvailableSeats;i++) {
                  try {
                        numberOfSeats = random.nextInt(1, 4);
                        movieTheatre.requestTickets(numberOfSeats);
                        numberOfAvailableSeats = movieTheatre.availableSeats.size();
                        System.out.println(numberOfAvailableSeats);
                  }
                  catch(Exception exception){
                        assertThrows(Exception.class,() -> movieTheatre.requestTickets(3));
                  }
            }


      }


}
