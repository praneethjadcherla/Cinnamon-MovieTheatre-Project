package com.techreturners;

import java.util.LinkedList;
import java.util.List;

public class MovieTheatre {
    List<String> availableSeats=new LinkedList<>();
    List<String> allocatedSeats=new LinkedList<>();
    public int createAllSeatsAvailable(){

        for (int i=0;i<3;i++){
            for(int j=1;j<6;j++){
                if(i==0) {
                    availableSeats.add("A" + j);
                } else if (i==1) {
                    availableSeats.add("B" + j);
                }else {
                    availableSeats.add("C" + j);
                }
            }
        }
        return availableSeats.size();
    }

    public int requestTickets(int numberOfSeats) throws Exception{
        if(numberOfSeats<=availableSeats.size() && numberOfSeats>=1 && numberOfSeats<=3 ) {
            for (int i = 0; i < numberOfSeats; i++) {
                allocatedSeats.add(availableSeats.get(0));
                availableSeats.remove(0);
            }
        }else {
            throw new Exception("Invalid number requested. User can request a number of seats between 1 and 3 and available seats are only "+availableSeats.size());
        }
        return allocatedSeats.size();
    }
}
