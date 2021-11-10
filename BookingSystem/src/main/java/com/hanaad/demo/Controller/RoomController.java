package com.hanaad.demo.Controller;

import com.hanaad.demo.Model.Room;
import com.hanaad.demo.Repository.BookingRepository;
import com.hanaad.demo.Repository.RoomRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class RoomController {



    RoomRepository rooms;


    BookingRepository bookings;


    @RequestMapping(value="{id}/rooms/new", method= RequestMethod.GET)

    public String newRoom(@PathVariable("id") long id, Model model) {
        Room r = new Room();
        model.addAttribute("room", r);

        return "rooms/create";
    }

}
