package org.example.thymeleaftest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;

@Controller
public class ThymeleafOpgaveController {


    @GetMapping("/friday")
    public String getWeekday(Model model) {

        LocalDate today = LocalDate.now();
        String currentWeekDay = today.getDayOfWeek().toString().toLowerCase();

        model.addAttribute("today", currentWeekDay);

        return "friday?";
    }



}
