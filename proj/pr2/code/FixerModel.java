package com.thiele.project.Serialization;

import java.util.HashMap;


public class FixerModel {

    private String base;
    private String date;
    private HashMap<String,Double> rates;

    public String getBase() {
        return base;

    }

    public String getDate() {
        return date;
    }

    public HashMap<String,Double> getRates() {
        return rates;
    }

    public FixerModel(String base, String date, HashMap<String,Double> rates) {
        this.base = base;
        this.date = date;
        this.rates = rates;
    }


}
