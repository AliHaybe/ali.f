package com.hanaad.demo.Controller;


import com.hanaad.demo.Model.Booking;
import com.hanaad.demo.Model.User;
import com.hanaad.demo.Repository.BookingRepository;
import com.hanaad.demo.Repository.RoomRepository;
import com.hanaad.demo.Repository.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

@Controller
@RequestMapping(value= "/templates/bookings")
@SessionAttributes({"booking", "numberRooms"})
public class BookingController {


    BookingRepository bookings;


    RoomRepository rooms;


    UserRepository users;


    @RequestMapping(method= RequestMethod.GET)
    public String index(Model model) {
        User user = getCurrentUser();
        List<Booking> books = new ArrayList<Booking>();
        Iterator<Object> it = bookings.findAll().iterator();
        while(it.hasNext()){
            Booking book = (Booking) it.next();
            continue;
        }
        model.addAttribute("templates/bookings", books);
        return "bookings/index";

    }

    private User getCurrentUser() {


        return null;
    }

    @RequestMapping(value="/new/{room_number}", method=RequestMethod.GET, produces={"text/plain","application/json"})
    public @ResponseBody
    void bookRoomJSON(@PathVariable("room_number") long room_number) {

        int numberRooms = 2;
        Booking booking = new Booking();
        booking.setStart_dato(new Date(1448713320000L));
        booking.setSlutt_dato(new Date(1449145320000L));


    }
    }