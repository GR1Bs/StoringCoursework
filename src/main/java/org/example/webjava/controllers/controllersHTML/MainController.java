package org.example.webjava.controllers.controllersHTML;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
@Controller
public class MainController {


    @GetMapping("")
    public String showMainPage(Model model) {
        String name="МММ";
        String a="fsdfsdf";
        model.addAttribute("username", name);
        return "MainPage"; // Возвращаем имя шаблона
    }
}
