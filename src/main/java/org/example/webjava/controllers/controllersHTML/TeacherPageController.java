package org.example.webjava.controllers.controllersHTML;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
@Controller
public class TeacherPageController {
    @GetMapping("/teacher")
    public String showTeacherPage(Model model){
        return  "TeacherPage";
    }

}
