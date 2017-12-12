package com.thiele.project.Network;

import com.google.gson.Gson;
import com.thiele.project.Serialization.FixerModel;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import java.util.zip.GZIPInputStream;

public class Fixer {
    private static final String API_URL="https://api.fixer.io/latest";

    public static FixerModel retrieveCurrentRates() throws Exception {
        HttpURLConnection connection = (HttpURLConnection) new URL(API_URL).openConnection();

        connection.setRequestMethod("GET");

        connection.setInstanceFollowRedirects(true);

        Scanner scanner = new Scanner("gzip".equals(connection.getContentEncoding()) ? new GZIPInputStream(connection.getInputStream()) : connection.getInputStream(), "UTF-8").useDelimiter("\\A");

        String ApiResponse = scanner.hasNext() ? scanner.next() : "";

        System.out.println(ApiResponse);

        return new Gson().fromJson(ApiResponse, FixerModel.class);
    }
//TODO: Implement different base currency
    //TODO: Implement specific rate symbols
    //TODO: Implement historic data
}


