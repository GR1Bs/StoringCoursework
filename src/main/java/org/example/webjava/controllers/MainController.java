package org.example.webjava.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
@Controller
public class MainController {
    @GetMapping("/")
    public String showHomePage(Model model) {
        model.addAttribute("username", "Алексей");
        return "MainPage"; // Возвращаем имя шаблона
    }

    @GetMapping("/main")
    public String showMainPage(Model model) {
        model.addAttribute("username", "Алексей");
        return "MainPage"; // Возвращаем имя шаблона
    }
}
