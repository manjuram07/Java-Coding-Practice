package com;

import java.util.List;

@FunctionalInterface
interface Cab {
    int bookCab(String from, String to);
}


public class LambdaDemo {
    public static void main(String[] args) {

        Cab cabService = (from, to) -> {
            System.out.println("Booking cab from " + from + " to " + to);
            return 12345; // returning a dummy booking ID
        };

        // Using the cabService to book a cab
        int bookingId = cabService.bookCab("Location A", "Location B");
        System.out.println("Cab booked successfully with Booking ID: " + bookingId);


    }
}
