package com.oszuszki.beadando;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import java.util.List;

@Controller
public class LakoResource {

    @Autowired
    LakoRepository repository;

    @GetMapping("")
    public static String home() {
        return "index";
    }

    @GetMapping("/all")
    public String getAll(Model model) {
        List<Lakok> mindenlako = repository.findAll();

        model.addAttribute("mindenlako", mindenlako);
        return "all";
    }

    @GetMapping("/add")
    public String addLako(Model model) {
        model.addAttribute("lakok", new Lakok());

        return "newlako";
    }

    @PostMapping("/load")
    public String mahinalas(Lakok lakok) {
        repository.save(lakok);
        return "index";
    }

    @RequestMapping("/delete/{id}")
    public String deleteLako(@PathVariable Long id) {
        repository.deleteById(id);

        return "index";
    }

}
