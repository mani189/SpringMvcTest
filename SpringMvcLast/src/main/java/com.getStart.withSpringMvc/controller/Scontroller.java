package com.getStart.withSpringMvc.controller;

import com.getStart.withSpringMvc.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

//import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Timer;

@Controller
@RequestMapping
public class Scontroller {

    @ModelAttribute
    public void sameThing(Model model){
        model.addAttribute("same1","Your Details are");
        model.addAttribute("same2","Please Submit Details");
    }


    @GetMapping("/first")
//    @ResponseBody
    public String helloEg(Model model){
        System.out.println("This is the first page");
        String str = "001818317";
        int number = Integer.parseInt(str);
        model.addAttribute("name","Manish");
        model.addAttribute("id",number);
        List<String>assets=new ArrayList<>();
        assets.add("Laptop");
        assets.add("Bag");
        assets.add("Mouse");
        assets.add("Headphone");
        System.out.println(assets);
        model.addAttribute("list",assets);
        Date date=new Date();
//        Timer timer=new Timer();
//        timer.toString();
//        System.out.println(timer);
//        <%
//        String name=(String)request.getAttribute("name");
//        Integer id=(Integer)request.getAttribute("id");
//        List<String> l=(List<String>) request.getAttribute("list");
//        Date d=(Date)request.getAttribute("date");
//%>
//        <% for(String s:l){ %>
//<h4><%=s%></h4>
//<% } %>
        model.addAttribute("date",date);
        return "first";
    }

    @GetMapping("/second")
//    @ResponseBody
    public String helloEg2(){
        System.out.println("This is the Second page");
        return "second";
    }

//    -------------------------------@RequestParam-------------------------
//    @PostMapping("/fetchDetails")
//    public String formD(@RequestParam("uName") String name,@RequestParam("emailD") String email,@RequestParam("passwordD") String password,Model model){
//        System.out.println("Here are the Details");
//        System.out.println("Your entered Name is: "+name);
//        System.out.println("Your entered email is: "+email);
//        System.out.println("Your entered password is: "+password);
//        Date date=new Date();
//        model.addAttribute("sname",name);
//        model.addAttribute("semail",email);
//        model.addAttribute("spass",password);
//        model.addAttribute("date",date);
//        return "details";
//    }
//    ----------------------------------------------------------------

//    --------------------@ModelAttribute-------& Redirect or RedirectView------------
    @PostMapping("/fetchDetails")
    public String st(@ModelAttribute User user,Model model){
        if(user.getuName().isEmpty() || user.getEmailD().isEmpty() ||user.getPasswordD().isEmpty()){
            return "redirect:/second";
        }
//        System.out.println(user.getuName().isEmpty());
        System.out.println("User Details here");
        return "details";
    }
//    ---------------------------------------------------------------


}
