package com.hanaad.demo.Model;


import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Room implements Comparable<Object>{

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    private String room_number;

    @JsonBackReference
    @ManyToMany(mappedBy="rooms")
    private Set<Booking> bookings = new HashSet<Booking>();

    public Set<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(Set<Booking> bookings) {
        this.bookings = bookings;
    }

    public Room() {}

    public Room (long id, String room_number) {
        this.id = id;
        this.room_number = room_number;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRoom_number() {
        return room_number;
    }

    public void setRoom_number(String room_number) {
        this.room_number = room_number;
    }




    @Override
    public int compareTo(Object o) {
        return 0;
    }
}



