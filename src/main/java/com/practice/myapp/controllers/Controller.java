package com.practice.myapp.controllers;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.practice.myapp.models.AirQuality;
import com.practice.myapp.models.GMap;
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
import java.net.URLEncoder;
import java.util.Collection;

@org.springframework.stereotype.Controller
@RequestMapping("/")
public class Controller {

    private String BaseURL = "https://api.safecast.org/measurements.json";
    private String AqiURL = "https://api.airvisual.com/v2/nearest_city";
    private String geoURL = "https://maps.googleapis.com/maps/api/geocode/json";
    private String decodedString;
    private String json;
    private String aqiDecodedString;
    private String aqiJson;
    private String geoDecodedString;
    private String geoJson;
    private String mapsKey = "AIzaSyDen0WZLZt-OQ68yU5D5uoNb7sr34mdycQ";
    private String aqiKey = "3RDkWgP8CSpxMTGFM";
    private String geocode;


    @RequestMapping(value = "", method = RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute("title", "Pick A Location");
        model.addAttribute("key", "https://maps.googleapis.com/maps/api/js?key=" + mapsKey + "&callback=initMap");
        model.addAttribute("gmap", new GMap());

        return "index";
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public String mapsSearch(Model model, @ModelAttribute @Valid GMap newMap, Errors
                             errors) throws IOException {
        if (errors.hasErrors()) {
            model.addAttribute("title", "Pick A Location");
            return "index";
        }

        String result = newMap.getAddress();
        geoJson = "";
        geoDecodedString = "";

        geocode = URLEncoder.encode(result, "UTF-8");

        HttpsURLConnection geoCall = (HttpsURLConnection) (new URL(geoURL + "?address=" + geocode).openConnection());
        geoCall.setRequestProperty("Content-Type", "application/json");
        geoCall.setRequestProperty("Accept", "application/json");
        geoCall.setRequestMethod("GET");
        geoCall.connect();

        try {
            BufferedReader inreader = new BufferedReader(new InputStreamReader(geoCall.getInputStream()));
            while ((geoDecodedString=inreader.readLine()) != null) {
                geoJson+=geoDecodedString;
            }
            inreader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        geoCall.disconnect();


        model.addAttribute("title", "Result of this search");
        model.addAttribute("address", geoJson);
        return "maps-search";
    }

    @RequestMapping(value = "/manual", method=RequestMethod.GET)
    public String manualSearch(Model model) {
        model.addAttribute("title", "Pick A Location");
        model.addAttribute("measurements", new Measurements());

        return "manual-search";
    }

    @RequestMapping(value = "/manual", method = RequestMethod.POST)
    public String manualResult(Model model,
                         @ModelAttribute @Valid Measurements newMeasurement,
                         Errors errors) throws IOException {

        if (errors.hasErrors()) {
            model.addAttribute("title", "Pick A Location");
            return "manual-search";
        }

        decodedString = "";
        json = "";
        aqiDecodedString = "";
        aqiJson = "";
        int aDistance = 1000;
        double aLatitude = newMeasurement.getRadLat();
        double aLongitude = newMeasurement.getRadLng();

        Gson gson = new Gson();

        HttpsURLConnection scCall = (HttpsURLConnection) (new URL(BaseURL + "?distance=" + aDistance
            + "&latitude=" + aLatitude + "&longitude=" + aLongitude).openConnection());
        scCall.setRequestProperty("Content-Type", "application/json");
        scCall.setRequestProperty("Accept", "application/json");
        scCall.setRequestMethod("GET");
        scCall.connect();

        try {
            BufferedReader inreader = new BufferedReader(new InputStreamReader(scCall.getInputStream()));
            while ((decodedString=inreader.readLine()) != null) {
                json+=decodedString;
            }
            inreader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        scCall.disconnect();

        HttpsURLConnection aqiCall = (HttpsURLConnection) (new URL(AqiURL + "?lat=" + aLatitude
            + "&lon=" + aLongitude + "&key=" + aqiKey)).openConnection();
        aqiCall.setRequestProperty("Content-Type", "application/json");
        aqiCall.setRequestProperty("Accept", "application/json");
        aqiCall.setRequestMethod("GET");
        aqiCall.connect();

        try {
            BufferedReader aqiReader = new BufferedReader(new InputStreamReader(aqiCall.getInputStream()));
            while ((aqiDecodedString=aqiReader.readLine()) != null) {
                aqiJson+=aqiDecodedString;
            }
            aqiReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        aqiCall.disconnect();

        Type collectionType = new TypeToken<Collection<Measurements>>(){}.getType();
        Collection<Measurements> safeCastReturns = gson.fromJson(json, collectionType);

        AirQuality airVisualReturn = gson.fromJson(aqiJson, AirQuality.class);

        model.addAttribute("title", "Current readings at the given location");
        model.addAttribute("return", safeCastReturns);
        model.addAttribute("latitude", aLatitude);
        model.addAttribute("longitude", aLongitude);
        model.addAttribute("key", mapsKey);
        model.addAttribute("aqi", airVisualReturn);

        return "result";
    }
}
