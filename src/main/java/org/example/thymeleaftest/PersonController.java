package org.example.thymeleaftest;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.swing.text.DateFormatter;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Arrays;
import java.util.Date;

@Controller
public class PersonController {

    @GetMapping
    public String getpeople(Model model){
        model.addAttribute("something", "this is coming from the controller");
        model.addAttribute("people", Arrays.asList(
                new Person("john", 20),
                new Person("sara", 22),
                new Person("simon", 23)
        ));
        return "people";
    }

    @GetMapping("hello")
    public String sayHello(Model model) {
        model.addAttribute("message", "world");

        return "greeting";
    }

    @GetMapping("/today")
    public String getDate(Model model) {
        LocalDate now = LocalDate.now();
        String formatted = now.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        //String formatted = now.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));

        DayOfWeek dayOfWeek = now.getDayOfWeek();

        model.addAttribute("dato", formatted);
        model.addAttribute("weekday", dayOfWeek);



        return "greeting";
    }


}
