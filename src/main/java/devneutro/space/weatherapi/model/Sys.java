package devneutro.space.weatherapi.model;

import lombok.Data;

@Data
public class Sys {

    private String country;
    private Integer sunrise;
    private Integer sunset;
}
