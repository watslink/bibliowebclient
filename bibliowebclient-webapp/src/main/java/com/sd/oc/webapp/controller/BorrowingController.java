package com.sd.oc.webapp.controller;

import com.sd.oc.serviceproxy.generated.borrowingAPI.BorrowingServiceAPI;
import com.sd.oc.serviceproxy.generated.userAPI.User;
import com.sd.oc.serviceproxy.generated.userAPI.UserServiceAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BorrowingController {

    @Autowired
    UserServiceAPI userServiceAPI;

    @Autowired
    BorrowingServiceAPI borrowingServiceAPI;

    @GetMapping("/borrowings")
    public String getBorrowings(Model model){
        User user= userServiceAPI.findUserByUsername(SecurityContextHolder.getContext().getAuthentication().getName());
        model.addAttribute("listBorrowings",borrowingServiceAPI.findAllBorrowingOfUser(user.getUserId()));
        return "borrowings";
    }

    @GetMapping("/extend")
    public String extendBorrowing(@RequestParam int borrowingId){
        borrowingServiceAPI.extendBorrowing(borrowingId);
        return "redirect:/borrowings";
    }
}
