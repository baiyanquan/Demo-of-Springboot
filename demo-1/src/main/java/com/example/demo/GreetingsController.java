package com.example.demo;
import model.Greetings;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class GreetingsController {

	@GetMapping("/greeting")
    public String greetingForm(Model model) {
        model.addAttribute("greeting", new Greetings());
        return "greeting";
    }

	@Autowired
    private GreetingsRepository repository;

    @PostMapping("/greeting")
    public String greetingSubmit(Model model,@ModelAttribute Greetings greeting) {
    	String id = Long.toString(greeting.id);
    	greeting.string_id=id;
    	greeting.word=repository.findByid(id).word;
    	model.addAttribute("greeting", greeting);
        return "result";
    }
}
