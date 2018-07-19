package com.practice.myapp.controllers;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.practice.myapp.models.Measurements;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.net.ssl.HttpsURLConnection;
import javax.validation.Valid;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.URL;
import java.util.Collection;

@org.springframework.stereotype.Controller
@RequestMapping("/")
public class Controller {

    private String BaseURL;
    private String decodedString;
    private String json;
    private String mapsKey = "AIzaSyDen0WZLZt-OQ68yU5D5uoNb7sr34mdycQ";


    @RequestMapping(value = "", method = RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute("title", "Pick A Location");
        model.addAttribute("measurements", new Measurements());

        return "index";
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public String result(Model model,
                         @ModelAttribute @Valid Measurements newMeasurement,
                         Errors errors) throws IOException {

        if (errors.hasErrors()) {
            model.addAttribute("title", "Pick A Location");
            return "index";
        }

        decodedString = "";
        json = "";
        //apiReturns.clear();
        int aDistance = newMeasurement.getDistance();
        double aLatitude = newMeasurement.getLatitude();
        double aLongitude = newMeasurement.getLongitude();

        BaseURL = "https://api.safecast.org/measurements.json";

        Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();

        HttpsURLConnection apiCall = (HttpsURLConnection) (new URL(BaseURL + "?distance=" + aDistance
            + "&latitude=" + aLatitude + "&longitude=" + aLongitude).openConnection());
        apiCall.setDoOutput(true);
        apiCall.setRequestProperty("Content-Type", "application/json");
        apiCall.setRequestProperty("Accept", "application/json");
        apiCall.setRequestMethod("GET");
        apiCall.connect();

        BufferedReader inreader = new BufferedReader(new InputStreamReader(apiCall.getInputStream()));
        while ((decodedString = inreader.readLine()) != null) {
            json += decodedString;
        }

        inreader.close();
        apiCall.disconnect();

        Type collectionType = new TypeToken<Collection<Measurements>>(){}.getType();
        Collection<Measurements> safeCastReturns = gson.fromJson(json, collectionType);


        model.addAttribute("title", "Current readings at the given location");
        model.addAttribute("return", safeCastReturns);
        model.addAttribute("latitude", aLatitude);
        model.addAttribute("longitude", aLongitude);
        model.addAttribute("key", mapsKey);

        return "result";
    }
}
