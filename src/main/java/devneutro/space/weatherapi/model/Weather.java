package devneutro.space.weatherapi.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Data;
@Data
@JsonDeserialize
public class Weather {
    private Integer id;
    private String main;
    private String description;
    private String icon;
}
