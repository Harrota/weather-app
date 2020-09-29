package com.harrota.model;

public class Day {
    private Double temp;
    private Double MinTemp;
    private Double MaxTemp;
    private String weather;
    private String weatherDesc;
    private Double wind;

    public Day(Double temp, Double minTemp, Double maxTemp, String weather, String weatherDesc, Double wind) {
        this.temp = temp;
        MinTemp = minTemp;
        MaxTemp = maxTemp;
        this.weather = weather;
        this.weatherDesc = weatherDesc;
        this.wind = wind;
    }

    public Double getTemp() {
        return temp;
    }

    public void setTemp(Double temp) {
        this.temp = temp;
    }

    public Double getMinTemp() {
        return MinTemp;
    }

    public void setMinTemp(Double minTemp) {
        MinTemp = minTemp;
    }

    public Double getMaxTemp() {
        return MaxTemp;
    }

    public void setMaxTemp(Double maxTemp) {
        MaxTemp = maxTemp;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public String getWeatherDesc() {
        return weatherDesc;
    }

    public void setWeatherDesc(String weatherDesc) {
        this.weatherDesc = weatherDesc;
    }

    public Double getWind() {
        return wind;
    }

    public void setWind(Double wind) {
        this.wind = wind;
    }
}
