package com.booking;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class EventTicketBookingTest {

    @Test
    void testRegularTickets() {
        assertEquals(1500,
                EventTicketBooking.calculateTotal("regular", 3));
    }

    @Test
    void testPremiumTickets() {
        assertEquals(5000,
                EventTicketBooking.calculateTotal("premium", 5));
    }

    @Test
    void testDiscount() {
        assertEquals(5400,
                EventTicketBooking.calculateTotal("premium", 6));
    }

    @Test
    void testVipTickets() {
        assertEquals(8000,
                EventTicketBooking.calculateTotal("vip", 4));
    }

    @Test
    void testInvalidCategory() {
        assertThrows(IllegalArgumentException.class, () ->
                EventTicketBooking.calculateTotal("Gold", 2));
    }
}
