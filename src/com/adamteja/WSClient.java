package com.adamteja;

import com.adamteja.webservicex.globalweather.*;



public class WSClient {

    static GlobalWeather service = new GlobalWeather();
    static GlobalWeatherSoap ws = service.getGlobalWeatherSoap();


    public static void main(String[] args) {

        System.out.println(" JAX Client");

        try {
            WSClient client = new WSClient();
            client.doTest(args);
        } catch(Exception e) {
            e.printStackTrace();
        }

    }


    public void doTest(String[] args) {
        try {

            String response = ws.getWeather("Atlanta","United States").toString();
            System.out.println("response: "+response);

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
