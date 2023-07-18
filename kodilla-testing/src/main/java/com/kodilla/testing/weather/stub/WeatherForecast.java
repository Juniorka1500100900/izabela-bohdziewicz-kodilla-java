package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0); // [1]
        }
        return resultMap;
    }
    public Double averageTemperature(){
        Double result = 0.0;
        int counter = 0;

        for(Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()){
            counter++;
            result = result + temperature.getValue();
        }
        return result/counter;
    }
    public Double medianTemperature(){
        List<Double> temporaryTemperature = new ArrayList<>();
        Double result = 0.0;
        Double average = 0.0;

        for(Map.Entry<String,Double> temperature : temperatures.getTemperatures().entrySet()){
            temporaryTemperature.add(temperature.getValue());
        }

        Collections.sort(temporaryTemperature);
        if(temporaryTemperature.size() % 2 == 0){
            average = temporaryTemperature.get(temporaryTemperature.size()/2) + temporaryTemperature.get(temporaryTemperature.size()/2 - 1);
            result = average / 2;
        } else {
            result = temporaryTemperature.get(temporaryTemperature.size()/2);
        }
        return result;
    }
}