package com.thiele.project;

import com.thiele.project.Network.Fixer;
import com.thiele.project.Serialization.FixerModel;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        try {
            FixerModel currentRates = Fixer.retrieveCurrentRates();
            HashMap<String, Double> rates = currentRates.getRates();

            Double triangleCalculation = (rates.get("USD") / rates.get("AUD")) * (rates.get("JPY") / rates.get("USD"));

            Double triangleCalculationRight = rates.get("JPY") / rates.get("AUD");

            if (triangleCalculation.equals(triangleCalculationRight)) {
                System.out.println("Equation Works");
            } else {
                System.out.println("Arbitrage Opportunity");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            FixerModel currentRates = Fixer.retrieveCurrentRates();
            HashMap<String, Double> rates = currentRates.getRates();

            Double triangleCalculation = (rates.get("AUD") / rates.get("USD")) * (rates.get("JPY") / rates.get("AUD"));

            Double triangleCalculationRight = rates.get("JPY") / rates.get("USD");

            if (triangleCalculation.equals(triangleCalculationRight)) {
                System.out.println("Equation Works");
            } else {
                System.out.println("Arbitrage Opportunity");
            }

        } catch (Exception a) {
            a.printStackTrace();
        }
        try {
            FixerModel currentRates = Fixer.retrieveCurrentRates();
            HashMap<String, Double> rates = currentRates.getRates();

            Double triangleCalculation = (rates.get("JPY") / rates.get("USD")) * (rates.get("AUD") / rates.get("JPY"));

            Double triangleCalculationRight = rates.get("AUD") / rates.get("USD");

            if (triangleCalculation.equals(triangleCalculationRight)) {
                System.out.println("Equation Works");
            } else {
                System.out.println("Arbitrage Opportunity");
            }

        } catch (Exception b) {
            b.printStackTrace();
        }
    }
}


