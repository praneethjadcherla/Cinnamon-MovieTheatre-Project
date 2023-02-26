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
}
