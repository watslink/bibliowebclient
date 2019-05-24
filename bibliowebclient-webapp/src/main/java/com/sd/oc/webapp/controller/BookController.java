package com.sd.oc.webapp.controller;

import com.sd.oc.serviceproxy.generated.bookAPI.BookServiceAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BookController {

    @Autowired
    BookServiceAPI bookServiceAPI;

    @GetMapping("/books")
    public String getAllBooks(Model model){
        model.addAttribute("listBooks", bookServiceAPI.findAllBooks());
        return "books";
    }
}
