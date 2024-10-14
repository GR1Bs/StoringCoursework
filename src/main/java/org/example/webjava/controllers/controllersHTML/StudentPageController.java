package org.example.webjava.controllers.controllersHTML;

import org.example.webjava.Student.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentPageController {
    @GetMapping("/student")
    public String showStudentPage(Model mode){
        return "StudentPage";
    }
}
