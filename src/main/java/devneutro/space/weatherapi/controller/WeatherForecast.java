package devneutro.space.weatherapi.controller;

import devneutro.space.weatherapi.model.BodyWeather;
import devneutro.space.weatherapi.model.Main;
import devneutro.space.weatherapi.model.Weather;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/weather")
public class WeatherForecast {

    @Value("${api.key}")
    private String apiKey;

    @Value("${url.api}")
    private String urlApi;

    @GetMapping("/{city}")
    public Main getWeather(@PathVariable String city){

        RestTemplate restTemplate = new RestTemplate();

        StringBuilder stringBuilder = new StringBuilder();
        String url = stringBuilder.append(urlApi)
                .append(city)
                .append("&appid=")
                .append(apiKey).toString();

        List<Weather> weathers = new ArrayList<>();

        ResponseEntity<BodyWeather> entity = restTemplate.getForEntity(url, BodyWeather.class);

        System.out.println(entity.getBody().getMain().getTemp());

        return entity.getBody().getMain();
    }
}
