package devneutro.space.weatherapi.controller;

import devneutro.space.weatherapi.model.AllWeather;
import devneutro.space.weatherapi.model.Main;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/tempo")
public class SearchWeather {

    @Value("${api.key}")
    private String apiKey;

    @Value("${api.url}")
    private String urlApi;

    @GetMapping("/{cidade}")
    public Main searchCity(@PathVariable String cidade){

        RestTemplate restTemplate = new RestTemplate();
        StringBuilder stringBuilder = new StringBuilder();

        String urlFinal = stringBuilder.append(urlApi)
                .append(cidade).append("&appid=")
                .append(apiKey).toString();

        ResponseEntity<AllWeather> entity = restTemplate.getForEntity(urlFinal, AllWeather.class);

        return entity.getBody().getMain();
    }
}
