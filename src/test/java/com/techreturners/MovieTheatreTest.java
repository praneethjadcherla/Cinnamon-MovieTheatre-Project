package com.techreturners;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MovieTheatreTest {
      @Test
      public void checkEAllSeatsAvailable(){
            MovieTheatre movieTheatre=new MovieTheatre();

            assertEquals(15,movieTheatre.createAllSeatsAvailable());
      }

      @Test
      public void checkNoSeatIsAllocated(){
            MovieTheatre movieTheatre=new MovieTheatre();

            assertEquals(0,movieTheatre.allocatedSeats.size());
      }

}
