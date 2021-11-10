package com.hanaad.demo.Controller;

import com.hanaad.demo.Model.User;
import com.hanaad.demo.Repository.AuthorityRepository;
import com.hanaad.demo.Repository.BookingRepository;
import com.hanaad.demo.Repository.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/users")
public class UserController {


    UserRepository users;


    BookingRepository bookings;


    AuthorityRepository authorities;

    @RequestMapping(method= RequestMethod.GET)

    public String index(Model model) {
        model.addAttribute("users", bookings.findAll());
        return "users/index";

}

    // GET  /users/new			- the form to fill the data for a new user
    @RequestMapping(value="/new", method=RequestMethod.GET)
    public String newRoom(Model model) {
        model.addAttribute("user", new User());
        return "users/create";
    }

    // GET /login
    @RequestMapping(value="/login", method=RequestMethod.GET)
    public String login(Model model) {
        return "index";
    }

    // GET  /users/{id} 		- the user with identifier {id}
    @RequestMapping(value="{id}", method=RequestMethod.GET)

    public String show(@PathVariable("id") long id, Model model) {
        User user = users.findOne(id);
        if( user == null )

        model.addAttribute("user", user);
        model.addAttribute("templates/bookings", getUserBookings(user.getId()));
        return "users/show";
    }

    private Object getUserBookings(long id) {
        return null;
    }


}

