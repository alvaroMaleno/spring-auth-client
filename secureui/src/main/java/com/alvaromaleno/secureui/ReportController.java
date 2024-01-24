package com.alvaromaleno.secureui;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReportController {

    @RequestMapping("/")
    public String loadHome(){
        return "home";
    }

    @RequestMapping("/report")
    public String loadReport(Model model){
        return "report";
    }
}
