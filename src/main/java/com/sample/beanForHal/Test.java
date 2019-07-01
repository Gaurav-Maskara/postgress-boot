package com.sample.beanForHal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

import com.consumer.beans.Joke;
import com.consumer.beans.Quote;

public class Test {

    private static final Logger log = LoggerFactory.getLogger(Test.class);

    public static void main(String args[]) {
        RestTemplate restTemplate = new RestTemplate();
      //  Quote quote = restTemplate.getForObject("https://gturnquist-quoters.cfapps.io/api/random", Quote.class);
        
        String  quote = restTemplate.getForObject("https://api.adviceslip.com/advice", String.class);
        
        log.info(quote.toString());
 }
        
        
}

