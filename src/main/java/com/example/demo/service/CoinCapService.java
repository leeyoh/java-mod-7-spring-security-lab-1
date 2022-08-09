package com.example.demo.service;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.Serializable;
import java.sql.SQLOutput;
import java.util.List;

@Service
public class CoinCapService {
    public String getBitcoinPrice(){
        String apiURL = "https://api.coincap.io/v2/assets/bitcoin";
        RestTemplate restTemplate = new RestTemplate();
        Bitcoin res = restTemplate.getForObject(apiURL, Bitcoin.class);
        return res.data.priceUsd;
    }
}

class Bitcoin{
    public String timestamp;
    public Data data;
}
@Getter
@Setter
class Data {
    public String priceUsd;
    public String marketCapUsd;
    public String name;
}