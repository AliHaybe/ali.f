package com.hanaad.demo.Model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Booking{

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    private Date start_dato, slutt_dato;
    private boolean status;

    @ManyToOne
    private User user;

    @JsonManagedReference
    @ManyToMany(fetch = FetchType.EAGER)
    private Set<Room> rooms = new HashSet<Room>();

    public Booking(){}

    public Booking(long id, Date start_dato, Date slutt_dato, boolean status, User user) {
        this.id = id;
        this.start_dato = start_dato;
        this.slutt_dato = slutt_dato;
        this.status = status;
        this.user = user;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getStart_dato() {
        return start_dato;
    }

    public void setStart_dato(Date start_dato) {
        this.start_dato = start_dato;
    }

    public Date getSlutt_dato() {
        return slutt_dato;
    }

    public void setSlutt_dato(Date slutt_dato) {
        this.slutt_dato = slutt_dato;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Set<Room> getRooms() {
        return rooms;
    }

    public void setRooms(Set<Room> rooms) {
        this.rooms = rooms;
    }


}
