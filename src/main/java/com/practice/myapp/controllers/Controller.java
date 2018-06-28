package com.practice.myapp.controllers;

import com.practice.myapp.models.Measurements;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;

@org.springframework.stereotype.Controller
@RequestMapping("location")
public class Controller {

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute("title", "Pick A Location");

        return "index";
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public String result(Model model,
                         @ModelAttribute @Valid Measurements newMeasurement,
                         Errors errors,
                         @RequestParam int aDistance,
                         @RequestParam double aLatitude,
                         @RequestParam double aLongitude) {
        model.addAttribute("title", "Current readings at the given location");

        return "result";
    }
}
