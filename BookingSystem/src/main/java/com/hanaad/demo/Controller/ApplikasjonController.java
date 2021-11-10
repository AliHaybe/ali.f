package com.hanaad.demo.Controller;


import com.hanaad.demo.Repository.UserRepository;
import com.hanaad.demo.Security.TillatelseForAdmin;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller
public class ApplikasjonController {


    UserRepository users;

    @RequestMapping(value="/")
    public String root(Model model) {
        model.addAttribute("rooms", users.findAll());
        return "landing-page";
    }


    @RequestMapping(value="/angular")
    public String angular() {
        return "angular-interface";
    }

    @RequestMapping(value="/signedin")
    public String signedIn(Model model, Authentication authentication) {

        CustomUserDetail principal = (authentication != null) ? (CustomUserDetail) authentication.getPrincipal() : null;

        if (principal != null) {
            String a = ((SimpleGrantedAuthority) principal.getAuthorities().iterator().next()).getAuthority();
            if (a.equals(("ROLE_ADMIN")))
                return "redirect:/admin";
            else if (a.equals(("ROLE_USER")))
                return "redirect:/users/me";

        }

        return "/"; // fallback
    }


    @RequestMapping(value="/admin")
    @TillatelseForAdmin
    public String manageUsers(Model model)
    {
        model.addAttribute("users", users.findAll());
        return "admin-dashboard";
    }
}
