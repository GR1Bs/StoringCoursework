package org.example.webjava.controllers.controllersHTML;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RegistrationsPageController {
    @GetMapping("/registrations")
    public String showRegistrations (Model model){
        return "RegistrationsPage";
    }
}
