package devneutro.space.weatherapi.controller;

import devneutro.space.weatherapi.model.*;
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

    @GetMapping("main/{city}")
    public Main getMain(@PathVariable String city){

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

    @GetMapping("sys/{city}")
    public Sys getSys(@PathVariable String city){

        RestTemplate restTemplate = new RestTemplate();

        StringBuilder stringBuilder = new StringBuilder();
        String url = stringBuilder.append(urlApi)
                .append(city)
                .append("&appid=")
                .append(apiKey).toString();

        List<Weather> weathers = new ArrayList<>();

        ResponseEntity<BodyWeather> entity = restTemplate.getForEntity(url, BodyWeather.class);

        System.out.println(entity.getBody().getMain().getTemp());

        return entity.getBody().getSys();
    }
    @GetMapping("coord/{city}")
    public Coord getCoord(@PathVariable String city){

        RestTemplate restTemplate = new RestTemplate();

        StringBuilder stringBuilder = new StringBuilder();
        String url = stringBuilder.append(urlApi)
                .append(city)
                .append("&appid=")
                .append(apiKey).toString();

        List<Weather> weathers = new ArrayList<>();

        ResponseEntity<BodyWeather> entity = restTemplate.getForEntity(url, BodyWeather.class);

        System.out.println(entity.getBody().getMain().getTemp());

        return entity.getBody().getCoord();
    }
    @GetMapping("weather/{city}")
    public List<Weather> getWeather(@PathVariable String city){

        RestTemplate restTemplate = new RestTemplate();

        StringBuilder stringBuilder = new StringBuilder();
        String url = stringBuilder.append(urlApi)
                .append(city)
                .append("&appid=")
                .append(apiKey).toString();

        List<Weather> weathers = new ArrayList<>();

        ResponseEntity<BodyWeather> entity = restTemplate.getForEntity(url, BodyWeather.class);

        System.out.println(entity.getBody().getMain().getTemp());

        return entity.getBody().getWeather();
    }

    @GetMapping("clouds/{city}")
    public Clouds getClouds(@PathVariable String city){

        RestTemplate restTemplate = new RestTemplate();

        StringBuilder stringBuilder = new StringBuilder();
        String url = stringBuilder.append(urlApi)
                .append(city)
                .append("&appid=")
                .append(apiKey).toString();

        List<Weather> weathers = new ArrayList<>();

        ResponseEntity<BodyWeather> entity = restTemplate.getForEntity(url, BodyWeather.class);

        System.out.println(entity.getBody().getMain().getTemp());

        return entity.getBody().getClouds();
    }
    @GetMapping("rain/{city}")
    public Rain getRain(@PathVariable String city){

        RestTemplate restTemplate = new RestTemplate();

        StringBuilder stringBuilder = new StringBuilder();
        String url = stringBuilder.append(urlApi)
                .append(city)
                .append("&appid=")
                .append(apiKey).toString();

        List<Weather> weathers = new ArrayList<>();

        ResponseEntity<BodyWeather> entity = restTemplate.getForEntity(url, BodyWeather.class);

        System.out.println(entity.getBody().getMain().getTemp());

        return entity.getBody().getRain();
    }
    @GetMapping("wind/{city}")
    public Wind getWind(@PathVariable String city){

        RestTemplate restTemplate = new RestTemplate();

        StringBuilder stringBuilder = new StringBuilder();
        String url = stringBuilder.append(urlApi)
                .append(city)
                .append("&appid=")
                .append(apiKey).toString();

        List<Weather> weathers = new ArrayList<>();

        ResponseEntity<BodyWeather> entity = restTemplate.getForEntity(url, BodyWeather.class);

        System.out.println(entity.getBody().getMain().getTemp());

        return entity.getBody().getWind();
    }

    @GetMapping("bodyweather/{city}")
    public BodyWeather getBodyWeather(@PathVariable String city){

        RestTemplate restTemplate = new RestTemplate();

        StringBuilder stringBuilder = new StringBuilder();
        String url = stringBuilder.append(urlApi)
                .append(city)
                .append("&appid=")
                .append(apiKey).toString();

        List<Weather> weathers = new ArrayList<>();

        ResponseEntity<BodyWeather> entity = restTemplate.getForEntity(url, BodyWeather.class);

        System.out.println(entity.getBody().getMain().getTemp());

        return entity.getBody();
    }

}
