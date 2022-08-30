package devneutro.space.weatherapi.model;

import lombok.Data;

@Data
public class AllWeather {

    private Clouds clouds;
    private Coord coord;
    private Main main;
    private Sys sys;
    private Weather weather;
    private Wind wind;

    private String base;
    private Integer visibility;
    private Integer timezone;
    private Integer id;
    private Integer dt;
    private String name;
    private Integer cod;
}
