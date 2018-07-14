package com.cloud.betterconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class BetterConsumerApplication {

	/*相当于bean里边的那几句话

	private RestTemplate restTemplate=new RestTemplate();
	*/
	@Bean/*将实例化一个restTemplate*/
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}

	public static void main(String[] args) {
		SpringApplication.run(BetterConsumerApplication.class, args);
	}
}
