package devneutro.space.weatherapi.model;

import lombok.Data;

import java.util.List;

@Data
public class BodyWeather {

    private Clouds clouds;
    private Coord coord;
    private Main main;
    private Rain rain;
    private Sys sys;
    private List<Weather> weather;
    private Wind wind;

    private String base;
    private Integer visibility;
    private Integer dt;
    private Integer timezone;
    private Long id;
    private String name;
    private Integer cod;
}
