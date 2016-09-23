package com.dataart.web.controller.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by misha on 23.09.16.
 */
@Controller
public class MVCController {
    @RequestMapping(value = "/model", method = RequestMethod.GET)
    public String getRequestFirst(Model model) {
        System.out.println("Model!");
        model.addAttribute("name", "Misha");
        return "index";
    }

    @RequestMapping(value = "/model-and-view", method = RequestMethod.GET)
    public ModelAndView getRequestSecond() {
        System.out.println("ModelAndView!");
        ModelAndView model = new ModelAndView();
        model.setViewName("index");
        model.addObject("name", "John");
        return model;
    }

}
