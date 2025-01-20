package krystian_marczuk.Java_Spring1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
//@RestController
public class HelloController {

    @GetMapping(value = "/")
    public String hello() {
        return "index";
    }

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required = false, defaultValue = "World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }
}

